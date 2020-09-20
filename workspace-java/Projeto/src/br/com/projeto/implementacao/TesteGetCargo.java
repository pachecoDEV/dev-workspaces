package br.com.projeto.implementacao;

import br.com.projeto.beans.Cargo;
import br.com.projeto.dao.CargoDAO;
import br.com.projeto.exception.Excecao;
import br.com.projeto.util.Magic;

public class TesteGetCargo {
    public static void main(String[] args) {
        try {
            CargoDAO dao = new CargoDAO();

            Cargo resposta = 
                dao.getCargo(Magic.i("ID"));
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