package br.com.projeto.implementacao;

import javax.swing.JOptionPane;

import br.com.projeto.crud.CRUDProcesso;
import br.com.projeto.exception.Excecao;
import br.com.projeto.nambiquara.statusProcesso;

public class TesteAddProcesso {

	public static void main(String[] args) {
		
		try {
			CRUDProcesso crudProcesso = new CRUDProcesso(); 
			statusProcesso processo = new statusProcesso();
			processo.setStatusDocumentacao(JOptionPane.showInputDialog("Documentação"));
			processo.setStatusProvaPratica(JOptionPane.showInputDialog("Prova Prática"));
			processo.setStatusContratacao(JOptionPane.showInputDialog("Contratação"));
			processo.setId(JOptionPane.showInputDialog("ID"));
		
			if (crudProcesso.add(processo)==0) {
				System.out.println("Não gravou");
			} else {
				System.out.println("Gravado");
			}
		} catch (Exception e) {
				e.printStackTrace();
				System.out.println(Excecao.tratarExcecao(e));
		}
	}
}
