package br.com.fiapon.banco.teste;

import br.com.fiapon.banco.Conta;

public class Teste {

	public static void main(String[] args) {
		// Instanciar uma Classe conta
		Conta cc = new Conta(); // A variável cc têm uma referência ao objeto Conta
		cc.saldo = 50;
		cc.agencia = 123;
		cc.numero = 321;
		
		cc.depositar(100);
		
		System.out.println(cc.verificarSaldo());
		
		Conta poupanca = new Conta(111, 222, 1000);
		
		poupanca.retirar(50);
		
		System.out.println(poupanca.verificarSaldo());

	}

}
