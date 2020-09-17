package br.com.projeto.exception;

import java.sql.SQLException;

public class Excecao extends Exception {

	private static final long serialVersionUID = 1L;

	public static String tratarExcecao(Exception e) {
		if (e instanceof NullPointerException) {
			return "Objeto Nulo";
		} else if (e instanceof NumberFormatException) {
			return "Numero Invalido";
		} else if (e instanceof SQLException){
			return "Erro no banco de dados";
		} else {
			return "Excecao desconhecida !!";
		}
	}	
}