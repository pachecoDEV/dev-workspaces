package br.com.fiap.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import br.com.fiap.bean.Cliente;

import java.util.ArrayList;
import java.util.List;

/**
 * Servlet implementation class ClienteController
 */
@WebServlet(
		description = "Controle de acesso e fluxo de informações.",
		urlPatterns = { 
				"/cliente", 
				"/listar"
		})

public class ClienteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public static List<Cliente> lista = null;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClienteController() {
        super();
        
        if (lista == null) {
			//Implementando a lista com um ArrayList do tipo Cliente
        	lista = new ArrayList<Cliente>();
        	//Criando um instância de Cliente
        	Cliente cli = new Cliente();
        	//Populando o cliente com os dados
        	cli.setNome("Alexandre");
        	cli.setSobrenome("Couto");
        	cli.setDataNasc("16/01/1985");
        	cli.setGenero('m');
        	cli.setTelefone("(11) 95041-3721");
        	//Adicionando na lista
        	lista.add(cli);
        	
        	//ADICIONANDO NOVOS REGISTROS
        	
        	cli = new Cliente();
        	cli.setNome("Roberta");
        	cli.setSobrenome("Pellegrini");
        	cli.setDataNasc("13/04/1983");
        	cli.setGenero('f');
        	cli.setTelefone("(11) 98606-6357");
        	lista.add(cli);
        	
        	cli = new Cliente();
        	cli.setNome("Rafael");
        	cli.setSobrenome("Pacheco");
        	cli.setDataNasc("18/01/2018");
        	cli.setGenero('m');
        	cli.setTelefone("(11) 5189-1095");
        	lista.add(cli);
		}
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
