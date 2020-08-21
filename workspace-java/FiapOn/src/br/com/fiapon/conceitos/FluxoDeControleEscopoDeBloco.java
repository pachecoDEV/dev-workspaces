package br.com.fiapon.conceitos;

public class FluxoDeControleEscopoDeBloco {

	public static void main(String[] args) {

		// Fluxo de controle e Escopo de bloco
		
		int x = 11;
		
		// IF
		if (x > 10) {
			System.out.println("X � maior que 10.");
			System.out.println("****** FIM ******");
		}
		
		//IF / ELSE
		if (x > 10) {
			System.out.println("X � maior que 10.");
			System.out.println("****** FIM ******");
		} else {
			System.out.println("X � menor ou igual a 10.");
			System.out.println("********* FIM **********");
		}
		
		// IF / ELSE IF / ELSE
		if (x > 10) {
			System.out.println("X � maior que 10.");
		} else if (x == 10) {
			System.out.println("X � igual a 10.");
		} else {
			System.out.println("X � menor que 10.");
		}

	}

}
