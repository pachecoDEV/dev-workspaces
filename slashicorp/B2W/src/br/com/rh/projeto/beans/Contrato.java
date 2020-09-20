package br.com.rh.projeto.beans;

import java.util.Date;

public class Contrato {
	private Pessoa cpf;
	private int idContrato;
	private String TipoContrato;
	private Date dtInicio;
	private Date dtFim;
	public Contrato() {
		super();
	}
	public Contrato(Pessoa cpf, int id, String tipoContrato, Date dtInicio, Date dtFim) {
		super();
		this.cpf = cpf;
		this.idContrato = id;
		TipoContrato = tipoContrato;
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
		return idContrato;
	}
	public void setId(int id) {
		this.idContrato = id;
	}
	public String getTipoContrato() {
		return TipoContrato;
	}
	public void setTipoContrato(String tipoContrato) {
		TipoContrato = tipoContrato;
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
