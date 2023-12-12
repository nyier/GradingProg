<%-- 
    Document   : login
    Created on : Nov 8, 2023, 2:37:15 AM
    Author     : nyierre
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="controller.LoginServlet" %>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="CSS/estilos.css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>login</title>
    </head>
    <body>
        <div id="align">
            <form action="LoginServlet" method="post">
            <h1>matricula:</h1><br>
            <input type="text" name="username" value="" id="cuadro" required><br>
            <h2>contraseña:</h2><br>
            <input type="password" name="password" value="" id="cuadro" required><br><br>
            <h2>permiso(estudiante/profesor):</h2><br>
            <input type="text" name="perm" value="" id="cuadro" required><br><br>
            <input type="submit" value="continuar" id="boton">
            </form>
            <a href="register.jsp" id="boton1"> Registro</a>
        </div>
    </body>
</html>