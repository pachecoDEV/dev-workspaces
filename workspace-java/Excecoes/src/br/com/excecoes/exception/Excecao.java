package br.com.excecoes.exception;

public class Excecao extends Exception{

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
