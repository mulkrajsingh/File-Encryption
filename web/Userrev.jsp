<%-- 
    Document   : Userrev
    Created on : 8 Mar, 2020, 12:26:55 PM
    Author     : Lenovo
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Revocation Page</title>
        <style>
.button {
  border-radius: 4px;
  background-color: #000000;
  border: none;
  color: #ffffff;
  text-align: center;
  font-size: 15px;
  padding: 20px;
  width: 200px;
  transition: all 0.5s;
  cursor: pointer;
  margin: 5px;
}

.button span {
  cursor: pointer;
  display: inline-block;
  position: relative;
  transition: 0.5s;
}

.button span:after {
  content: '»';
  position: absolute;
  opacity: 0;
  top: 0;
  right: -20px;
  transition: 0.5s;
}

.button:hover span {
  padding-right: 25px;
}

.button:hover span:after {
  opacity: 1;
  right: 0;
}
</style>
    </head>
    <body Background="images/img7.jpg">   
        <center>
            <form name="form1" method="post" action="UserRevocationServlet">
         <br>
           </br>
           <table width="" border="0">
                <tr>
                    <td>
                        <div align="center">
                            <font size="10" face="Lucida Calligraphy">User Revocation Page</font></div>
                    </td>
                </tr>
            </table>
           <p>
           </p>
        </center>
       <div align="center"><font size="4" face="Californian FB" color="#ffffff">
            <h1>Your Client List Here</h1></font>
        </div>
        <center>
        <table width="250" border="0">
            <tr>
                <td>
                    <div align="center"><font size="6" face="Chiller">UserName List:</font></div>
                    <label for="username"></label>
                </td>
                <td>
                    <select name="username" >    
           <%  
           //String groupkey=session.getAttribute("groupkey").toString();
           ArrayList li=new ArrayList();
           Connection con=null;
           Statement st=null;
           ResultSet rs=null;
           Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/erasurecode","root","password");
           st=con.createStatement();
           String qry="select username from registration";
           rs=st.executeQuery(qry);
            //ResultSet rr=Common_DB.ViewParticularData("mona","login","groupname",group1);
          
         while(rs.next())            
         {
          String n=rs.getString(1);   
           
             li.add(n);             
         }
            if(!(li.isEmpty()))        
         for(int ij=0; ij<li.size(); ij++)                   
              {
           %>
           <option value="<%=li.get(ij)%>"> <%=li.get(ij)%></option>
           <%
               }
             
                else {               
          %>
            <option value=""> </option>
          <%
         }
%>
          
       </select> 
                </td>
            </tr>
        </table>
        <table width="250" border="0">
            <tr>
                <td>
                    <div align="center">
                    <button class="button"><span>DELETE </span></button>
                    </div>
                </td>
            </tr>
        </table>
        </form>
        </center>
 <div align="center">
                        <a href="index.jsp"><font size="5" face="Impact">Exit</font></a>
                    </div>
    </body>
</html>

