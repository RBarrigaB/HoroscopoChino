package com.edutecno.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import com.edutecno.dto.Data_cambio_clave;
import com.edutecno.procesaconexion.Conexion;

@WebServlet("/Cambio_pass_BD")
public class Cambio_pass_BD extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private final String Cambiar_clave_BD = "update usuarios set clave_usuario = ? where nombre_usuario = ? and clave_usuario=?";
	private Connection cnu;

	public boolean actualizar_clave(Object info_claves) {

		PreparedStatement ps;
		Data_cambio_clave borrar_user = null;
		borrar_user = new Data_cambio_clave();
		borrar_user = (Data_cambio_clave) info_claves;

		try {
			cnu = Conexion.obtenerConexion().getConexion();
			ps = cnu.prepareStatement(Cambiar_clave_BD);
			ps.setString(1, (String) borrar_user.getPassn());
			ps.setString(2, (String) borrar_user.getUser());
			ps.setString(3, (String) borrar_user.getPasso());
			ps.executeUpdate();
		
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}
}