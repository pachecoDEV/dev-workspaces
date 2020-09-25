package br.com.rh.projeto.implementacao;

import br.com.rh.projeto.beans.Pessoa;
import br.com.rh.projeto.dao.PessoaDAO;
import br.com.rh.projeto.excecao.Excecao;
import br.com.rh.projeto.util.Magic;

public class TesteGetPessoa {

	public static void main(String[] args) {
		try {
			PessoaDAO dao = new PessoaDAO();
			Pessoa resposta = dao.getPessoa(Magic.i("ID"));
			System.out.println(resposta.getIdPessoa());
			System.out.println(resposta.getCpf());
			System.out.println(resposta.getCnpj());
			System.out.println(resposta.getNome());
			System.out.println(resposta.getTelefone());
			System.out.println(resposta.getTipoUsuario());
			dao.fechar();
		} catch (Exception e) {
			System.out.println(Excecao.tratarExcecao(e));
		}

	}

}
