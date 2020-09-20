package br.com.rh.projeto.implementacao;

import javax.swing.JOptionPane;

import br.com.rh.projeto.dao.PessoaDAO;

public class TesteDeletePessoa {

	public static void main(String[] args) {
		try {
			PessoaDAO dao = new PessoaDAO();
			System.out.println("Voce apagou: " + 
					dao.delete(JOptionPane.showInputDialog("CPF")) + 
					" pessoa(s)!");
			dao.fechar();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
