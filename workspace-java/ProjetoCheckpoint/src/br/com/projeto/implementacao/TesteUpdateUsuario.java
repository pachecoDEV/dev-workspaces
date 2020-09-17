package br.com.projeto.implementacao;

import br.com.projeto.exception.Excecao;

import javax.swing.JOptionPane;

import br.com.projeto.crud.CrudUsuario;

public class TesteUpdateUsuario {

	public static void main(String[] args) {
		try {
			CrudUsuario usuario = new CrudUsuario();

			System.out.println(usuario.update(
					JOptionPane.showInputDialog("Digite o CPF")) +
					" itens(s) foi(ram) alterado(s).");
			
			usuario.fechar();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(Excecao.tratarExcecao(e));
		}

	}

}