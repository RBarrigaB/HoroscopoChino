<%@page import="com.edutecno.dto.Usuario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Eliminar usuario</title>
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
		System.out.printf("%nError!. Para eliminar su usuario, debe iniciar sesión!%n");
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
	<h3 class="text-left ml-3">Solicitud para eliminar usuario</h3>
	<br>
	<form action="Del_user" method="GET">
		<div class="row text-left">
			<div class="col-md-4 ml-3">

				<h5>Para eliminar su cuenta, por favor, inicie sesión con su
					usuario y contraseña:</h5>
				<br>
				<p style="text-align: left;">Usuario</p>
				<input type="text" class="form-control m-0" name="usuario_d"
					placeholder="Ingrese su usuario" /> <br>
				<p>Ingrese su contraseña</p>
				<input type="password" class="form-control m-0" name="password_d"
					placeholder="Ingrese nueva contraseña" /> <br>
				<p>
			
					¿No recuerdas tu usuario? <span class="ml-1"><a
						class="text-info" href="Buscar_user_inic">Recupéralo aquí</a></span><br>
				</p>
				<p class="text-danger">**Recuerde que esta acción no se puede
					revertir**</p>
			</div>
		</div>
		
		<div class="row">
			<div class="col md-3 text-left ml-3">
				<a href="Del_user"><button type="submit"
						class="btn btn-success">Eliminar usuario</button></a>&nbsp; <a href="Menu_login" class="text-left text-primary">Volver al inicio</a>
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