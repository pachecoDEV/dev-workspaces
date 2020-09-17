package br.com.projeto.implementacao;

import javax.swing.JOptionPane;

import br.com.projeto.crud.CrudProcesso;
import br.com.projeto.exception.Excecao;

public class TesteDeleteProcesso {

	public static void main(String[] args) {
		try {
			CrudProcesso processo = new CrudProcesso();
			
			System.out.println("Voc� apagou " +
					processo.delete(Integer.parseInt(JOptionPane.showInputDialog("ID"))) +
					" registro(s)");
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(Excecao.tratarExcecao(e));
		}

	}

}
