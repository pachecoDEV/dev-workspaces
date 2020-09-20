package br.com.rh.projeto.beans;

public class Pessoa {
	private String cpf;
	private String cnpj;
	private String nome;
	private String telefone;
	public Pessoa() {
		super();
	}
	public Pessoa(String cpf, String cnpj, String nome, String telefone) {
		super();
		this.cpf = cpf;
		this.cnpj = cnpj;
		this.nome = nome;
		this.telefone = telefone;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	

}
