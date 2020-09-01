package br.com.projeto.nambiquara;

import java.io.Serializable;

public class dadosVaga extends nambiquaraRh implements Serializable {

	private int id;
    private String detalhesVaga;
    private String curso;
    private String certificado;
    private String idioma;
    private String deficiencia;
    private String departamento;
    private String provaPratica;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getDetalhesVaga() {
        return detalhesVaga;
    }

    public void setDetalhesVaga(String detalhesVaga) {
        this.detalhesVaga = detalhesVaga;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCertificado() {
        return certificado;
    }

    public void setCertificado(String certificado) {
        this.certificado = certificado;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getDeficiencia() {
        return deficiencia;
    }

    public void setDeficiencia(String deficiencia) {
        this.deficiencia = deficiencia;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getProvaPratica() {
        return provaPratica;
    }

    public void setProvaPratica(String provaPratica) {
        this.provaPratica = provaPratica;
    }

}