package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/ProdutoServlet", loadOnStartup = 1)
public class ProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter saida = null;
		
		try {
			saida = response.getWriter();
			
			response.setContentType("text/html");
			
			saida.print("<H1>Um olá do Servlet!</H1>");
		} finally {
			saida.close();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	@Override
	public void init() throws ServletException {
		System.out.println("ProdutoServlet iniciado!");
	}
	
	

}
