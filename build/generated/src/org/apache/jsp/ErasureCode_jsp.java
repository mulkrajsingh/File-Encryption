package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ErasureCode_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("\t<head>\n");
      out.write("\t\t<meta charset=\"utf-8\"/>\n");
      out.write("\t\t<title>JavaScript File Encryption App</title>\n");
      out.write("\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\n");
      out.write("\n");
      out.write("\t\t<link href=\"http://fonts.googleapis.com/css?family=Raleway:400,700\" rel=\"stylesheet\" />\n");
      out.write("\t\t<link href=\"assets/css/style.css\" rel=\"stylesheet\" />\n");
      out.write("\n");
      out.write("\t</head>\n");
      out.write("\n");
      out.write("\t<body>\n");
      out.write("            <form name=\"lg-form\" method=\"post\" action=\"FileUpload1\" enctype=\"multipart/form-data\" >\n");
      out.write("\n");
      out.write("\t\t<a class=\"back\"></a>\n");
      out.write("\n");
      out.write("\t\t<div id=\"stage\">\n");
      out.write("\n");
      out.write("\t\t\t<div id=\"step1\">\n");
      out.write("\t\t\t\t<div class=\"content\">\n");
      out.write("\t\t\t\t\t<h1>What do you want to do?</h1>\n");
      out.write("\t\t\t\t\t<a class=\"button encrypt green\">Login</a>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<div id=\"step3\">\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"content if-encrypt\">\n");
      out.write("\t\t\t\t\t<h1>Enter a pass phrase</h1>\n");
      out.write("\t\t\t\t\t<h2>This phrase will be used as an encryption key. Write it down or remember it; you won't be able to restore the file without it. </h2>\n");
      out.write("                                            \n");
      out.write("                                        \n");
      out.write("                                        \n");
      out.write("                                        \n");
      out.write("                                          \n");
      out.write("                                          <br>\n");
      out.write("                                          \n");
      out.write("                                          <div>\n");
      out.write("\t\t\t\t\t <input type=\"text\" required title=\"Password required\"  placeholder=\"UserName\" name=\"UserName\" id=\"RegUpass\">\n");
      out.write("                                          <br>\n");
      out.write("                                           <input type=\"password\" required title=\"Password required\"  placeholder=\"Password\" name=\"PassWord\" id=\"RegUpass\">\n");
      out.write("                                          <br>\n");
      out.write("                                          \n");
      out.write("                                          <h1> <button type=\"submit\" id=\"login\">SUBMIT</button></h1>\n");
      out.write("                                            </div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("                                        \n");
      out.write("                                        \n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<footer>\n");
      out.write("           \n");
      out.write("       \n");
      out.write("\n");
      out.write("\t</body>\n");
      out.write("\n");
      out.write("\t<script src=\"http://cdnjs.cloudflare.com/ajax/libs/jquery/1.10.2/jquery.min.js\"></script>\n");
      out.write("\t<script src=\"assets/js/script.js\"></script>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
