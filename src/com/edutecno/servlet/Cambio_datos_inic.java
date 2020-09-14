package com.edutecno.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Cambio_datos_inic")
public class Cambio_datos_inic extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Cambio_datos_inic() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher prueba = request.getRequestDispatcher("cambio_datos_usuario.jsp");
		prueba.forward(request, response);
	}


}
