package br.com.rh.projeto.beans;

public class AnalistaRH {
	private int idAnalistaRh;
	private Pessoa cpf;
	public AnalistaRH() {
		super();
	}
	public AnalistaRH(int id, Pessoa cpf) {
		super();
		this.idAnalistaRh = id;
		this.cpf = cpf;
	}
	public int getId() {
		return idAnalistaRh;
	}
	public void setId(int id) {
		this.idAnalistaRh = id;
	}
	public Pessoa getCpf() {
		return cpf;
	}
	public void setCpf(Pessoa cpf) {
		this.cpf = cpf;
	}
	

}
