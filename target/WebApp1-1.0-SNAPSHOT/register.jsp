<%-- 
    Document   : register
    Created on : Nov 8, 2023, 12:05:59 AM
    Author     : nyierre
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="controller.ServletRegister" %>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="CSS/estilos.css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
    </head>
    <body>
        <div id="align">
            <form action="ServletRegister" method="post">
                <h1>Introduce tus datos:</h1>
                Matricula:<br>
                <input type="text" name="username" value="" id="cuadro"><br>
                Contraseña:<br>
                <input type="text" name="password" value="" id="cuadro"><br>
                Nombre:<br>
                <input type="text" name="first_name" value="" id="cuadro"><br>
                Apellido:<br>
                <input type="text" name="last_name" value="" id="cuadro"><br>
                Perm:<br>
                <input type="text" name="perm" value="" id="cuadro"><br>
                <input type="submit" value="Registrar" id="boton">
            </form>
            <a href="login.jsp" class="button"> Volver </a>
            
            
        </div>
    </body>
</html>
