package br.com.excecoes.exception;

public class Excecao extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String tratarExcecao(Exception e) {
		if (e instanceof NullPointerException) {
			return "Objeto Nulo";
		} else if (e instanceof NumberFormatException) {
			return "N�mero inv�lido";
		} else {
			return "Exce��o desconhecida !!";
		}
	}	
}
