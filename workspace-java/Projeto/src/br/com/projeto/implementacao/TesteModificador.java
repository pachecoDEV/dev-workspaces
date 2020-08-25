package br.com.projeto.implementacao;

import br.com.projeto.beans.Cargo;
import br.com.projeto.beans.Colaborador;
import br.com.projeto.beans.Pessoa;

public class TesteModificador {

	public static void main(String[] args) {
		Cargo cargo = new Cargo();
		
		Colaborador c = new Colaborador();
		
		Pessoa p = new Colaborador("", "", "", 0, new Cargo(), "", "");
		System.out.println(p.getAll());
		
	}

}
