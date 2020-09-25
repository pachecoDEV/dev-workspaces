package br.com.rh.projeto.implementacao;

import javax.swing.JOptionPane;

import br.com.rh.projeto.dao.PessoaDAO;

public class TesteDeletePessoa {

	public static void main(String[] args) {
		try {
			PessoaDAO dao = new PessoaDAO();
			System.out.println("Voce apagou: " + 
					dao.delete(Integer.parseInt(JOptionPane.showInputDialog("ID"))) + 
					" pessoa(s)!");
			dao.fechar();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
