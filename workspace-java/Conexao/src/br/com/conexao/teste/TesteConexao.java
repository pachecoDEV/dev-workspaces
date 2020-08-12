package br.com.conexao.teste;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

import javax.swing.JOptionPane;

import br.com.conexao.exception.Excecao;

public class TesteConexao {

	public static void main(String[] args) {
		
		Connection fiap = null;
		Statement estrutura = null;
		ResultSet resultado = null;
		
		try {
			fiap = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "rm85657", "160185");
			JOptionPane.showMessageDialog(null, "Abriu Conexão!!!");
			estrutura = fiap.createStatement();
			resultado = estrutura.executeQuery("select * from TB_CLIENTE");
			
			resultado.next();
			JOptionPane.showMessageDialog(null, resultado.getInt("ID") + " " + resultado.getString("NOME") + " " + resultado.getInt("ESTRELAS"));
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, Excecao.tratarExcecao(e));
			e.printStackTrace();
			
		} finally {
			try {
				fiap.close();
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, Excecao.tratarExcecao(e));
			}
		}
	}
}