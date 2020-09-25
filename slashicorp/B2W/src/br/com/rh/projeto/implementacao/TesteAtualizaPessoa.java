package br.com.rh.projeto.implementacao;

import javax.swing.JOptionPane;

import br.com.rh.projeto.dao.PessoaDAO;
import br.com.rh.projeto.excecao.Excecao;

public class TesteAtualizaPessoa {

	public static void main(String[] args) {
		try {
			PessoaDAO dao = new PessoaDAO();
			System.out.println(dao.update
					(JOptionPane.showInputDialog("Digite o novo numero de telefone"), 
					(Integer.parseInt(JOptionPane.showInputDialog("ID")))) + 
					" telefone(s) foram alterados.");
			
			dao.fechar();
		} catch (Exception e) {
			System.out.println(Excecao.tratarExcecao(e));
		}

	}

}
