package br.com.projeto.implementacao;

import java.sql.Connection;
import javax.swing.JOptionPane;
import br.com.projeto.conexao.Conexao;
import br.com.projeto.exception.Excecao;

public class TesteConexao {

	public static void main(String[] args) {
		
		Connection c = null;
		
		try {
			new Conexao();
			c = Conexao.conectar();
			JOptionPane.showMessageDialog(null, "*** Abriu conexão ***");
		} catch (Exception e) {
			System.out.println(Excecao.tratarExcecao(e));
			e.printStackTrace();
		} finally {
			try {
				c.close();
			} catch (Exception e) {
				System.out.println(Excecao.tratarExcecao(e));
			}
		}
	}
}