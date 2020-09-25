package br.com.rh.projeto.beans;

public class Pessoa {
	private int idPessoa;
	private String cpf;
	private String cnpj;
	private String nome;
	private String telefone;
	private String tipoUsuario;
	public Pessoa() {
		super();
	}
	public Pessoa(int idPessoa, String cpf, String cnpj, String nome, String telefone, String tipoUsuario) {
		super();
		this.idPessoa = idPessoa;
		this.cpf = cpf;
		this.cnpj = cnpj;
		this.nome = nome;
		this.telefone = telefone;
		this.tipoUsuario = tipoUsuario;
	}
	public int getIdPessoa() {
		return idPessoa;
	}
	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
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
	public String getTipoUsuario() {
		return tipoUsuario;
	}
	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	

}
