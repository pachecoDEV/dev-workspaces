package br.com.excecoes.teste;

import javax.swing.JOptionPane;

import br.com.excecoes.beans.Aluno;

public class TesteExcecao {
	public static void main(String[] args) {
		
		// Criando Objeto
		// Aluno aluno;
		// aluno.setNome("Alexandre");
		
		// Inst�nciando Objeto
		// Aluno aluno = new Aluno();
		// aluno.setNome("Alexandre");
		
		try {
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero:"));
			System.out.println(numero);
			
			Aluno objeto = new Aluno();
			
			JOptionPane.showMessageDialog(null, objeto.getNome().length());
			
		} catch (NumberFormatException eNumberFormat) {
			JOptionPane.showMessageDialog(null, "N�mero inv�lido!");
			eNumberFormat.printStackTrace();
			
		} catch (NullPointerException eNullPointer) {
			JOptionPane.showMessageDialog(null, "Objeto nulo!");
			eNullPointer.printStackTrace();
			
		}
	}
}
