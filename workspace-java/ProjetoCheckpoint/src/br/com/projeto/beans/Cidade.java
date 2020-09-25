package br.com.projeto.beans;

public class Cidade {
	private int id;
	private String cidade;
	private String estado;
	private String pais;
	public Cidade() {
		super();
	}
	public Cidade(int id, String cidade, String estado, String pais) {
		super();
		this.id = id;
		this.cidade = cidade;
		this.estado = estado;
		this.pais = pais;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
}