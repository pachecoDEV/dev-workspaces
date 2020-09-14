package br.com.conexao.exception;

import java.sql.SQLException;

public class Excecao extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static String tratarExcecao(Exception e) {
		if (e instanceof NullPointerException) {
			return "Objeto Nulo";
		} else if (e instanceof NumberFormatException) {
			return "N�mero Inv�lido";
		} else if (e instanceof SQLException){
			return "Erro no banco de dados";
		} else {
			return "Exce��o desconhecida !!";
		}
	}	
}
