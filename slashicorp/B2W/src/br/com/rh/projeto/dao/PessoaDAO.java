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
						+ "(CPF, CNPJ, NM_PESSOA, TELEFONE)"
						+ "VALUES (?, ?, ?, ?)");
		stmt.setString(1, objeto.getCpf());
		stmt.setString(2, objeto.getCnpj());
		stmt.setString(3, objeto.getNome());
		stmt.setString(4, objeto.getTelefone());
		
		return stmt.executeUpdate();
	}
	
	public int delete(String cpf) throws Exception {
		stmt = con.prepareStatement
				("DELETE FROM TB_PESSOA WHERE CPF = ?");
		stmt.setString(1, cpf);
		
		return stmt.executeUpdate();
	}
	
	public int update(String telefone, String cpf) throws Exception {
		stmt = con.prepareStatement
				("UPDATE TB_PESSOA SET TELEFONE=? WHERE CPF=?");
		stmt.setString(1, telefone);
		stmt.setString(2, cpf);
		return stmt.executeUpdate();
	}
	
	public Pessoa getPessoa(String cpf) throws Exception{
		stmt = con.prepareStatement
				("SELECT * FROM TB_PESSOA WHERE CPF=?");
		stmt.setString(1, cpf);
		rs = stmt.executeQuery();
		if (rs.next()) {
			return new Pessoa(
					rs.getString("CPF"),
					rs.getString("CNPJ"),
					rs.getString("NM_PESSOA"),
					rs.getString("TELEFONE"));
		}
		
		return new Pessoa();
	}

}
