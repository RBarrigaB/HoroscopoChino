<%@page import="com.edutecno.dto.Usuario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cambio de clave</title>
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
		System.out.printf("%nError!. Para cambiar su clave, debe iniciar sesi�n!%n");
		response.sendRedirect("Menu_login");
	} else {

		nombre = usuario.getUsuario();
	} %>
	
	<%if(nombre== null || nombre==""){
	} else{
	%>
	<div class="text-left md-3">
		Bienvenido, <%=nombre %>
		<a href="CerrarSesion"> Cerrar Sesi�n</a>
		</div>
		<% } %>
	<h1 class="text-center">Bienvenido a la Prueba del m�dulo 4</h1>
	<br>
	<h3 class="text-left ml-3">Solicitud de cambio de clave</h3>
	<br>
	<form action="Cambio_pass" method="GET">
		<div class="row text-left">
			<div class="col-md-4 ml-3">
				<p>Ingrese su usuario</p>
				<input type="text" class="form-control m-0" name="usuario_c"
					required placeholder="Ingrese su usuario" /> <br>
				<p>Ingrese su contrase�a antigua</p>
				<input type="password" class="form-control m-0" name="password_co"
					required placeholder="Ingrese contrase�a antigua" />
				<p>
					<br>
				<p>Ingrese su nueva contrase�a</p>
				<input type="password" class="form-control m-0" name="password_cn"
					required placeholder="Ingrese nueva contrase�a" />
				<p>
					<br> �No recuerdas tu usuario? <span class="ml-1"><a
						class="text-info" href="Buscar_user_inic">Recup�ralo aqu�</a></span><br>
				</p>
				<p>
						�No recuerdas tu clave? <span class="ml-1"><a
						class="text-info" href="Buscar_clave_inic">Recup�rala aqu�</a></span><br>
				</p>
			</div>
		</div>
		<br>
		<div class="row">
			<div class="col text-left ml-3">
				<a href="Cambio_pass"><button type="submit"
						class="btn btn-success">Cambiar clave</button></a>&nbsp; <a
					href="Menu_login" class="text-left text-primary">Volver al
					inicio</a>

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