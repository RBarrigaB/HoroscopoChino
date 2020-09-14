package com.edutecno.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.edutecno.dto.Horoscopo;
import com.edutecno.facade.Facade;

/**
 * Servlet implementation class Otorgar_signo
 */
@WebServlet("/Otorgar_signo")
public class Otorgar_signo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String yr;
		yr = request.getParameter("buscando_year");

		Determinar_signo busqueda_signo=new Determinar_signo();
		Horoscopo info_hor= new Horoscopo();

		info_hor= busqueda_signo.determinar_signo(Integer.parseInt(yr));

		Facade facadec = new Facade();
		request.setAttribute("signo", facadec.obtener_horoscopo(info_hor).getSigno());
		request.setAttribute("elemento", facadec.obtener_horoscopo(info_hor).getElemento());
		request.getRequestDispatcher("horoscopo.jsp").forward(request, response);
	
	}
}
