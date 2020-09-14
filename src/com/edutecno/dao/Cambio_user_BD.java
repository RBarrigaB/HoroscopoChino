package com.edutecno.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import com.edutecno.dto.Data_cambio_clave;
import com.edutecno.procesaconexion.Conexion;

/**
 * Servlet implementation class Cambio_user_BD
 */
@WebServlet("/Cambio_user_BD")
public class Cambio_user_BD extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final String Cambiar_user_BD = "update usuarios set nombre_usuario = ? where nombre_usuario = ? and clave_usuario=?";
	private Connection cnu;

	public boolean actualizar_nombre_usuario(Object info_claves) {

		PreparedStatement ps;
		Data_cambio_clave cambiar_user = null;
		cambiar_user = new Data_cambio_clave();
		cambiar_user = (Data_cambio_clave) info_claves;
		
		System.out.println(cambiar_user.getPassn());
		System.out.println(cambiar_user.getUser());
		System.out.println(cambiar_user.getPasso());
		
		try {
			cnu = Conexion.obtenerConexion().getConexion();
			ps = cnu.prepareStatement(Cambiar_user_BD);
			ps.setString(1, (String) cambiar_user.getPassn());
			ps.setString(2, (String) cambiar_user.getUser());
			ps.setString(3, (String) cambiar_user.getPasso());
			ps.executeUpdate();
		
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}
}