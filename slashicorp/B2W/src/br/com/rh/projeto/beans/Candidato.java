package br.com.rh.projeto.beans;

public class Candidato {
	
	private int idCandidato;
	private Pessoa cpf;
	public Candidato() {
		super();
	}
	public Candidato(int id, Pessoa cpf) {
		super();
		this.idCandidato = id;
		this.cpf = cpf;
	}
	public int getId() {
		return idCandidato;
	}
	public void setId(int id) {
		this.idCandidato = id;
	}
	public Pessoa getCpf() {
		return cpf;
	}
	public void setCpf(Pessoa cpf) {
		this.cpf = cpf;
	}
	

}
