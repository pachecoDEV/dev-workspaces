package br.com.rh.projeto.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.rh.projeto.beans.Pessoa;
import br.com.rh.projeto.conexao.Conexao;

public class PessoaDAO {
	private Connection con;
	private PreparedStatement stmt;
	private ResultSet rs;
	
	public PessoaDAO() throws Exception{
		con = Conexao.conectar();
	}
	
	public void fechar() throws Exception {
		con.close();
	}
	
	public int add (Pessoa objeto) throws Exception {
		stmt = con.prepareStatement
				("INSERT INTO TB_PESSOA"
						+ "(ID_PESSOA, CPF, CNPJ, NM_PESSOA, TELEFONE, TIPO_USUARIO)"
						+ "VALUES (?, ?, ?, ?, ?, ?)");
		stmt.setInt(1, objeto.getIdPessoa());
		stmt.setString(2, objeto.getCpf());
		stmt.setString(3, objeto.getCnpj());
		stmt.setString(4, objeto.getNome());
		stmt.setString(5, objeto.getTelefone());
		stmt.setString(6, objeto.getTipoUsuario());
		
		return stmt.executeUpdate();
	}
	
	public int delete(int idPessoa) throws Exception {
		stmt = con.prepareStatement
				("DELETE FROM TB_PESSOA WHERE ID_PESSOA = ?");
		stmt.setInt(1, idPessoa);
		
		return stmt.executeUpdate();
	}
	
	public int update(String telefone, int idPessoa) throws Exception {
		stmt = con.prepareStatement
				("UPDATE TB_PESSOA SET TELEFONE=? WHERE ID_PESSOA=?");
		stmt.setString(1, telefone);
		stmt.setInt(2, idPessoa);
		return stmt.executeUpdate();
	}
	
	public Pessoa getPessoa(int idPessoa) throws Exception{
		stmt = con.prepareStatement
				("SELECT * FROM TB_PESSOA WHERE ID_PESSOA=?");
		stmt.setInt(1, idPessoa);
		rs = stmt.executeQuery();
		if (rs.next()) {
			return new Pessoa(
					rs.getInt("ID_PESSOA"),
					rs.getString("CPF"),
					rs.getString("CNPJ"),
					rs.getString("NM_PESSOA"),
					rs.getString("TELEFONE"),
					rs.getString("TIPO_USUARIO"));
		}
		
		return new Pessoa();
	}

}
