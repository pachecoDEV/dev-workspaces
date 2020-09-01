package br.com.projeto.crud;

import java.sql.Connection;
import java.sql.PreparedStatement;

import br.com.projeto.conexao.Conexao;
import br.com.projeto.nambiquara.dadosVaga;

public class CRUDVagas {
	
	private Connection con;
	private PreparedStatement stmt;
	
	public CRUDVagas() throws Exception {
		con = Conexao.conectar();
	}
	
	public void fechar() throws Exception {
		con.close();
	}
	
	public int add(dadosVaga objeto) throws Exception {
		stmt = con.prepareStatement
				("INSERT INTO TB_VAGAS ("
						+ "ID_VAGA, "
						+ "DET_VAGA, "
						+ "CURSO, "
						+ "CERTIFICADO, "
						+ "IDIOMA, "
						+ "DEFICIENCIA, "
						+ "DEPARTAMENTO, "
						+ "PROVA_PRAT) "
						+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
		stmt.setString(1, objeto.getId());
		stmt.setString(2, objeto.getDetalhesVaga());
		stmt.setString(3, objeto.getCurso());
		stmt.setString(4, objeto.getCertificado());
		stmt.setString(5, objeto.getIdioma());
		stmt.setString(6, objeto.getDeficiencia());
		stmt.setString(7, objeto.getDepartamento());
		stmt.setString(8, objeto.getProvaPratica());
		
		return stmt.executeUpdate();
	}
	
	public int delete(int id) throws Exception {
		stmt = con.prepareStatement
				("DELETE FROM TB_VAGAS WHERE ID_VAGA = ?");
		stmt.setInt(1, id);
		return stmt.executeUpdate();
	}
	
	public int update(String modProvPrat) throws Exception {
		stmt = con.prepareStatement
				("UPDATE TB_VAGAS SET PROVA_PRAT = 'O LOCO BICHO' WHERE ID_VAGA = ?");
		stmt.setString(1, modProvPrat);
		return stmt.executeUpdate();
	}

}