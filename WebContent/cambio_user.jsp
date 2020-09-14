<%@page import="com.edutecno.dto.Usuario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cambio nombre de usuario</title>
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/assets/css/estilos.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">

<link
	href="https://fonts.googleapis.com/css2?family=Kanit:ital,wght@1,700&display=swap"
	rel="stylesheet">
</head>
<body>
	<%
		HttpSession mi_session = request.getSession();
	Usuario usuario = (Usuario) mi_session.getAttribute("usuario1");
	String nombre = "";

	if (usuario == null) {
		System.out.printf("%nError!. Para cambiar su nombre de usuario, debe iniciar sesión!%n");
		response.sendRedirect("Menu_login");
	} else {

		nombre = usuario.getUsuario();
	} %>

	<%if(nombre== null || nombre==""){
	} else{
	%>
	<div class="text-left md-3">
		Bienvenido, <%=nombre %>
		<a href="CerrarSesion"> Cerrar Sesión</a>
		</div>
		<% } %>
	<h1 class="text-center">Bienvenido a la Prueba del módulo 4</h1>
	<br>
	<h3 class="text-left ml-3">Solicitud de cambio de usuario</h3>
	<br>
	<form action="Cambiar_user" method="GET">
		<div class="row text-left">
			<div class="col-md-4 ml-3">
				<p>Ingrese su usuario antiguo</p>
				<input type="text" class="form-control m-0" name="usuario_o"
					required placeholder="Ingrese su usuario" /> <br>
				<p>Ingrese su nuevo usuario</p>
				<input type="text" class="form-control m-0" name="usuario_n"
					required placeholder="Ingrese contraseña antigua" />
				<p><br>
				<p>Ingrese su contraseña</p>
				<input type="password" class="form-control m-0" name="password"
					required placeholder="Ingrese nueva contraseña" /> 
				<p><br>
					¿No recuerdas tu usuario? <span class="ml-1"><a
						class="text-info" href="Buscar_user_inic">Recupéralo aquí</a></span><br>
				</p>
				<p>
					¿No recuerdas tu clave? <span class="ml-1"><a
						class="text-info" href="Buscar_clave_inic">Recupérala aquí</a></span><br>
				</p>
			</div>
		</div>
		<br>
		<div class="row">
			<div class="col text-left ml-3">
				<a href="Cambiar_user"><button type="submit" class="btn btn-success">Modificar usuario</button></a>&nbsp; <a href="Menu_login" class="text-left text-primary">Volver al inicio</a>

			</div>
		</div>

	</form>
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</body>
</html>