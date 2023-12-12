/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;


import area.imc;
import area.usuario;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nyierre
 */
@WebServlet(name = "ServletMain", urlPatterns = {"/ServletMain"})
public class ServletMain extends HttpServlet {
    imc imc = new imc();
       LoginServlet controllog = new LoginServlet();
        usuario u = new usuario();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        try {
            PreparedStatement ps;
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/calif","root","rootroot");
            
            String username;
            username = request.getParameter("username");
            double cal1;
            cal1 = Double.parseDouble(request.getParameter("cal1"));
            double cal2;
            cal2 = Double.parseDouble(request.getParameter("cal2"));
            double cal3;
            cal3 = Double.parseDouble(request.getParameter("cal3"));
            double cal4;
            cal4 = Double.parseDouble(request.getParameter("cal4"));
            double por1;
            por1 = Double.parseDouble(request.getParameter("por1"));
            double por2;
            por2 = Double.parseDouble(request.getParameter("por2"));
            double por3;
            por3 = Double.parseDouble(request.getParameter("por3"));
            double por4;
            por4 = Double.parseDouble(request.getParameter("por4"));
           
           double result;
           result = imc.calcularCali(cal1, cal2, cal3, cal4, por1, por2, por3, por4);
           
           
           String idusuario;
           HttpSession session = request.getSession();
           idusuario = (String) session.getAttribute("id");
           
           ResultSet rs;
           ps = con.prepareStatement("INSERT INTO cali (usersid,cal1, cal2, cal3, cal4, calf) VALUES (?,?,?,?,?,?)");
          
           ps.setString(1,username);
           if (cal1 > 0 && cal1 <= 100){
               ps.setDouble(2, cal1);
           } else {
               response.sendRedirect("error.jsp");
               con.close(); 
           }
           
           if (cal2 > 0 && cal2 <= 100){
               ps.setDouble(3, cal1);
           } else {
               response.sendRedirect("error.jsp");
               con.close(); 
           }
           
           if (cal3 > 0 && cal3 <= 100){
               ps.setDouble(4, cal1);
           } else {
               response.sendRedirect("error.jsp");
               con.close(); 
           }
           
           if (cal4 > 0 && cal4 <= 100){
               ps.setDouble(5, cal1);
           } else {
               response.sendRedirect("error.jsp");
               con.close(); 
           }
         ps.setDouble(6, result);
                 
         ps.executeUpdate();
         response.sendRedirect("calculo.jsp");
         
        } catch (Exception e){
            System.out.println(e.getMessage());
            response.sendRedirect("error.jsp");
        }
    }
@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }

            
   

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
