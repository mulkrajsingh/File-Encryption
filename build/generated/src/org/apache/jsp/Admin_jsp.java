package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("\t\t<meta charset=\"utf-8\">\n");
      out.write("\t\t<link href=\"css/style1.css\" rel='stylesheet' type='text/css' />\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\t\t<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("\t\t<!--webfonts-->\n");
      out.write("\t\t<link href='//fonts.googleapis.com/css?family=Open+Sans:400,300,600,700,800' rel='stylesheet' type='text.css'/>\n");
      out.write("\t\t<!--//webfonts-->\n");
      out.write("</head>\n");
      out.write(" \n");
      out.write("<body>\n");
      out.write("\t<div class=\"main\">\n");
      out.write("\t\t<form action=\"AdminServlet\" id=\"\" name=\"\" method=\"post\">\n");
      out.write("    \t\t<h1><span>Admin</span> <lable> Login </lable> </h1>\n");
      out.write("  \t\t\t<div class=\"inset\">\n");
      out.write("\t  \t\t\t<p>\n");
      out.write("\t    \t\t <label for=\"username\">USERNAME</label>\n");
      out.write("   \t \t\t\t<input type=\"text\" name=\"username\" placeholder=\"\" required />\n");
      out.write("\t\t\t\t</p>\n");
      out.write("  \t\t\t\t<p>\n");
      out.write("\t\t\t\t    <label for=\"password\">PASSWORD</label>\n");
      out.write("\t\t\t\t    <input type=\"password\" name=\"password\" placeholder=\"\" required />\n");
      out.write("  \t\t\t\t</p>\n");
      out.write("\t\t\t\t\n");
      out.write(" \t\t\t </div>\n");
      out.write(" \t \n");
      out.write("\t\t\t  <p class=\"p-container\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t    <input type=\"submit\" value=\"Login\">\n");
      out.write("\t\t\t  </p>\n");
      out.write("\t\t</form>\n");
      out.write("\t</div>  \n");
      out.write("\t\t\t\n");
      out.write("</body>\n");
      out.write("</html>");
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
