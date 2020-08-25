package br.com.projeto.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.projeto.beans.Cargo;
import br.com.projeto.conexao.Conexao;
/*
 * DAO => classe respons�vel por manipular os dados no Banco de Dados
 * Nela deve ter o CRUD (Create - Read - Update - Delete)
 * 
 */
public class CargoDAO {
	
	private Connection con;
	private PreparedStatement stmt;
	private ResultSet rs;
	
	public CargoDAO() throws Exception {
		con = Conexao.conectar();
	}
	
	public void fechar() throws Exception {
		con.close();
	}
	
	public int add(Cargo objeto) throws Exception {
		stmt = con.prepareStatement
				("INSERT INTO TB_CARGO (NR_ID, NM_CARGO, VL_SALARIO, NM_NIVEL) VALUES (?, ?, ?, ?)");
		stmt.setInt(1, objeto.getId());
		stmt.setString(2, objeto.getNome());
		stmt.setDouble(3, objeto.getSalario());
		stmt.setString(4, objeto.getNivel());
		// execute() ou executeUpdate() => com sql's: INSERT, DELETE ou UPDATE
		return stmt.executeUpdate();
	}
	
	public int delete(int id) throws Exception {
		stmt = con.prepareStatement
				("DELETE FROM TB_CARGO WHERE NR_ID = ?");
		stmt.setInt(1, id);
		return stmt.executeUpdate();
	}

}