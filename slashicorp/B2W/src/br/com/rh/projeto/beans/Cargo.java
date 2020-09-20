package br.com.rh.projeto.beans;

import java.util.Date;

public class Cargo {
	private Pessoa cpf;
	private int idCargo;
	private String tipoCargo;
	private Date dtInicio;
	private Date dtFim;
	public Cargo() {
		super();
	}
	public Cargo(Pessoa cpf, int id, String tipoCargo, Date dtInicio, Date dtFim) {
		super();
		this.cpf = cpf;
		this.idCargo = id;
		this.tipoCargo = tipoCargo;
		this.dtInicio = dtInicio;
		this.dtFim = dtFim;
	}
	public Pessoa getCpf() {
		return cpf;
	}
	public void setCpf(Pessoa cpf) {
		this.cpf = cpf;
	}
	public int getId() {
		return idCargo;
	}
	public void setId(int id) {
		this.idCargo = id;
	}
	public String getTipoCargo() {
		return tipoCargo;
	}
	public void setTipoCargo(String tipoCargo) {
		this.tipoCargo = tipoCargo;
	}
	public Date getDtInicio() {
		return dtInicio;
	}
	public void setDtInicio(Date dtInicio) {
		this.dtInicio = dtInicio;
	}
	public Date getDtFim() {
		return dtFim;
	}
	public void setDtFim(Date dtFim) {
		this.dtFim = dtFim;
	}
	

}
