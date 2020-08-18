package br.com.conexao.teste;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import br.com.conexao.exception.Excecao;

public class TesteConexao4 {

	public static void main(String[] args) {
		
		Connection fiap = null;
		PreparedStatement estrutura = null;
		ResultSet resultado = null;
		
		try {
			fiap = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "rm85657", "160185");
			JOptionPane.showMessageDialog(null, "Abriu Conexão!!!");
			estrutura = fiap.prepareStatement
					("SELECT * FROM TB_CLIENTE WHERE ID=? AND NOME=?");
			
			String nome = JOptionPane.showInputDialog("Digite um nome").toUpperCase();
			int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID"));
			
			estrutura.setInt(1, id);
			estrutura.setString(2, nome);
			// SQL INJECTION
			// ZE'OR='1'='1
			// 666
			resultado = estrutura.executeQuery();
						
			if(resultado.next()) {
				JOptionPane.showMessageDialog(null, nome + ", você está autorizado!");
			}else {
				JOptionPane.showMessageDialog(null, nome + ", seus dados não conferem!!!");
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
