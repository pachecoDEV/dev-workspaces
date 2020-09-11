package br.com.fiap.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
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
				"/lista"
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
        	cli.setDataNasc("1985-01-16");
        	cli.setGenero('m');
        	cli.setTelefone("(11) 95041-3721");
        	//Adicionando na lista
        	lista.add(cli);
        	
        	//ADICIONANDO NOVOS REGISTROS
        	
        	cli = new Cliente();
        	cli.setNome("Roberta");
        	cli.setSobrenome("Pellegrini");
        	cli.setDataNasc("1983-04-13");
        	cli.setGenero('f');
        	cli.setTelefone("(11) 98606-6357");
        	lista.add(cli);
        	
        	cli = new Cliente();
        	cli.setNome("Rafael");
        	cli.setSobrenome("Pacheco");
        	cli.setDataNasc("2018-01-18");
        	cli.setGenero('m');
        	cli.setTelefone("(11) 5189-1095");
        	lista.add(cli);
		}
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//RECEPÇÃO DOS DADOS DO REQUEST - INÍCIO
		
		//Criar uma instância de cliente
		Cliente cli = new Cliente();
		
		//DAO - Data Access Object
		//BO - Business Object
		
		//Popular o cliente com os dados do request utilizando o método getParameter(NomeDoCampo)
		//getParameter(NomeDoCampo)
		cli.setNome(request.getParameter("txtNm"));
		cli.setSobrenome(request.getParameter("txtSnm"));
		cli.setDataNasc(request.getParameter("txtDtNasc"));
		cli.setGenero(request.getParameter("txtGen").charAt(0));
		cli.setTelefone(request.getParameter("txtTel"));
		
		//Adicionando na lista
		lista.add(cli);
		
		//RECEPÇÃO DOS DADOS DO REQUEST - FIM
		
		//Adicionando a lista em um atributo no request utilizando o método setAttribute(nomeAtributo, Objeto)
		request.setAttribute("listaCli", lista);
		
		//ENCAMINHAMENTO DO REQUEST/RESPONSE - INÍCIO
		
		//Criar o dispatcher através da interface RequestDispatcher e passa para ela a URI/URL de destino
		RequestDispatcher rd = request.getRequestDispatcher("lista.jsp");
		
		//Utilizando o método forward nós passamos o request e o response finalmente
		rd.forward(request, response);
		
		//ENCAMINHAMENTO DO REQUEST/RESPONSE - FIM		
	}

}
