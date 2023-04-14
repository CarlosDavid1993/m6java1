<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Contacto</title>
</head>
<h1>Contacto</h1>
<body>
	<form>

		<label for="titulo">Asunto:</label> <input type="text" id="titulo" name="titulo" required> 
		<br> 
		<br> 
		<label for="descripcion">Mensaje:</label>
		<textarea id="descripcion" name="descripcion" rows="5" cols="30" required></textarea>
        <br>
		<br> 
		<input type="submit" value="Crear">

	</form>
	<br>
	<a href="index.jsp">Volver</a>
	<br>
	<a href="CrearCapacitacion.jsp">Capacitaciones</a>
	<a href="Contacto.jsp">Contacto</a>
</body>
</html>