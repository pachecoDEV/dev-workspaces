package br.com.projeto.implementacao;

import javax.swing.JOptionPane;

import br.com.projeto.beans.Produto;
import br.com.projeto.dao.ProdutoDAO;
import br.com.projeto.exception.Excecao;

public class TesteDeletarProduto {

	public static void main(String[] args) {
		try {
			ProdutoDAO dao = new ProdutoDAO();
			Produto produto = new Produto();
			JOptionPane.showMessageDialog(null, "Você apagou: " + 
					dao.delete(Integer.parseInt(JOptionPane.showInputDialog("ID"))) + " produto(s).");
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, Excecao.tratarExcecao(e));
		}

	}

}
