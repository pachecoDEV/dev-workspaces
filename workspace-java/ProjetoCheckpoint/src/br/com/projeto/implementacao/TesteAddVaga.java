package br.com.projeto.implementacao;

import javax.swing.JOptionPane;

import br.com.projeto.beans.DadosVaga;
import br.com.projeto.crud.CrudVagas;
import br.com.projeto.exception.Excecao;

public class TesteAddVaga {

	public static void main(String[] args) {
		
		try {
			CrudVagas crudVaga = new CrudVagas(); 
			DadosVaga vaga = new DadosVaga();
			vaga.setId(JOptionPane.showInputDialog("ID"));
			vaga.setDetalhesVaga(JOptionPane.showInputDialog("Detalhes da Vaga"));
			vaga.setCurso(JOptionPane.showInputDialog("Curso"));
			vaga.setCertificado(JOptionPane.showInputDialog("Certificado"));
			vaga.setIdioma(JOptionPane.showInputDialog("Idioma"));
			vaga.setDeficiencia(JOptionPane.showInputDialog("Deficiencia"));
			vaga.setDepartamento(JOptionPane.showInputDialog("Departamento"));
			vaga.setProvaPratica(JOptionPane.showInputDialog("Prova Pr�tica"));
		
			if (crudVaga.add(vaga)==0) {
				System.out.println("Nao gravou");
			} else {
				System.out.println("Gravado");
			}
		} catch (Exception e) {
				e.printStackTrace();
				System.out.println(Excecao.tratarExcecao(e));
		}
	}
}