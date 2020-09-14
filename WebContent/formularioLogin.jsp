<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario Login</title>
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
	<h3 class="text-left ml-3">Login</h3>
	<br>
	<form action="procesaLogin" method="GET">
		<div class="row text-left">
			<div class="col-md-3 ml-3">
				<p style="text-align: left;">Usuario</p>
				<input type="text" class="form-control m-0" name="usuario" required
					placeholder="Ingrese usuario" /> <br>
				<p>Contraseña</p>
				<input type="password" class="form-control m-0" name="password"
					required placeholder="Ingrese contraseña" /> <br>
				<p>
					¿No tienes cuenta? <span class="ml-1"><a class="text-info"
						href="Crear_user_inic">Registrate aquí</a></span><br>
					<br> <span class="ml-1"> <a class="text-dark"
						href="Cambio_datos_inic">Opciones para iniciar sesión</a></span><br>
				</p>
			</div>
		</div>
		<br>
		<div class="row">
			<div class="col text-left ml-3">
				<button type="submit" class="btn btn-success">Ingresar</button>

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