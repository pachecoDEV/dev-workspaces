package br.com.rh.projeto.implementacao;

import javax.swing.JOptionPane;

import br.com.rh.projeto.beans.Pessoa;
import br.com.rh.projeto.dao.PessoaDAO;
import br.com.rh.projeto.excecao.Excecao;

public class TesteAddPessoa {

	public static void main(String[] args) {
		try {
			PessoaDAO dao = new PessoaDAO();
			Pessoa pessoa = new Pessoa();
			pessoa.setCpf(JOptionPane.showInputDialog("CPF"));
			pessoa.setCnpj(JOptionPane.showInputDialog("CNPJ"));
			pessoa.setNome(JOptionPane.showInputDialog("Nome").toUpperCase());
			pessoa.setTelefone(JOptionPane.showInputDialog("Telefone"));
			if (dao.add(pessoa)==0) {
				System.out.println("Nao Gravou");
			} else {
				System.out.println("Gravado");
			}
			dao.fechar();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(Excecao.tratarExcecao(e));
		}

	}

}
