package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class UserReg_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!--\n");
      out.write("Author: W3layouts\n");
      out.write("Author URL: http://w3layouts.com\n");
      out.write("License: Creative Commons Attribution 3.0 Unported\n");
      out.write("License URL: http://creativecommons.org/licenses/by/3.0/\n");
      out.write("-->\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Welcome to Registration</title>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("<meta name=\"keywords\" content=\"iOS 7 Login And Register App Responsive Templates, Iphone Widget Template, Smartphone login forms,Login form, Widget Template, Responsive Templates, a Ipad 404 Templates, Flat Responsive Templates\" />\n");
      out.write("<link href=\"css/style_reg.css\" rel='stylesheet' type='text/css' />\n");
      out.write("<!--webfonts-->\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Lato:100,300,400,700,900,300italic' rel='stylesheet' type='text/css'>\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Calligraffitti' rel='stylesheet' type='text/css'>\n");
      out.write("<!--//webfonts-->\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write(" <!--SIGN UP-->\n");
      out.write(" \n");
      out.write("\n");
      out.write("<div class=\"login-form-1\">\n");
      out.write("    <h1>User Register<br><br></h1>\n");
      out.write("\t<form action=\"UserRegistrationForm\" id=\"\" name=\"\" method=\"post\">\n");
      out.write("\t\t<input type=\"text\" id =\"username\" name=\"name\" class=\"text\" value=\"Name \" placeholder=\"Enter your Password\" required=\"required\">\n");
      out.write("                <input type=\"password\" id =\"password\" value=\"Password\"  name=\"password\" placeholder=\"Enter your Password\" required=\"required\" >\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("\t\t<input type=\"text\" required title=\"Username required\"  placeholder=\"Username \" id =\"email\"class=\"text\" name=\"email\" value=\"Email Address\"  >\n");
      out.write("\t\t<input type=\"text\" id =\"mobile\"class=\"text\" name=\"mobileno\"value=\"Phone\"  placeholder=\"Enter your Password\" required=\"required\">\n");
      out.write("                <input type=\"text\" id =\"username\" name=\"Key\" class=\"text\" value=\"key\" placeholder=\"Enter your Password\" required=\"required\" >\n");
      out.write("                \n");
      out.write("                \n");
      out.write("\t\t<input type=\"submit\"  value=\"Register\">\n");
      out.write("\t</form>\n");
      out.write("</div>\n");
      out.write(" <!--/SIGN IN-->\n");
      out.write(" <div class=\"copy-rights\">\n");
      out.write("\t\t\t\t\t<p>secure erasure Code</p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("</body>\n");
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
