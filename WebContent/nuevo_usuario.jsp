<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Crear nuevo usuario</title>
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/assets/css/estilos.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">

<link
	href="https://fonts.googleapis.com/css2?family=Kanit:ital,wght@1,700&display=swap"
	rel="stylesheet">
</head>
<body>
	<h1 class="text-center">Bienvenido a la Prueba del módulo 4</h1>
	<br>
	<h3 class="text-left ml-3">Registro</h3>
	<br>
	<form action="Crear_user" method="GET">
		<div class="row text-left">
			<div class="col-md-4 ml-3">
				<p>Ingrese su usuario</p>
				<input type="text" class="form-control m-0" name="usuario_n"
					required placeholder="Ingrese un usuario" /> <br>
				<p>Ingrese su contraseña</p>
				<input type="password" class="form-control m-0" name="password_n"
					required placeholder="Ingrese una contraseña" />
			</div>
		</div>
		<br>
		<div class="row">
			<div class="col text-left ml-3">
				<a href="Cambio_pass_BD"><button type="submit" class="btn btn-success">Crear usuario</button></a>&nbsp; <a href="Menu_login" class="text-left text-primary">Volver al inicio</a>

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