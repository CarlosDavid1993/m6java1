<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Crear Capacitación</title>
</head>
<body>
    <h1>Crear Capacitación</h1>
    <form action="/CrearCapacitacion" method="POST">
        <label for="titulo">Título:</label>
        <input type="text" id="titulo" name="titulo" required><br><br>
        <label for="descripcion">Descripción:</label>
        <textarea id="descripcion" name="descripcion" rows="5" cols="30" required></textarea><br><br>
        <label for="fecha">Fecha:</label>
        <input type="date" id="fecha" name="fecha" required><br><br>
        <input type="submit" value="Crear">
    </form>
</body>
</html>
