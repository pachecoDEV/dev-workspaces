package br.com.projeto.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.projeto.beans.Produto;
import br.com.projeto.conexao.Conexao;

public class ProdutoDAO {
	
	private Connection con;
	private PreparedStatement stmt;
	private ResultSet rs;
	
	public ProdutoDAO() throws Exception {
		con = Conexao.conectar();
	}
	
	public void fechar() throws Exception {
		con.close();
	}
	
	public int cadastrar(Produto objeto) throws Exception {
		stmt = con.prepareStatement
				("INSERT INTO TB_PRODUTO (ID, VALORCOMPRA, VALORVENDA, QTDE, DESCRICAO) VALUES (?, ?, ?, ?, ?)");
		stmt.setInt(1, objeto.getId());
		stmt.setFloat(2, objeto.getValorCompra());
		stmt.setFloat(3, objeto.getValorVenda());
		stmt.setInt(4, objeto.getQtde());
		stmt.setString(5, objeto.getDescricao());
		return stmt.executeUpdate();
	}
	
	public int delete(int id) throws Exception {
		stmt = con.prepareStatement
				("DELETE FROM TB_PRODUTO WHERE ID = ?");
		stmt.setInt(1, id);
		return stmt.executeUpdate();
	}
	
	public Produto getDescricao(String descricao) throws Exception {
		stmt = con.prepareStatement
				("SELECT * FROM TB_PRODUTO WHERE DESCRICAO = '?'");
		stmt.setString(1, descricao);
		rs = stmt.executeQuery();
		if (rs.next()) {
			return new Produto(
					rs.getInt("ID"),
					rs.getInt("VALORCOMPRA"),
					rs.getInt("VALORVENDA"),
					rs.getInt("QTDE"),
					rs.getString("DESCRICAO")
			);
		}
		return new Produto();
	}
}
