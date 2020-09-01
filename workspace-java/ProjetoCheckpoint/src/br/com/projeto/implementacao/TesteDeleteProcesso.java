package br.com.projeto.implementacao;

import javax.swing.JOptionPane;

import br.com.projeto.crud.CRUDProcesso;
import br.com.projeto.exception.Excecao;

public class TesteDeleteProcesso {

	public static void main(String[] args) {
		try {
			CRUDProcesso processo = new CRUDProcesso();
			
			System.out.println("Você apagou " +
					processo.delete(Integer.parseInt(JOptionPane.showInputDialog("ID"))) +
					" registro(s)");
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(Excecao.tratarExcecao(e));
		}

	}

}
