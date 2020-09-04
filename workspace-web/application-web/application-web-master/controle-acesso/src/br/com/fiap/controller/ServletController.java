package br.com.fiap.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletController
 */
@WebServlet( urlPatterns={"/validacao","/index.php"})
public class ServletController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//Teste de Request
		System.out.println("Ol� Mundo!");
		
		/***
		 * Bloco de Processamento
		 */
			String nomeUsuario  = "";
			String senhaUsuario = "";
			
			//Receber os atributos do Form que estao no
			// request e armazenar nas vari�veis.
			nomeUsuario = request.getParameter("txt-user");
			senhaUsuario = request.getParameter("txt-pass");
			
			//Imprimindo os dados que chegaram do request!
			System.out.println("Nome  do usu�rio : " + nomeUsuario);
			System.out.println("Senha do usu�rio : " + senhaUsuario);
			
		/***
		 * Bloco de Processamento
		 */

			//Criando um redirecionamento utilizando o response
			//utilize o m�todo sendRedirect(caminho ou URI de destino)
			response.sendRedirect("login.html");
	}
}
