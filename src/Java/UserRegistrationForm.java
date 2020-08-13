 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ErasureCode;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Java
 */
public class UserRegistrationForm extends HttpServlet {
static Properties properties = new Properties();
   static
   {
      properties.put("mail.smtp.host", "smtp.gmail.com");
      properties.put("mail.smtp.socketFactory.port", "465");
      properties.put("mail.smtp.socketFactory.class",
                     "javax.net.ssl.SSLSocketFactory");
      properties.put("mail.smtp.auth", "true");
      properties.put("mail.smtp.port", "465");
   }

     
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet UserRegistrationForm</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet UserRegistrationForm at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          HttpSession session1=request.getSession();
            Connection con=null;
            Statement st=null;
            ResultSet rs1=null;
            
             try
        {
            String reguser=request.getParameter("username");
              String regpws=request.getParameter("password");
            String regemail=request.getParameter("email");
            String regpno=request.getParameter("phoneno");
              String Key=request.getParameter("userproductkey");
              String gender=request.getParameter("gender");
          
          //String gender="male";
            
            
            //System.out.println("name"+reguser);
            //System.out.println("pws"+regpws);
            //System.out.println("mobileno"+regpno);
            //System.out.println("mail"+regemail);
            // System.out.println("Key"+Key);
            
            
            
            Class.forName("com.mysql.jdbc.Driver");
          con=DriverManager.getConnection("jdbc:mysql://localhost:3306/erasurecode","root","password");
          st=con.createStatement();
          int rs=st.executeUpdate("insert into registration(username,password,email,phoneno,userproductkey,gender) VALUES('"+reguser+"','"+regpws+"','"+regemail+"','"+regpno+"','"+Key+"','"+gender+"')");
          if(rs>0)
          {
           //{     
          //Class.forName("com.mysql.jdbc.Driver");
          //con=DriverManager.getConnection("jdbc:mysql://localhost:3306/erasurecode","root","password");
          //st=con.createStatement();
          //rs1=st.executeQuery("select * from ownerprofile");
          //if(rs1.next())
          //{
             //String key= rs1.getString(4);
          
                
                final String  from="prabu.mk@pantechmail.com";
               final String password="prabhu11394";
               final String to="prabu.mk@pantechmail.com";
         Session session = Session.getInstance(properties, new javax.mail.Authenticator() 
         {
            protected PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(from, password);
            }});
         
         Message message = new MimeMessage(session);
         message.setFrom(new InternetAddress(from));
         message.setRecipients(Message.RecipientType.TO, 
         InternetAddress.parse(regemail));
         message.setSubject("public key:" + "Private key");
         //message.setSubject("private key");
         
         message.setText(""+Key);
         //message.setText("private key is "+"\n"+pri);
   
        Multipart multipart = new MimeMultipart();

      //addAttachments(multipart);
      //message.setContent(multipart);
      // Send message
      Transport.send(message);
    
     System.out.println("Email sent successfully");
             response.sendRedirect("index.jsp");            
           }
            else
            {
             response.sendRedirect("result.jsp");
            }
                        
        }
             
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
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
