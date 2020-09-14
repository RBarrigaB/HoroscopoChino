package com.edutecno.dao;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.edutecno.dto.Usuario;


@WebServlet("/RecepcionDatos")
public class RecepcionDatos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		HttpSession sesion = request.getSession();
		Usuario user= (Usuario) sesion.getAttribute("usuario");
		 
		 if (user == null){
		 
		 	out.println("alert('Usuario o password incorrecto');");
			response.sendRedirect("formularioLogin.jsp");
		 }
		 else {
		
		request.getServletContext().getRequestDispatcher("/RespuestaUsuario").forward(request, response);
	}
}
}
