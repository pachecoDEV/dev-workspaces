package br.com.fiap.teste;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

import br.com.fiap.bean.Cliente;
import br.com.fiap.connection.ConnectionFactory;

public class Teste {

	public static void main(String[] args) throws ParseException, java.text.ParseException{
		
		ConnectionFactory cf = new ConnectionFactory();
		try {
			Connection con = cf.DBConnectionManager();
			Cliente cli = new Cliente("Pacheco", "Couto", new SimpleDateFormat("yyyy-MM-dd").parse("1985-01-16"),
					'm', "(11)95041-3721");
			// Criando a instrução SQL
	    	String sql = "INSERT INTO TBL_CLIENTE VALUES(SEQ_CLIENTE_A.NEXTVAL,?,?,TO_DATE(?,'YYYY-MM-DD'),?,?)";
	    	
			// Criando a conexão
			PreparedStatement ps = con.prepareStatement(sql);
			// Populando a conexão com o objeto
			ps.setString(1, cli.getNome());
			ps.setString(2, cli.getSobrenome());
			ps.setString(3, new SimpleDateFormat("yyy-MM-dd").format(cli.getDataNasc()));
			ps.setString(4, String.valueOf(cli.getGenero()));
			ps.setString(5, cli.getTelefone());
			// Gerando o retorno para avaliação
			int status = ps.executeUpdate();
						
			System.out.println("STATUS : " + status);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
