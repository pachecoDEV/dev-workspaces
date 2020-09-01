package br.com.projeto.crud;

import java.sql.Connection;
import java.sql.PreparedStatement;

import br.com.projeto.conexao.Conexao;
import br.com.projeto.nambiquara.statusProcesso;

public class CRUDProcesso {
	
	private Connection con;
	private PreparedStatement stmt;
	
	public CRUDProcesso() throws Exception {
		con = Conexao.conectar();
	}
	
	public void fechar() throws Exception {
		con.close();
	}
	
	public int add(statusProcesso objeto) throws Exception {
		stmt = con.prepareStatement
				("INSERT INTO TB_PROCESSO"
						+ "(ST_DOC, ST_PROVPRAT, ST_CONTRATA, ID");
		stmt.setString(1, objeto.getStatusDocumentacao());
		stmt.setString(2, objeto.getStatusProvaPratica());
		stmt.setString(3, objeto.getStatusContratacao());
		stmt.setInt(4, objeto.getId());
		
		return stmt.executeUpdate();
	}
	
	public int delete(int id) throws Exception {
		stmt = con.prepareStatement
				("DELETE FROM TB_PROCESSO WHERE ID = ?");
		stmt.setInt(1, id);
		return stmt.executeUpdate();
	}
	
	public int modificaProvPrat(String modProvPrat) throws Exception {
		stmt = con.prepareStatement
				("UPDATE TB_PROCESSO SET ST_PROVPRAT = ? WHERE ID = ?");
		stmt.setString(1, modProvPrat);
		stmt.setString(2, modProvPrat);
		return stmt.executeUpdate();
	}

}
