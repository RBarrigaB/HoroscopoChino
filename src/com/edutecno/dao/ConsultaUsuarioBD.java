package com.edutecno.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import com.edutecno.dto.Usuario;
import com.edutecno.procesaconexion.Conexion;

@WebServlet("/consultaUsuarioBD")
public class ConsultaUsuarioBD extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final String Usuario_BD = "select nombre_usuario, clave_usuario from usuarios where nombre_usuario = ? and clave_usuario=?";
	private Connection cnu;

	public Usuario buscar_usuario(Object info_usuario) {

		PreparedStatement ps;
		ResultSet rs;
		Usuario consulta_user = null;
		consulta_user = new Usuario();
		consulta_user = (Usuario) info_usuario;

		try {
			cnu = Conexion.obtenerConexion().getConexion();
			ps = cnu.prepareStatement(Usuario_BD);
			ps.setString(1, (String) consulta_user.getUsuario());
			ps.setString(2, (String) consulta_user.getClave());
			rs = ps.executeQuery();
			Usuario data_user = new Usuario();
			while (rs.next()) {

				data_user.setUsuario(rs.getString("nombre_usuario"));
				data_user.setClave(rs.getString("clave_usuario"));
			}

			return data_user;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}
}
