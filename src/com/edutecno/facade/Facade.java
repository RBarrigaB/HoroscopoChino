package com.edutecno.facade;

import com.edutecno.dao.Borrar_usuario_BD;
import com.edutecno.dao.Cambio_pass_BD;
import com.edutecno.dao.Cambio_user_BD;
import com.edutecno.dao.ConsultaUsuarioBD;
import com.edutecno.dao.Consulta_Horoscopo_BD;
import com.edutecno.dao.Crear_usuario_BD;
import com.edutecno.dto.Horoscopo;
import com.edutecno.dto.Usuario;

public class Facade {

	public Usuario busqueda_user(Object info_usuario){ // se declara el método obtieneInscripciones
		ConsultaUsuarioBD consultaUser= new ConsultaUsuarioBD(); // se instancia InscripcionDAO con un objeto
		return consultaUser.buscar_usuario(info_usuario); //se retorna la lista que tiene como retorno el método obtieneInscripciones
	}

	public boolean eliminar_usuario(Object user) {
		Borrar_usuario_BD delete_user= new Borrar_usuario_BD();
		return delete_user.eliminar_usuario(user);
	}
	
	public boolean cambio_clave(Object claves_user) {
		Cambio_pass_BD pass_change= new Cambio_pass_BD();
		return pass_change.actualizar_clave(claves_user);
	}
	
	public boolean crear_user(Object new_user) {
		Crear_usuario_BD create_user= new Crear_usuario_BD();
		return create_user.crear_usuario(new_user);
	}
	
	public boolean cambiar_user(Object cambio_username) {
		Cambio_user_BD change_username = new Cambio_user_BD();
		return change_username.actualizar_nombre_usuario(cambio_username);
	}
	
	public Horoscopo obtener_horoscopo(Object horoscopo_user) {
		Consulta_Horoscopo_BD consul_hor = new Consulta_Horoscopo_BD();
		return consul_hor.buscar_horoscopo(horoscopo_user);
	}
}
