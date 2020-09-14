package com.edutecno.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import com.edutecno.dto.Usuario;
import com.edutecno.procesaconexion.Conexion;

/**
 * Servlet implementation class Crear_usuario_BD
 */
@WebServlet("/Crear_usuario_BD")
public class Crear_usuario_BD extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private final String Crear_user_BD = "insert into usuarios(nombre_usuario,clave_usuario) values (?,?);";
	private Connection cnu;

	public boolean crear_usuario(Object info_new) {

		PreparedStatement ps;
		Usuario crear_user = null;
		crear_user = new Usuario();
		crear_user = (Usuario) info_new;

		try {
			cnu = Conexion.obtenerConexion().getConexion();
			ps = cnu.prepareStatement(Crear_user_BD);
			ps.setString(1, (String) crear_user.getUsuario());
			ps.setString(2, (String) crear_user.getClave());
			ps.executeUpdate();
		
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

}
