package br.com.projeto.implementacao;

import javax.swing.JOptionPane;

import br.com.projeto.crud.CRUDUsuario;
import br.com.projeto.exception.Excecao;
import br.com.projeto.nambiquara.templateUsuario;

public class TesteAddUsuario {

	public static void main(String[] args) {
		
		try {
			CRUDUsuario crudUsuario = new CRUDUsuario(); 
			templateUsuario usuario = new templateUsuario();
			usuario.setCpf(JOptionPane.showInputDialog("CPF"));
			usuario.setNome(JOptionPane.showInputDialog("NOME"));
			usuario.setEmail(JOptionPane.showInputDialog("EMAIL"));
			usuario.setEndereco(JOptionPane.showInputDialog("Endere�o"));
			usuario.setTelefone(JOptionPane.showInputDialog("Telefone"));
			usuario.setCurso(JOptionPane.showInputDialog("Curso"));
			usuario.setCertificacao(JOptionPane.showInputDialog("Certificado"));
			usuario.setIdioma(JOptionPane.showInputDialog("Idioma"));
			usuario.setPretencaoSalarial(JOptionPane.showInputDialog("Preten��o Salarial"));
			usuario.setDeficiencia(JOptionPane.showInputDialog("Deficiencia"));
			usuario.setSenha(JOptionPane.showInputDialog("Senha"));
			usuario.setCargo(JOptionPane.showInputDialog("Cargo"));
			usuario.setDepartamento(JOptionPane.showInputDialog("Departamento"));
			usuario.setNivel(JOptionPane.showInputDialog("Nivel"));
		
			if (crudUsuario.add(usuario)==0) {
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
