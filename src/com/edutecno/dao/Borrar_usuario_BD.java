package com.edutecno.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import com.edutecno.dto.Usuario;
import com.edutecno.procesaconexion.Conexion;

/**
 * Servlet implementation class Borrar_usuario_BD
 */
@WebServlet("/Borrar_usuario_BD")
public class Borrar_usuario_BD extends HttpServlet {
	private static final long serialVersionUID = 1L;
		private final String Borrar_usuario_BD = "delete from usuarios where nombre_usuario = ? and clave_usuario=?";
		private Connection cnu;

		public boolean eliminar_usuario(Object info_usuario) {

			PreparedStatement ps;
			Usuario borrar_user = null;
			borrar_user = new Usuario();
			borrar_user = (Usuario) info_usuario;

			try {
				cnu = Conexion.obtenerConexion().getConexion();
				ps = cnu.prepareStatement(Borrar_usuario_BD);
				ps.setString(1, (String) borrar_user.getUsuario());
				ps.setString(2, (String) borrar_user.getClave());
				ps.executeUpdate();
			
				return true;
			} catch (SQLException e) {
				e.printStackTrace();
			}

			return false;
		}
	}