package br.com.projeto.implementacao;

import javax.swing.JOptionPane;

import br.com.projeto.beans.Cargo;
import br.com.projeto.dao.CargoDAO;
import br.com.projeto.exception.Excecao;

public class TesteDeleteCargo {

	public static void main(String[] args) {
		try {
			CargoDAO dao = new CargoDAO();
			Cargo cargo = new Cargo();
			System.out.println("Voce apagou: " +
					dao.delete(Integer.parseInt(JOptionPane.showInputDialog("ID"))) + " cargo(s)");
			
		} catch (Exception e) {
				e.printStackTrace();
				System.out.println(Excecao.tratarExcecao(e));
		}

	}

}
