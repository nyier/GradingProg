<%-- 
    Document   : calculo
    Created on : Oct 19, 2023, 11:20:02 AM
    Author     : nyierre
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.Statement" %>
<%@page import="java.sql.ResultSet" %>
<%@page import="java.sql.Connection" %>
<%@page import="java.sql.DriverManager" %>
<%@page import="java.sql.PreparedStatement" %>
<%@page import="controller.LoginServlet" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultado</title>
        <link rel="stylesheet" type="text/css" href="CSS/estilos.css"/>
    </head>
    <body>
        
        <%
            Connection con;
            String url= "jdbc:mysql://localhost:3306/calif";
            String Driver = "com.mysql.jdbc.Driver";
            String user = "root";
            String pass = "rootroot";
            Class.forName(Driver);
            con = DriverManager.getConnection(url,user,pass);
            
            LoginServlet control = new LoginServlet();
            
            String usuario = (String) session.getAttribute("perm");
            PreparedStatement ps;
            ResultSet rs;
            ps=con.prepareStatement("Select * from cali WHERE usersid = '"+usuario+"'");
            rs=ps.executeQuery();
        %>
        <div>
        <table id="align">  
    <tr>
        <th>Id</th>
        <th>Cal1</th>
        <th>Cal2</th>
        <th>Cal3</th>
        <th>Cal4</th>
        <th>Cal f</th>
        
     
            
    </tr>
               <% 
        while (rs.next()){ 
 
               %>
               <tr>
                <td><%=rs.getInt("idCalif")%> <br></td>
                <td><%=rs.getDouble("cal1")%><br></td>
                <td><%=rs.getDouble("cal2")%><br></td>
                <td><%=rs.getDouble("cal3")%><br></td>
                <td><%=rs.getDouble("cal4")%><br></td>
                <td><%=rs.getDouble("calf")%></td>
      
            </tr>
       
                <%}%>
            </div>
            </table>
               
            <a href="index.jsp" class="button"> Volver </a>
            </div>
    </body>
</html>
