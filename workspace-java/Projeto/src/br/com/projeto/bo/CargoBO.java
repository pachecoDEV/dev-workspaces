package br.com.projeto.bo;

import br.com.projeto.beans.Cargo;
import br.com.projeto.dao.CargoDAO;

public class CargoBO {
		
	public static String apagar(int id) throws Exception {
		if (id < 1) {
			return "ID não existe!";
		}
		CargoDAO dao = new CargoDAO();
		dao.delete(id);
		dao.fechar();
		return "Apagado";
	}
	
	public static Cargo pesquisarCargo(int id) throws Exception {
		if (id < 1) {
			return new Cargo();
		}
		CargoDAO dao = new CargoDAO();
		Cargo resposta = dao.getCargo(id);
		dao.fechar();
		return resposta;
	}
	
	public static String novo(Cargo objeto) throws Exception{
		
		//Regra de Negócio
		
		if (objeto.getId() <1 ) {
			return "ID invalido!";
		}
		
		//Considerando que Nome e Nível não estão como obrigatórios no banco
		if (objeto.getNome() == null || objeto.getNome().length() < 4) {
			return "Nome do Cargo invalido";
		}
		
		if (objeto.getNivel() == null || objeto.getNivel().length() < 4) {
			return "Nível inválido!";
		}
		
		if (objeto.getSalario() < 1000) {
			return "Salário invalido!";
		}
		
		//Requisito Funcional

		// Supondo-se que 30 é o tamanho máximo definido no BD para Nome e Nível
		if (objeto.getNome().length() > 30) {
			return "Nome do cargo muito grande!";
		}
		
		if (objeto.getNivel().length() > 30) {
			return "Nível com muitos caracteres";
		}
		
		//Padronização
		
		objeto.setNome(objeto.getNome().toUpperCase());
		objeto.setNivel(objeto.getNivel().toUpperCase());
		
		CargoDAO dao = new CargoDAO();
		Cargo resposta = dao.getCargo(objeto.getId());
		if (resposta.getId() != 0) {
			dao.fechar();
			return "Este ID já existe!";
		}
		
		dao.add(objeto);
		dao.fechar();
		return "Congrats !!!";
	}
}
