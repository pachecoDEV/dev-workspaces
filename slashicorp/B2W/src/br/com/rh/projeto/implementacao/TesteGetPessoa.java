package br.com.rh.projeto.implementacao;

import br.com.rh.projeto.beans.Pessoa;
import br.com.rh.projeto.dao.PessoaDAO;
import br.com.rh.projeto.excecao.Excecao;
import br.com.rh.projeto.util.Magic;

public class TesteGetPessoa {

	public static void main(String[] args) {
		try {
			PessoaDAO dao = new PessoaDAO();
			Pessoa resposta = 
					dao.getPessoa(Magic.s("CPF"));
			System.out.println(resposta.getCpf());
			System.out.println(resposta.getCnpj());
			System.out.println(resposta.getNome());
			System.out.println(resposta.getTelefone());
			dao.fechar();
		} catch (Exception e) {
			System.out.println(Excecao.tratarExcecao(e));
		}

	}

}
