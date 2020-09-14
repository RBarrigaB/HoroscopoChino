package com.edutecno.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.edutecno.dto.Data_cambio_clave;
import com.edutecno.dto.Usuario;
import com.edutecno.facade.Facade;

/**
 * Servlet implementation class Cambiar_user
 */
@WebServlet("/Cambiar_user")
public class Cambiar_user extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String usero, ussern,pass;

		usero = request.getParameter("usuario_o");
		ussern = request.getParameter("usuario_n");
		pass= request.getParameter("password");
		
		PrintWriter out = response.getWriter();
		Usuario info_validard = new Usuario();
		Data_cambio_clave username_change= new Data_cambio_clave();
		info_validard.setUsuario(usero);
		info_validard.setClave(pass);
		username_change.setUser(usero);
		username_change.setPassn(ussern);
		username_change.setPasso(pass);
		Facade facadec = new Facade();
		
		if (usero.equalsIgnoreCase(facadec.busqueda_user(info_validard).getUsuario()) && pass.equalsIgnoreCase(facadec.busqueda_user(info_validard).getClave())) {

			if (facadec.cambiar_user(username_change) == true) {
				out.println("<script type=\"text/javascript\">");
				out.println("alert('Usuario modificado correctamente');");
				out.println("location='/Prueba_modulo_4/formularioLogin.jsp';");
				out.println("</script>");
			} else {

				out.println("<script type=\"text/javascript\">");
				out.println("alert('Error al modificar el usuario. Inténtelo nuevamente');");
				out.println("location='/Prueba_modulo_4/cambio_user.jsp';");
				out.println("</script>");
			}

		} else {
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Usuario o password incorrecto');");
			out.println("location='/Prueba_modulo_4/cambio_user.jsp';");
			out.println("</script>");
		}
	}
}
