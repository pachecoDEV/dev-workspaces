package br.com.projeto.implementacao;

import br.com.projeto.exception.Excecao;

import javax.swing.JOptionPane;

import br.com.projeto.crud.CRUDProcesso;

public class TesteUpdateProcesso {

	public static void main(String[] args) {
		try {
			CRUDProcesso processo = new CRUDProcesso();

			System.out.println(processo.update(
					JOptionPane.showInputDialog("Digite o ID")) +
					" prova(s) prática(s) foi(ram) alterada(s).");
			
			processo.fechar();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(Excecao.tratarExcecao(e));
		}

	}

}
