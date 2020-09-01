package br.com.projeto.implementacao;

import javax.swing.JOptionPane;

import br.com.projeto.crud.CRUDProcesso;
import br.com.projeto.crud.CRUDVagas;
import br.com.projeto.exception.Excecao;
import br.com.projeto.nambiquara.dadosVaga;
import br.com.projeto.nambiquara.statusProcesso;

public class TesteAddVaga {

	public static void main(String[] args) {
		
		try {
			CRUDVagas crudVaga = new CRUDVagas(); 
			dadosVaga vaga = new dadosVaga();
			vaga.setId(JOptionPane.showInputDialog("ID"));
			vaga.setDetalhesVaga(JOptionPane.showInputDialog("Detalhes da Vaga"));
			vaga.setCurso(JOptionPane.showInputDialog("Curso"));
			vaga.setCertificado(JOptionPane.showInputDialog("Certificado"));
			vaga.setIdioma(JOptionPane.showInputDialog("Idioma"));
			vaga.setDeficiencia(JOptionPane.showInputDialog("Deficiencia"));
			vaga.setDepartamento(JOptionPane.showInputDialog("Departamento"));
			vaga.setProvaPratica(JOptionPane.showInputDialog("Prova Prática"));
		
			if (crudVaga.add(vaga)==0) {
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