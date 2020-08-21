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
		
		// Operadores de Incremento e Decremento ( ++ e -- )
		
		int x = 9;
		int y = 2;
		
		int soma = x + y;
		int subtracao = x - y;
		int multiplicacao = x * y;
		int divisao = x / y;
		int resto = x % y;
		
		System.out.println("Resultado da adição:           " + soma);
		System.out.println("Resultado da subtração:        " + subtracao);
		System.out.println("Resultado da multiplicação:    " + multiplicacao);
		System.out.println("Resultado da divisão:          " + divisao);
		System.out.println("Resultado do resto (módulo):   " + resto);
		
		x++;
		System.out.println("Resultado do incremento de x:  " + x);
		
		y--;
		System.out.println("Resultado do decremento de y:  " + y);
		
		x += 10;
		System.out.println("Atribuição aditiva de x:       " + x);
		
		y -= 10;
		System.out.println("Atribuição subtrativa de y:    " + y);
		
		// Operadores de igualdade ou relacionais
		// == != > < >= <=
		
		int idade = 10;
		boolean maiorIdade = idade > 18;
		System.out.println("Maior de idade?                " + maiorIdade);
		
		// Operadores lógicos
		// AND (&&)
		
		boolean precisaVotar = idade > 18 && idade < 70;
		
		// OR (||)
		
		boolean teste = x < 10 || x > 50;
		
		// XOR (^)
		// NOT (!)
		
		
		
	}

}
