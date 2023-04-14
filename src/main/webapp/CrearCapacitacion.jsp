<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Crear Capacitacion</title>
</head>
<h1>Crear Capacitacion</h1>
<body>
<form>

        <label for="titulo">Título:</label>
        <input type="text" id="titulo" name="titulo" required> 
        <br>
        <br>
        <label for="descripcion">Descripción:</label>        
        <textarea id="descripcion" name="descripcion" rows="5" cols="30" required></textarea>
        <br>
        <br>
        <label for="fecha">Fecha:</label>
        <input type="date" id="fecha" name="fecha" required><br><br>
        <input type="submit" value="Crear">
        
</form>
        <a href="index.jsp">Inicio</a>
        <a href="CrearCapacitacion.jsp">Capacitaciones</a>
        <a href="Contacto.jsp">Contacto</a>
</body>
</html>