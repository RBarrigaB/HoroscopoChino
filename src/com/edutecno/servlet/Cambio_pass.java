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
 * Servlet implementation class Cambio_pass
 */
@WebServlet("/Cambio_pass")
public class Cambio_pass extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String userc, passco,passcn;

		userc = request.getParameter("usuario_c");
		passco = request.getParameter("password_co");
		passcn= request.getParameter("password_cn");
		
		PrintWriter out = response.getWriter();
		Usuario info_validard = new Usuario();
		Data_cambio_clave claves= new Data_cambio_clave();
		info_validard.setUsuario(userc);
		info_validard.setClave(passco);
		claves.setUser(userc);
		claves.setPasso(passco);
		claves.setPassn(passcn);
		Facade facadec = new Facade();
		
		if (userc.equalsIgnoreCase(facadec.busqueda_user(info_validard).getUsuario()) && passco.equalsIgnoreCase(facadec.busqueda_user(info_validard).getClave())) {

			if (facadec.cambio_clave(claves) == true) {
				out.println("<script type=\"text/javascript\">");
				out.println("alert('Clave modificada correctamente');");
				out.println("location='/Prueba_modulo_4/formularioLogin.jsp';");
				out.println("</script>");
			} else {

				out.println("<script type=\"text/javascript\">");
				out.println("alert('Error al modificar la clave. Inténtelo nuevamente');");
				out.println("location='/Prueba_modulo_4/cambio_clave.jsp';");
				out.println("</script>");
			}

		} else {
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Usuario o password incorrecto');");
			out.println("location='/Prueba_modulo_4/cambio_clave.jsp';");
			out.println("</script>");
		}
	}
}
