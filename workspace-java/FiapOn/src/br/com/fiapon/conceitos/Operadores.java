package br.com.fiapon.conceitos;

public class Operadores {

	public static void main(String[] args) {
		// Operadores aritméticos comuns são utilizados para realizar somas, subtrações, multiplicação e divisão.
		// Existe ainda um operador que retorna o resto da divisão de dois números, chamado módulo.
		
		// Operações de multiplicação, divisão e resto são realizadas primeiro
		// Operações de adição e subtração são aplicadas em seguida.
		
		// Podemos manipular a precedência utilizando parênteses.
		// (x + y) * z;
		// Desta forma a operação x + y é realizada primeiro por estar entre parênteses.
		
		// Operador de atribuição ( = ).
		int x = 10;
		x = x + 15;
		System.out.println(x);
		
		x += 15;
		System.out.println(x);
		
		x -= 10;
		System.out.println(x);
		
		x *= 2;
		System.out.println(x);
		
		x /= 4;
		System.out.println(x);
		
		// Operadores de Incremento e Decremento
		

	}

}
