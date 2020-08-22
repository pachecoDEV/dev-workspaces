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
	private int numero;
	/**
	 * Número da Agência
	 */
	private int agencia;
	/**
	 * Saldo da Conta
	 */
	private double saldo;

	/**
	 * Construtores da Classe Conta
	 */
	public Conta() { // Construtor vazio
		
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
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	/**
	 * Verifica o saldo da conta
	 * @return valor do saldo da conta
	 */
	public double getSaldo() {
		return saldo;
	}
}
