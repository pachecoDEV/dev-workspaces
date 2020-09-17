package br.com.projeto.implementacao;

import br.com.projeto.beans.Cidade;
import br.com.projeto.beans.Usuario;

public class TesteUsuarioLocal {

	public static void main(String[] args) {

		Usuario objeto = new Usuario();
		objeto.setNome("Alexandre");
		objeto.setEmail("pachecodocouto@gmail.com");
		objeto.setEndereco("Rua José Wasth Rodrigues, 25");
		objeto.setTelefone("11950413721");
		objeto.setCurso("ADS");
		objeto.setCertificacao("Java");
		objeto.setCpf("314.296.328-60");
		objeto.setIdioma("Ingles");
		objeto.setPretencaoSalarial("8000.00");
		objeto.setDeficiencia("N");
		objeto.setSenha("Xpto");
		objeto.setCargo("Desenvolvedor");
		objeto.setDepartamento("TI");
		objeto.setNivel("Pleno");
		
		Cidade cidade = new Cidade();
		cidade.setId(1);
		cidade.setCidade("São Paulo");
		cidade.setEstado("SP");
		cidade.setPais("Brasil");
		
		objeto.setCidade(cidade);
		
		System.out.println(objeto.getNome());
		System.out.println(objeto.getEmail());
		System.out.println(objeto.getCurso());
		System.out.println(objeto.getCidade().getCidade());
		System.out.println(objeto.getCidade().getEstado());

	}

}
