package br.com.projeto.implementacao;

import javax.swing.JOptionPane;

import br.com.projeto.crud.CrudVagas;
import br.com.projeto.exception.Excecao;

public class TesteDeleteVaga {

	public static void main(String[] args) {
		try {
			CrudVagas vaga = new CrudVagas();
			
			System.out.println("Voc� apagou " +
					vaga.delete(Integer.parseInt(JOptionPane.showInputDialog("ID"))) +
					" registro(s)");
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(Excecao.tratarExcecao(e));
		}

	}

}
