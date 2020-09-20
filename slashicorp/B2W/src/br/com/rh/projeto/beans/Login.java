package br.com.rh.projeto.beans;

public class Login {
	private Pessoa cpf;
	private String usuario;
	private String senha;
	public Login() {
		super();
	}
	public Login(Pessoa cpf, String usuario, String senha) {
		super();
		this.cpf = cpf;
		this.usuario = usuario;
		this.senha = senha;
	}
	public Pessoa getCpf() {
		return cpf;
	}
	public void setCpf(Pessoa cpf) {
		this.cpf = cpf;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	

}
