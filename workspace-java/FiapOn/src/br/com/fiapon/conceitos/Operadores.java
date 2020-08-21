package br.com.fiapon.conceitos;

public class Operadores {

	public static void main(String[] args) {
		// Operadores aritm�ticos comuns s�o utilizados para realizar somas, subtra��es, multiplica��o e divis�o.
		// Existe ainda um operador que retorna o resto da divis�o de dois n�meros, chamado m�dulo.
		
		// Opera��es de multiplica��o, divis�o e resto s�o realizadas primeiro
		// Opera��es de adi��o e subtra��o s�o aplicadas em seguida.
		
		// Podemos manipular a preced�ncia utilizando par�nteses.
		// (x + y) * z;
		// Desta forma a opera��o x + y � realizada primeiro por estar entre par�nteses.
		
		// Operador de atribui��o ( = ).
		
		// Operadores de Incremento e Decremento ( ++ e -- )
		
		int x = 9;
		int y = 2;
		
		int soma = x + y;
		int subtracao = x - y;
		int multiplicacao = x * y;
		int divisao = x / y;
		int resto = x % y;
		
		System.out.println("Resultado da adi��o:           " + soma);
		System.out.println("Resultado da subtra��o:        " + subtracao);
		System.out.println("Resultado da multiplica��o:    " + multiplicacao);
		System.out.println("Resultado da divis�o:          " + divisao);
		System.out.println("Resultado do resto (m�dulo):   " + resto);
		
		x++;
		System.out.println("Resultado do incremento de x:  " + x);
		
		y--;
		System.out.println("Resultado do decremento de y:  " + y);
		
		x += 10;
		System.out.println("Atribui��o aditiva de x:       " + x);
		
		y -= 10;
		System.out.println("Atribui��o subtrativa de y:    " + y);
		
		// Operadores de igualdade ou relacionais
		// == != > < >= <=
		
		int idade = 10;
		boolean maiorIdade = idade > 18;
		System.out.println("Maior de idade?                " + maiorIdade);
		
		// Operadores l�gicos
		// AND (&&)
		
		boolean precisaVotar = idade > 18 && idade < 70;
		
		// OR (||)
		
		boolean teste = x < 10 || x > 50;
		
		// XOR (^)
		// NOT (!)
		
		
		
	}

}
