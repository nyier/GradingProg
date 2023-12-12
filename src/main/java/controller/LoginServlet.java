/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import area.usuario;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@WebServlet("/LoginServlet")
    public class LoginServlet extends HttpServlet {
    usuario u = new usuario();
    int id;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String perm = request.getParameter("perm");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/calif","root","rootroot");
            
            PreparedStatement ps;
            ResultSet rs;
            ps = con.prepareStatement("select * from Users where pass = ? and username = ? and perm = ?");
            ps.setString(1,password);
            ps.setString(2,username);
            ps.setString(3, perm);
            rs=ps.executeQuery();
            
            if(rs.next()){
                HttpSession session=request.getSession();
                session.setAttribute("id", username);
                u.setUsername(username);
                
                if ("profesor".equals(perm)) {
                response.sendRedirect("index.jsp");
                } else if ("alumno".equals(perm)) {
                    response.sendRedirect("consulta.jsp");
                } else {
                    // Manejo de otros permisos o situaciones
                    response.sendRedirect("error.jsp");
                }
            } else {
                response.sendRedirect("register.jsp");
            }
        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("error.jsp");
        }
    }
}