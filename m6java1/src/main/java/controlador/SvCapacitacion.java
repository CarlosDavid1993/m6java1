package controlador;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SvCapacitacion
 */
public class SvCapacitacion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SvCapacitacion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        RequestDispatcher dispatcher = request.getRequestDispatcher("capacitacion.jsp");
        dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if ("Inicio".equals(request.getParameter("button1"))) {
            response.sendRedirect(request.getContextPath() + "/SvInicio");
		} else if ("Contacto".equals(request.getParameter("button2"))) {
            response.sendRedirect(request.getContextPath() + "/SvContacto");
		} else if ("Capacitacion".equals(request.getParameter("button3"))) {
            response.sendRedirect(request.getContextPath() + "/SvCapacitacion");
		}
	}

}
