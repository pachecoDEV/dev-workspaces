package br.com.fiap.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BuildAction
 */
@WebServlet("/montador")
public class BuildAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuildAction() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Exemplo de sa�da para o usu�rio
		//PrintWriter pw = response.getWriter();
		//pw.print("<h1>Ol� Mundo</h1>");
		
		//Vamos testar a consist�ncia das informa��es que chegam no request atrav�s do
		// m�todo getParameter(passando o nome do par�metro ou chave que � em formato de String)
		String nomeImg    = request.getParameter("uri-img");
		String caminhoImg = request.getParameter("url-img");
		String tamanhoImg = request.getParameter("wid-img");
		
		
		//Imprimindo para verificar a consist�ncia dos dados
		System.out.println("PATH OU URL: " + caminhoImg+nomeImg);
		
		//Utilizando o request vamos criar um atribuito nele(request)
		// atrav�s do m�todo setAttribute(passando o nomeDoAtributo,
		// e o valor do atributo em si)
		request.setAttribute("attrSrcImg", (caminhoImg+nomeImg));
		request.setAttribute("attrWidImg", (tamanhoImg));
		
		//Devemos criar um encaminhador(DISPATCHER) para levar
		// as informa��es para a p�gina de destino em quest�o ou
		// seja index.jsp.
		// S� precisamos passar para esta interface o PATH/URL ou
		//URI de destino utilizando o request. Utilizamos o m�todo
		// getRequestDispatcher(PATH/URL ou URI)
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		
		//E finalmente podemos encaminhar as informa��es de fato.
		// Com o dispatcher montado, n�s temos que direcionar para a
		//p�gina alvo tanto o request como o response atrav�s do m�todo
		// forward(Request,Response)
		rd.forward(request, response);
		
	}

}






