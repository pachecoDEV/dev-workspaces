package br.com.projeto.beans;

public class StatusProcesso {
    private String statusDocumentacao;
    private String statusProvaPratica;
    private String statusContratacao;
    private String id;
    
	public StatusProcesso() {
		super();
	}

	public StatusProcesso(String statusDocumentacao, String statusProvaPratica, String statusContratacao, String id) {
		super();
		this.statusDocumentacao = statusDocumentacao;
		this.statusProvaPratica = statusProvaPratica;
		this.statusContratacao = statusContratacao;
		this.id = id;
	}

	public String getStatusDocumentacao() {
		return statusDocumentacao;
	}

	public void setStatusDocumentacao(String statusDocumentacao) {
		this.statusDocumentacao = statusDocumentacao;
	}

	public String getStatusProvaPratica() {
		return statusProvaPratica;
	}

	public void setStatusProvaPratica(String statusProvaPratica) {
		this.statusProvaPratica = statusProvaPratica;
	}

	public String getStatusContratacao() {
		return statusContratacao;
	}

	public void setStatusContratacao(String statusContratacao) {
		this.statusContratacao = statusContratacao;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}    
 
}