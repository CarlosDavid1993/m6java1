package controlador;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SvInicio
 */
public class SvInicio extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SvInicio() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("index.jsp").forward(request, response);
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if ("Inicio".equals(request.getParameter("button1"))) {
		    RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
		    dispatcher.forward(request, response);
		    
		} else if ("Contacto".equals(request.getParameter("button2"))) {
		    RequestDispatcher dispatcher = request.getRequestDispatcher("contacto.jsp");
		    dispatcher.forward(request, response);
		    
		} else if ("Capacitacion".equals(request.getParameter("button3"))) {
		    RequestDispatcher dispatcher = request.getRequestDispatcher("capacitacion.jsp");
		    dispatcher.forward(request, response);
		    
		} else {
		    
		}

	}

}
