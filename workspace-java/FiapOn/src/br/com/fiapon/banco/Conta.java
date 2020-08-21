package br.com.fiapon.banco;

/**
 * Classe que abstrai uma Conta Bancária
 * @author Alex Couto
 * @version 1.0
 *
 */
public class Conta {
	
	// Atributos da Classe
	
	/**
	 * Número da Conta
	 */
	public int numero;
	/**
	 * Número da Agência
	 */
	public int agencia;
	/**
	 * Saldo da Conta
	 */
	public double saldo; 

	/**
	 * Construtores da Classe Conta
	 */
	public Conta() {
		
	}
	
	public Conta (int numero, int agencia, double saldo) { // Construtor com argumentos
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
	}
	
	/**
	 * Deposita um valor ao saldo da conta
	 * @param valor Valor a ser depositado
	 */
	public void depositar (double valor) {
		this.saldo += valor;
	}
	
	/**
	 * Retira um valor do saldo da conta
	 * @param valor Valor a ser retirado
	 */
	public void retirar (double valor) {
		this.saldo -= valor;
	}
	
	/**
	 * Verifica o saldo da conta
	 * @return valor do saldo da conta
	 */
	public double verificarSaldo () {
		return saldo;
	}
	
	
}
