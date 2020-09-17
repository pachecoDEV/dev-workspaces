package br.com.projeto.implementacao;

import javax.swing.JOptionPane;

import br.com.projeto.crud.CrudUsuario;
import br.com.projeto.exception.Excecao;

public class TesteDeleteUsuario {

	public static void main(String[] args) {
		try {
			CrudUsuario usuario = new CrudUsuario();
			
			System.out.println("Voc� apagou " +
					usuario.delete(Integer.parseInt(JOptionPane.showInputDialog("CPF"))) +
					" registro(s)");
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(Excecao.tratarExcecao(e));
		}

	}

}
