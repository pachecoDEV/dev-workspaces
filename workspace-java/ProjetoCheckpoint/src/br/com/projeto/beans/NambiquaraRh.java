package br.com.projeto.beans;

import java.io.Serializable;

public class NambiquaraRh implements Serializable {
    
	private static final long serialVersionUID = 1L;
	private String duvidaCandidato;
    private String vaga;
    private String status;
	public NambiquaraRh(String duvidaCandidato, String vaga, String status) {
		super();
		this.duvidaCandidato = duvidaCandidato;
		this.vaga = vaga;
		this.status = status;
	}
	public NambiquaraRh() {
		super();
	}
	public String getDuvidaCandidato() {
		return duvidaCandidato;
	}
	public void setDuvidaCandidato(String duvidaCandidato) {
		this.duvidaCandidato = duvidaCandidato;
	}
	public String getVaga() {
		return vaga;
	}
	public void setVaga(String vaga) {
		this.vaga = vaga;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
}
    