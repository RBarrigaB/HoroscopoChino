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
 * Servlet implementation class Crear_user
 */
@WebServlet("/Crear_user")
public class Crear_user extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String usern, passn;

		usern = request.getParameter("usuario_n");
		passn = request.getParameter("password_n");

		PrintWriter out = response.getWriter();
		Usuario info_registro = new Usuario();
		info_registro.setUsuario(usern);
		info_registro.setClave(passn);
		Facade facadec = new Facade();
		
		if (usern.equalsIgnoreCase(facadec.busqueda_user(info_registro).getUsuario())) {
			
			out.println("<script type=\"text/javascript\">");
			out.println("alert('El usuario ya existe. Por favor, inténtelo nuevamente');");
			out.println("location='/Prueba_modulo_4/nuevo_usuario.jsp';");
			out.println("</script>");
		} else {
			
			if (facadec.crear_user(info_registro) == true) {
				out.println("<script type=\"text/javascript\">");
				out.println("alert('Usuario creado correctamente. Por favor, inicie sesión para continuar');");
				out.println("location='/Prueba_modulo_4/formularioLogin.jsp';");
				out.println("</script>");
			} else {

				out.println("<script type=\"text/javascript\">");
				out.println("alert('Error al crear el usuario. Inténtelo nuevamente');");
				out.println("location='/Prueba_modulo_4/nuevo_usuario.jsp';");
				out.println("</script>");
			}
		}
	}
}
