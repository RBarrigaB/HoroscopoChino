<%@page import="com.edutecno.dto.Usuario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Busqueda de nombre de usuario</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">

<link
	href="https://fonts.googleapis.com/css2?family=Kanit:ital,wght@1,700&display=swap"
	rel="stylesheet">
</head>
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/assets/css/estilos.css">
<script>

function showHint(str)
{
if (str.length==0) { 
    document.getElementById("txtHint").innerHTML="";
    return;
} else {
    var xmlhttp=new XMLHttpRequest();
    xmlhttp.onreadystatechange=function() {
        if (xmlhttp.readyState==4 && xmlhttp.status==200) {
            document.getElementById("txtHint").innerHTML=xmlhttp.responseText;
        }
    }
    xmlhttp.open("GET","busqueda_Clave?q="+str,true);
    xmlhttp.send();
}    
}
</script>
</head>
<body>

<h1 class="text-center text-dark">Horóscopo Chino</h1>
<br> <br>

<div class="ml-3">

	<h1 class="text-center">Bienvenido a la Prueba del módulo 4</h1><br><br>

<div class="ml-3">
<form class="ml-3">

<h2 class="text-align-left text-primary"><b>Ingrese una palabra para buscar su nombre de usuario:</h2><br>
Nombre de búsqueda: <input type="text" id="txt1" onkeyup="showHint(this.value)">&nbsp;<a class="text-success" href="Cambio_datos_inic"> Volver</a>
</form><br><br>
<span id="txtHint"></span>
</div> 
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</body>
</html>