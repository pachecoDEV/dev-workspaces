package br.com.conexao.teste;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import javax.swing.JOptionPane;
import br.com.conexao.exception.Excecao;

public class TesteConexao2 {

	public static void main(String[] args) {
		
		Connection fiap = null;
		Statement estrutura = null;
		ResultSet resultado = null;
		
		try {
			fiap = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "rm85657", "160185");
			JOptionPane.showMessageDialog(null, "Abriu Conexão!!!");
			estrutura = fiap.createStatement();
			
			String nome = JOptionPane.showInputDialog("Digite um nome").toUpperCase();
			
			resultado = estrutura.executeQuery("select * from TB_CLIENTE where NOME LIKE '%"+nome+"%'");
						
			while(resultado.next()) {
				JOptionPane.showMessageDialog(null, 
						"Nome............: " + resultado.getString("nome") + "\n" + 
						"Código..........: " + resultado.getInt("id") + "\n" + 
						"Classificação...: " + resultado.getInt("estrelas"));
			}
			
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
