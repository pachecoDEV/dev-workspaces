package br.com.projeto.implementacao;

import javax.swing.JOptionPane;

import br.com.projeto.beans.StatusProcesso;
import br.com.projeto.crud.CrudProcesso;
import br.com.projeto.exception.Excecao;

public class TesteAddProcesso {

	public static void main(String[] args) {
		
		try {
			CrudProcesso crudProcesso = new CrudProcesso(); 
			StatusProcesso processo = new StatusProcesso();
			processo.setStatusDocumentacao(JOptionPane.showInputDialog("Documenta��o"));
			processo.setStatusProvaPratica(JOptionPane.showInputDialog("Prova Pr�tica"));
			processo.setStatusContratacao(JOptionPane.showInputDialog("Contrata��o"));
			processo.setId(JOptionPane.showInputDialog("ID"));
		
			if (crudProcesso.add(processo)==0) {
				System.out.println("N�o gravou");
			} else {
				System.out.println("Gravado");
			}
		} catch (Exception e) {
				e.printStackTrace();
				System.out.println(Excecao.tratarExcecao(e));
		}
	}
}
