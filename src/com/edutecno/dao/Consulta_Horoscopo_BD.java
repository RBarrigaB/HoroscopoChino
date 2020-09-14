package com.edutecno.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import com.edutecno.dto.Horoscopo;
import com.edutecno.procesaconexion.Conexion;

@WebServlet("/consulta_horoscopo_BD")
public class Consulta_Horoscopo_BD extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final String Signo_chino_BD = "select signo_chino from astros_chinos where signo_chino = ?";
	private final String Elemento_chino_BD="select astro_chino_elemento from astros_chinos_elemento where astro_chino_elemento = ?";
	private Connection cnu;

	public Horoscopo buscar_horoscopo(Object info_consulta_horoscopo) {

		PreparedStatement ps;
		PreparedStatement ps2;
		ResultSet rs;
		ResultSet rs2;
		Horoscopo consulta_horoscopo = null;
		consulta_horoscopo = new Horoscopo();
		consulta_horoscopo = (Horoscopo) info_consulta_horoscopo;

		try {
			cnu = Conexion.obtenerConexion().getConexion();
			ps = cnu.prepareStatement(Signo_chino_BD);
			ps2= cnu.prepareStatement(Elemento_chino_BD);
			ps.setString(1, (String) consulta_horoscopo. getSigno());
			ps2.setString(1, (String) consulta_horoscopo.getElemento());
			rs = ps.executeQuery();
			rs2 = ps2.executeQuery();
			Horoscopo horoscopo_respuesta = new Horoscopo();
			while (rs.next()) {

				horoscopo_respuesta.setSigno(rs.getString("signo_chino"));
			}
			while(rs2.next()) {
				horoscopo_respuesta.setElemento(rs2.getString("astro_chino_elemento"));
			}

			return horoscopo_respuesta;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}
}
