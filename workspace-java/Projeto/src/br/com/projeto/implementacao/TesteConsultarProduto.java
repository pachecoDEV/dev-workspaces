package br.com.projeto.implementacao;

import javax.swing.JOptionPane;

import br.com.projeto.beans.Produto;
import br.com.projeto.dao.ProdutoDAO;
import br.com.projeto.exception.Excecao;
import br.com.projeto.util.Magic;

public class TesteConsultarProduto {

	public static void main(String[] args) {
		try {
			ProdutoDAO dao = new ProdutoDAO();
			Produto consultar = 
					dao.getDescricao(Magic.s("Descrição"));
			System.out.println(consultar.getId());
			System.out.println(consultar.getValorCompra());
			System.out.println(consultar.getValorVenda());
			System.out.println(consultar.getQtde());
			System.out.println(consultar.getDescricao());
			dao.fechar();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, Excecao.tratarExcecao(e));
		}

	}

}
