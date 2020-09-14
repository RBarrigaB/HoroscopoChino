<%@page import="com.edutecno.dto.Usuario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Busqueda de horoscopo chino</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">

<link
	href="https://fonts.googleapis.com/css2?family=Kanit:ital,wght@1,700&display=swap"
	rel="stylesheet">
</head>
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/assets/css/estilos.css">
</head>
<body>
	<%
		HttpSession mi_session = request.getSession();
	Usuario usuario = (Usuario) mi_session.getAttribute("usuario1");
	String nombre = "";
	String signo = (String) request.getAttribute("signo");
	String elemento = (String) request.getAttribute("elemento");
	if (usuario == null) {
		System.out.print("Error!. Para acceder al horoscopo, debe iniciar sesión!");
		response.sendRedirect("Menu_login");
	} else {

		nombre = usuario.getUsuario();
	} %>

	<%if(nombre== null || nombre ==""){
	} else{
	%>
	<div class="text-left md-3">
		Bienvenido, <%=nombre %>
		<a href="CerrarSesion"> Cerrar Sesión</a>
		</div>
		<% } %>
		<h1 class="text-center text-dark">Horóscopo Chino</h1>
		<br> <br>

		<div class="ml-3">
			<form class="ml-3" action="Otorgar_signo" method="GET">

				<h2 class="text-align-left text-dark">
					<b>Ingrese su año de nacimiento para conocer su signo: 
				</h2>
				<br> Año de nacimiento: <input type="text" name="buscando_year">&nbsp;
				<button type="submit" class="btn btn-success">Determinar mi
					horoscopo</button>
			</form>
			<br> <br>
			<%
				if (signo != null) {
			%>
			<h2><%=signo%>
				de
				<%=elemento%></h2>
			<img src="assets/img/<%=signo.toLowerCase()%>.jpg"/> <img src="assets/img/<%=elemento.toLowerCase()%>.jpg"/>
			<%
				}
			%>

		</div>
		<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
		<script
			src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
		<script
			src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</body>
</html>