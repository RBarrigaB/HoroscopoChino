<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Modificación de datos</title>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">

<link
	href="https://fonts.googleapis.com/css2?family=Kanit:ital,wght@1,700&display=swap"
	rel="stylesheet">
</head>
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/assets/css/estilos.css">
<body>


	<h1 class="text-center">Bienvenido a la Prueba del módulo 4</h1>
	<br>
	<br>

	<h2 class="text-dark ml-3">¿Qué deseas hacer?</h2>
	<br>

	<div class="row text-left">
		<div class="col md-2">
			<a href="Cambio_pass_inic">
				<button type="button" class="ml-4 mb-3 btn btn-primary btn-dark">Cambiar
					contraseña</button>
			</a> <br> <a href="Cambio_user_inic">
				<button type="button" class="ml-4 mb-3 btn btn-primary btn-dark">
					Cambiar mi usuario</button>
			</a> <br> <a href="Buscar_user_inic">
				<button type="button" class="ml-4 mb-3 btn btn-primary btn-dark"
					onclick="Buscar_user_inic">Recordar mi usuario</button>
			</a> <br> <a href="Delete_user_inic">
				<button type="button" class="ml-4 mb-3 btn btn-primary btn-dark">
					Eliminar mi cuenta</button>
			</a> <br> <a href="Menu_login">
				<button type="button" class="ml-4 btn btn-primary btn-success">
					Volver a inicio</button>
			</a>
			

		</div>

	</div>



	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</body>
</html>