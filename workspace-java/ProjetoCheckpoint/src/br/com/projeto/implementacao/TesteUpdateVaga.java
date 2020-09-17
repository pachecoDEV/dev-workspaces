package br.com.projeto.implementacao;

import br.com.projeto.exception.Excecao;

import javax.swing.JOptionPane;

import br.com.projeto.crud.CrudVagas;

public class TesteUpdateVaga {

	public static void main(String[] args) {
		try {
			CrudVagas vaga = new CrudVagas();

			System.out.println(vaga.update(
					JOptionPane.showInputDialog("Digite o ID")) +
					" itens(s) foi(ram) alterado(s).");
			
			vaga.fechar();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(Excecao.tratarExcecao(e));
		}

	}

}