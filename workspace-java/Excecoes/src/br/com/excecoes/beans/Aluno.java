package br.com.excecoes.beans;

/*
 * Regras para um Beans/JavaBeans/DTO Design Pattern/TO/Model/Modelo
 * 1� Todos os atributos devem ser privados
 * 2� Um construtor com par�metros e um construtor sem par�metros
 * 3� Todo atributo deve ter um Getter e um Setter
 */

public class Aluno {
	
	private int rm;
	private String nome;
	
	public Aluno(int rm, String nome) {
		super();
		this.rm = rm;
		this.nome = nome;
	}
	
	public Aluno() {
		super();
	}

	public int getRm() {
		return rm;
	}

	public void setRm(int rm) {
		this.rm = rm;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}