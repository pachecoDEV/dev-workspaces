package br.com.rh.projeto.beans;

import java.util.Date;

public class Log {
	private Documento idDocumento;
	private int idLog;
	private String descLog;
	private Date dtLog;
	public Log() {
		super();
	}
	public Log(Documento idDocumento, int idLog, String descLog, Date dtLog) {
		super();
		this.idDocumento = idDocumento;
		this.idLog = idLog;
		this.descLog = descLog;
		this.dtLog = dtLog;
	}
	public Documento getIdDocumento() {
		return idDocumento;
	}
	public void setIdDocumento(Documento idDocumento) {
		this.idDocumento = idDocumento;
	}
	public int getIdLog() {
		return idLog;
	}
	public void setIdLog(int idLog) {
		this.idLog = idLog;
	}
	public String getDescLog() {
		return descLog;
	}
	public void setDescLog(String descLog) {
		this.descLog = descLog;
	}
	public Date getDtLog() {
		return dtLog;
	}
	public void setDtLog(Date dtLog) {
		this.dtLog = dtLog;
	}
	

}
