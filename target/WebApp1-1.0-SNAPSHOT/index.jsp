<%-- 
    Document   : index
    Created on : Oct 31, 2023, 1:02:34 PM
    Author     : nyierre
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="controller.ServletMain" %>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="CSS/estilos.css"/>
        <title>Index</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <%
        String usuario = (String) session.getAttribute("id");
    %>
    <body> 
        <div id="align">
            <br><br>
            <h3>CALCULADORA IMC</h3>
            <form action="ServletMain" method="post">
                <h1>Matricula:</h1><br>
                <input type="text" name="username" value="" id="cuadro" required><br><br>
                <h2>Calificacion 1:</h2><br>
                <input type="text" name="cal1" value="" id="cuadro" required><br><br>
                <h2>Calificacion 2:</h2><br>
                <input type="text" name="cal2" value="" id="cuadro" required><br><br>
                <h2>Calificacion 3:</h2><br>
                <input type="text" name="cal3" value="" id="cuadro" required><br><br>
                <h2>Calificacion 4:</h2><br>
                <input type="text" name="cal4" value="" id="cuadro" required><br><br>
                <h2>Porcentaje 1:</h2><br>
                <input type="text" name="por1" value="" id="cuadro" required><br><br>
                <h2>Porcentaje 2:</h2><br>
                <input type="text" name="por2" value="" id="cuadro" required><br><br>
                <h2>Porcentaje 3:</h2><br>
                <input type="text" name="por3" value="" id="cuadro" required><br><br>
                <h2>Porcentaje 4:</h2><br>
                <input type="text" name="por4" value="" id="cuadro" required><br><br>
                <input type="submit" value="Calcular" id="boton">
                
            </form>
            <a href="login.jsp" id="button"> Cerrar sesión</a>
        </div>
    </body>
</html>
