package br.com.projeto.nambiquara;

import java.io.Serializable;

public class processoSeletivo extends dadosVaga implements Serializable {
    private String provaPratica;

    public String getProvaPratica() {
        return provaPratica;
    }

    public void setProvaPratica(String provaPratica) {
        this.provaPratica = provaPratica;
    }
}