package br.com.fiap.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.security.ntlm.Client;

import br.com.fiap.bean.Cliente;

/**
 * Servlet implementation class ClienteController
 */
@WebServlet("/cliente")
public class ClienteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClienteController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		switch (request.getRequestURI()) {
		case "/cadastro01/cliente":inserirCliente(request,response);
			break;
		default:
			response.sendRedirect("index.jsp");
		}
		
	}
	
	public void inserirCliente(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		//RECEPCAO DOS DADOS DO REQUEST - INICIO
		//Criar uma instancia de cliente
		Cliente cli = new Cliente();
				
		//Popular o cliente com os dados do request utilizando o metodo getParameter(NomeDoCampo)
		//getParameter(NomeDoCampo)
		cli.setNome(request.getParameter("txtNm"));
		cli.setSobrenome(request.getParameter("txtSnm"));
		cli.setDataNasc(request.getParameter("txtDtNasc"));
		cli.setGenero(request.getParameter("txtGen").charAt(0));
		cli.setTelefone(request.getParameter("txtTel"));
	}

}
