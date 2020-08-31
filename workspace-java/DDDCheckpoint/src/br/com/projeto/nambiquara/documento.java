package br.com.projeto.nambiquara;

import java.io.Serializable;

public class documento extends nambiquaraRh implements Serializable {
    private String doc;

    public String getDoc() {
        return doc;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }

}