/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ErasureCode;

import com.commondb.Common_DB;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.Key;
import java.sql.ResultSet;
import java.util.List;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author Java
 */
public class FileUpload2 extends HttpServlet {

         String  group1="server1";
         String  group2="server2";
         String  group3="server3";
         String  group4="server4";
         String serverkey1="";
         String serverkey2="";
         String serverkey3="";
         String serverkey4="";
         String code1="";
         String code2="key1";
         String code3="key2";
         String code4="key3";
         
         
         
     private static Key generateKey(String productkey) throws Exception {

    
     
      System.out.println("Run time aggruments"+productkey);
        String keyValue = "";
        ResultSet rs1 = Common_DB.ViewParticularData("erasurecode", "registration", "userproductkey", productkey);
        String group2 = "";
        if (rs1.next()) {
            group2 = rs1.getString("userproductkey");
            
            System.out.println(" deva head key =="+group2);
        }
        System.out.println("WWWWWWWWWW" + group2);
        Key key = new SecretKeySpec(group2.getBytes(), "AES");
        return key;
    }

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet FileUpload2</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet FileUpload2 at " + request.getContextPath() + "</h1>");
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
          String name = null;
          String hashvalue1="";
          String hashvalue2="";
          String hashvalue3="";
           HttpSession session1 = request.getSession(true); 
            String productkey =session1.getAttribute("productkey").toString();
        String group = session1.getAttribute("Username").toString();
        System.out.println("FFFFFFFFFF" + productkey);
        System.out.println("deva i will checking");
        final String UPLOAD_DIRECTORY = "C:/Users/Mulkraj/Desktop/Project/" + group;
        System.out.println("file cheking "+UPLOAD_DIRECTORY);
         final String UPLOAD_DIRECTORY1 = "C:/Users/Mulkraj/Desktop/Project/" + group1;
        System.out.println("file cheking "+UPLOAD_DIRECTORY1);
        final String UPLOAD_DIRECTORY2 = "C:/Users/Mulkraj/Desktop/Project/" + group2;
        System.out.println("file cheking "+UPLOAD_DIRECTORY1);
        final String UPLOAD_DIRECTORY3 = "C:/Users/Mulkraj/Desktop/Project/" + group3;
        System.out.println("file cheking "+UPLOAD_DIRECTORY1);      
         final String UPLOAD_DIRECTORY4 = "C:/Users/Mulkraj/Desktop/Project/" + group4;
        System.out.println("file cheking "+UPLOAD_DIRECTORY1);
        System.out.println("-------------------------------------");
        String TempUploadDirectory = "C:/Users/Mulkraj/Desktop/Project/temp10";
        System.out.println("AAAAAAAAAAAAAAAAAAAAA" + TempUploadDirectory);
        File file = new File(TempUploadDirectory);
         if (!(file.exists())) {
            file.mkdir();
        }
         if (ServletFileUpload.isMultipartContent(request)) {
            try {
                String nn = "";
                List<FileItem> multiparts = new ServletFileUpload(
                        new DiskFileItemFactory()).parseRequest(request);

                for (FileItem item : multiparts) {
                    if (!item.isFormField()) {
                        name = new File(item.getName()).getName();
                        item.write(new File(TempUploadDirectory + File.separator + name));
                        nn = name;
                        
                        System.out.println("deva your file upload file name"+name);
                    }
                }
                Key key1 = generateKey(productkey);
                AESEncrypter encrypter = new AESEncrypter((SecretKey) key1);     
                encrypter.encrypt(new FileInputStream(TempUploadDirectory + File.separator + nn), new FileOutputStream(UPLOAD_DIRECTORY + File.separator + nn));
                encrypter.encrypt(new FileInputStream(TempUploadDirectory + File.separator + nn), new FileOutputStream(UPLOAD_DIRECTORY1 + File.separator + nn));
                encrypter.encrypt(new FileInputStream(TempUploadDirectory + File.separator + nn), new FileOutputStream(UPLOAD_DIRECTORY2 + File.separator + nn));
                encrypter.encrypt(new FileInputStream(TempUploadDirectory + File.separator + nn), new FileOutputStream(UPLOAD_DIRECTORY3 + File.separator + nn));
                encrypter.encrypt(new FileInputStream(TempUploadDirectory + File.separator + nn), new FileOutputStream(UPLOAD_DIRECTORY4 + File.separator + nn));
                System.out.println("name==fff" + UPLOAD_DIRECTORY + File.separator + nn);
                String hashvalue=  mdhashing.shaa(UPLOAD_DIRECTORY + File.separator + nn);
                System.out.println("-----"+hashvalue);
                hashvalue1=hashvalue.concat(code2);
                 System.out.println("-----2"+hashvalue1);
                hashvalue2=hashvalue.concat(code3);
                 System.out.println("-----"+hashvalue2);
                hashvalue3=hashvalue.concat(code4);
                 System.out.println("-----"+hashvalue3);
                
                  Common_DB.InsertTable("erasurecode", "insert into ownerprofile values('"+group+"','"+group+"','"+name+"','"+hashvalue+"','"+hashvalue1+"','"+hashvalue2+"','"+hashvalue3+"')");
                //File uploaded successfully
                request.setAttribute("message", "File gggg Uploaded Successfully");
            }
        catch (Exception ex) {
                request.setAttribute("message", "File Upload Failed due to " + ex);
            }

        }
        
        else {
            request.setAttribute("message",
                    "Sorry this Servlet only handles file upload request");
        }

        request.getRequestDispatcher("/result.jsp").forward(request, response);
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
