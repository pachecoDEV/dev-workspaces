package br.com.projeto.crud;

import java.sql.Connection;
import java.sql.PreparedStatement;

import br.com.projeto.conexao.Conexao;
import br.com.projeto.nambiquara.templateUsuario;

public class CRUDUsuario {
	
	private Connection con;
	private PreparedStatement stmt;
	
	public CRUDUsuario() throws Exception {
		con = Conexao.conectar();
	}
	
	public void fechar() throws Exception {
		con.close();
	}
	
	public int add(templateUsuario objeto) throws Exception {
		stmt = con.prepareStatement
				("INSERT INTO TB_USUARIO"
						+ "(CPF, NOME, EMAIL, ENDERECO, TELEFONE, CURSO, "
						+ "CERTIFICACAO, IDIOMA, LOGIN, PRET_SAL, "
						+ "DEFICIENCIA, SENHA, CARGO, DEPARTAMENTO, NIVEL) "
						+ "VALUES (?, ?, ?, ?, ?, ?, ?, "
						+ "?, ?, ?, ?, ?, ?, ?, ?)");
		stmt.setString(1, objeto.getCpf());
		stmt.setString(2, objeto.getNome());
		stmt.setString(3, objeto.getEmail());
		stmt.setString(4, objeto.getEndereco());
		stmt.setString(5, objeto.getTelefone());
		stmt.setString(6, objeto.getCurso());
		stmt.setString(7, objeto.getCertificacao());
		stmt.setString(8, objeto.getIdioma());
		stmt.setString(9, objeto.getLogin());
		stmt.setString(10, objeto.getPretencaoSalarial());
		stmt.setBoolean(11, objeto.getIsDeficiencia());
		stmt.setString(12, objeto.getSenha());
		stmt.setString(13, objeto.getCargo());
		stmt.setString(14, objeto.getDepartamento());
		stmt.setString(15, objeto.getNivel());
		
		return stmt.executeUpdate();
	}
	
	public int delete(int cpf) throws Exception {
		stmt = con.prepareStatement
				("DELETE FROM TB_USUARIO WHERE CPF = ?");
		stmt.setInt(1, cpf);
		return stmt.executeUpdate();
	}
	
	public int modificaPretSal(String modPretSal) throws Exception {
		stmt = con.prepareStatement
				("UPDATE TB_USUARIO SET PRET_SAL = PRET_SAL * 1.1 WHERE CPF = ?");
		stmt.setString(1, modPretSal);
		return stmt.executeUpdate();
	}

}