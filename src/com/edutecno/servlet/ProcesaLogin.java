package com.edutecno.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.edutecno.dto.Usuario;
import com.edutecno.facade.Facade;

@WebServlet("/procesaLogin")
public class ProcesaLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unused")
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String user, pass;

		user = request.getParameter("usuario");
		pass = request.getParameter("password");
		PrintWriter out = response.getWriter();
		Usuario info_validar = new Usuario();
		info_validar.setUsuario(user);
		info_validar.setClave(pass);
		Facade facade = new Facade();

		if (user == null) {

			out.println("<script type=\"text/javascript\">");
			out.println("Error!. Para acceder al horóscopo Chino, debe iniciar sesión");
			out.println("location='/Prueba_modulo_4/formularioLogin.jsp';");
			out.println("</script>");

		} else if (user.equalsIgnoreCase(facade.busqueda_user(info_validar).getUsuario())
				&& pass.equalsIgnoreCase(facade.busqueda_user(info_validar).getClave())) {

			Usuario infoUsuario = new Usuario(user, pass);

			HttpSession inicio_sesion = request.getSession(true);
			inicio_sesion.setAttribute("usuario1", infoUsuario);
			RequestDispatcher prueba = request.getRequestDispatcher("horoscopo.jsp");
			prueba.forward(request, response);
			// request.getServletContext().getRequestDispatcher("ingresoValores.jsp").forward(request,
			// response);
		}
		else {
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Error. Clave o usuario, incorrectos. Por favor, inténtelo nuevamente');");
			out.println("location='/Prueba_modulo_4/formularioLogin.jsp';");
			out.println("</script>");
		}
	}
}
