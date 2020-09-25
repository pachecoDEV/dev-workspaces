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
			pessoa.setIdPessoa(Integer.parseInt(JOptionPane.showInputDialog("ID")));
			pessoa.setCpf(JOptionPane.showInputDialog("CPF"));
			pessoa.setCnpj(JOptionPane.showInputDialog("CNPJ"));
			pessoa.setNome(JOptionPane.showInputDialog("Nome").toUpperCase());
			pessoa.setTelefone(JOptionPane.showInputDialog("Telefone"));
			pessoa.setTipoUsuario(JOptionPane.showInputDialog("Tipo Usuario"));
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
