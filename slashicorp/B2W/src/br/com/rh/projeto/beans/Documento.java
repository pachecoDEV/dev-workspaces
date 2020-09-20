package br.com.rh.projeto.beans;

import java.util.Date;

public class Documento {
	private Contrato idContrato;
	private int idDocumento;
	private String tipoDocumento;
	private String validezDocumento;
	private Date validadeDocumento;
	private Date dtEnvio;
	private Date dtConfirmado;
	private String statusDocumento;
	public Documento() {
		super();
	}
	public Documento(Contrato idContrato, int idDocumento, String tipoDocumento, String validezDocumento,
			Date validadeDocumento, Date dtEnvio, Date dtConfirmado, String statusDocumento) {
		super();
		this.idContrato = idContrato;
		this.idDocumento = idDocumento;
		this.tipoDocumento = tipoDocumento;
		this.validezDocumento = validezDocumento;
		this.validadeDocumento = validadeDocumento;
		this.dtEnvio = dtEnvio;
		this.dtConfirmado = dtConfirmado;
		this.statusDocumento = statusDocumento;
	}
	public Contrato getIdContrato() {
		return idContrato;
	}
	public void setIdContrato(Contrato idContrato) {
		this.idContrato = idContrato;
	}
	public int getIdDocumento() {
		return idDocumento;
	}
	public void setIdDocumento(int idDocumento) {
		this.idDocumento = idDocumento;
	}
	public String getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public String getValidezDocumento() {
		return validezDocumento;
	}
	public void setValidezDocumento(String validezDocumento) {
		this.validezDocumento = validezDocumento;
	}
	public Date getValidadeDocumento() {
		return validadeDocumento;
	}
	public void setValidadeDocumento(Date validadeDocumento) {
		this.validadeDocumento = validadeDocumento;
	}
	public Date getDtEnvio() {
		return dtEnvio;
	}
	public void setDtEnvio(Date dtEnvio) {
		this.dtEnvio = dtEnvio;
	}
	public Date getDtConfirmado() {
		return dtConfirmado;
	}
	public void setDtConfirmado(Date dtConfirmado) {
		this.dtConfirmado = dtConfirmado;
	}
	public String getStatusDocumento() {
		return statusDocumento;
	}
	public void setStatusDocumento(String statusDocumento) {
		this.statusDocumento = statusDocumento;
	}
	

}
