package br.com.fiapon.banco.teste;

import br.com.fiapon.banco.Conta;

public class Teste {

	public static void main(String[] args) {
		// Instanciar uma Classe conta
		Conta cc = new Conta(); // A variável cc têm uma referência ao objeto Conta
		cc.depositar(50);
		cc.setAgencia(123);
		cc.setNumero(321);
		
		cc.depositar(100);
		
		System.out.println(cc.getSaldo());
		
		Conta poupanca = new Conta(111, 222, 1000);
		
		poupanca.retirar(50);
		
		System.out.println(poupanca.getSaldo());

	}

}
