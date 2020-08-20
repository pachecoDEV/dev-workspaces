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
