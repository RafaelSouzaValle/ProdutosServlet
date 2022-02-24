package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.Produto;

@WebServlet(urlPatterns = "/ProdutoServlet", loadOnStartup = 1)
public class ProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter saida = null;
		
		try {
			saida = response.getWriter();
			
			response.setContentType("text/html");
			
			
			
			String cod = request.getParameter("cod");
			String descricao = request.getParameter("descricao");
			String valor = request.getParameter("valor");
			
			try {
				Produto produto = new Produto(cod, descricao, Double.valueOf(valor));
				
				System.out.println(produto.toString());
				
				saida.print("<H1>Produto adicionado com sucesso!</H1>");
				saida.print("<H2>Detalhes</H2>");
				saida.print(
						"<UL>"
						+ "<LI>" + "Código: " + cod + "</LI>"
						+ "<LI>" + "Descrição: " + descricao + "</LI>"
						+ "<LI>" + "Valor: R$" + valor + "</LI>"
						+ "</UL>");
			} catch (Exception e) {
				saida.print("<H1>O valor inserido é inválido!</H1>");
				System.out.println("Error " + e.getMessage().toString());
			}
			
		} finally {
			saida.close();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println(response.toString());
	}

	@Override
	public void init() throws ServletException {
		System.out.println("ProdutoServlet iniciado!");
	}
	
	

}
