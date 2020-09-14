package com.edutecno.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.edutecno.dto.Usuario;
import com.edutecno.facade.Facade;

/**
 * Servlet implementation class Delete_user
 */
@WebServlet("/Del_user")
public class Delete_user extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String userd, passd;

		userd = request.getParameter("usuario_d");
		passd = request.getParameter("password_d");
		PrintWriter out = response.getWriter();
		Usuario info_validard = new Usuario();
		info_validard.setUsuario(userd);
		info_validard.setClave(passd);
		Facade facaded = new Facade();
		System.out.println(userd);
		System.out.println(passd);
		if (userd.equalsIgnoreCase(facaded.busqueda_user(info_validard).getUsuario()) && passd.equalsIgnoreCase(facaded.busqueda_user(info_validard).getClave())) {

			if (facaded.eliminar_usuario(info_validard) == true) {
				out.println("<script type=\"text/javascript\">");
				out.println("alert('Usuario eliminado correctamente');");
				out.println("location='/Prueba_modulo_4/formularioLogin.jsp';");
				out.println("</script>");
			} else {

				out.println("<script type=\"text/javascript\">");
				out.println("alert('Error al eliminar usuario. Inténtelo nuevamente');");
				out.println("location='/Prueba_modulo_4/eliminar_user.jsp';");
				out.println("</script>");
			}

		} else {
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Usuario o password incorrecto');");
			out.println("location='/Prueba_modulo_4/eliminar_user.jsp';");
			out.println("</script>");
		}
	}
}
