package br.com.projeto.implementacao;

import javax.swing.JOptionPane;

import br.com.projeto.beans.Cargo;
import br.com.projeto.dao.CargoDAO;
import br.com.projeto.exception.Excecao;

public class TesteGetCargo {
    public static void main(String[] args) {
        try {
            CargoDAO dao = new CargoDAO();

            Cargo resposta = 
                dao.getCargo(Integer.parseInt(JOptionPane.showInputDialog("ID")));
            System.out.println(resposta.getId());
            System.out.println(resposta.getNome());
            System.out.println(resposta.getNivel());
            System.out.println(resposta.getSalario());
            dao.fechar();
        } catch (Exception e) {
            System.out.println(Excecao.tratarExcecao(e));
        }
    }
}