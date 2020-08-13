package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class UploadFile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<title>DownloadGroupLogin</title>\n");
      out.write("<link href=\"css/styles.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<link href='http://fonts.googleapis.com/css?family=Economica' rel='stylesheet' type='text/css'>\n");
      out.write("<link href='http://fonts.googleapis.com/css?family=Lato' rel='stylesheet' type='text/css'>\n");
      out.write("<!----menu--->\n");
      out.write("<link rel=\"stylesheet\" href=\"css/superfish.css\" media=\"screen\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style2.css\" />\n");
      out.write("<script src=\"js/jquery-1.9.0.min.js\"></script>\n");
      out.write("<script src=\"js/hoverIntent.js\"></script>\n");
      out.write("<script src=\"js/superfish.js\"></script>\n");
      out.write("<script>\n");
      out.write("\n");
      out.write("\t\t// initialise plugins\n");
      out.write("\t\tjQuery(function(){\n");
      out.write("\t\t\tjQuery('#example').superfish({\n");
      out.write("\t\t\t\t//useClick: true\n");
      out.write("\t\t\t});\n");
      out.write("\t\t});\n");
      out.write("\n");
      out.write("\t\t</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"wrap1\">\n");
      out.write("<div class=\"container\">\n");
      out.write("  <div class=\"header\">\n");
      out.write("    <div class=\"logo\">\n");
      out.write("      <h1>UserLogin</h1>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"menu\">\n");
      out.write("      <ul class=\"sf-menu\" id=\"example\">\n");
      out.write("        \n");
      out.write("       \n");
      out.write("        </li>\n");
      out.write("   \n");
      out.write("        </li>\n");
      out.write("\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<div class=\"clearing\"></div>\n");
      out.write("</div><!---header-wrap--->\n");
      out.write("<div class=\"wrap4\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <div class=\"leftcol\">\n");
      out.write("      <div class=\"title\">\n");
      out.write("    \n");
      out.write("      </div>\n");
      out.write("      <div class=\"page-content\">\n");
      out.write("      <div class=\"panel borderbotm-none\">\n");
      out.write("  \n");
      out.write("         \n");
      out.write("            \n");
      out.write("       \n");
      out.write("\t<div class=\"lg-container\">\n");
      out.write("\t\t\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <div class=\"content\">\n");
      out.write("                    <h2>Enter The  UserName And Password</h2>\n");
      out.write("                    ");

                String Username=session.getAttribute("group").toString();
                
      out.write("\n");
      out.write("                </div>\n");
      out.write("                 <h1>welcome, ");
      out.print(Username);
      out.write("</h1></font>\n");
      out.write("\t\t<form name=\"lg-form\" method=\"post\" action=\"FileUpload\" enctype=\"multipart/form-data\" >\n");
      out.write("                    \n");
      out.write("                     \n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<table width=\"200\" border=\"0\">\n");
      out.write("                              <tr>\n");
      out.write("                                    <td><label for=\"Browse\"></label>\n");
      out.write("                                    <div align=\"center\">\n");
      out.write("                                        <label for=\"Browse3\"></label>\n");
      out.write("                                         <input type=\"file\" name=\"file\" id=\"file\" />\n");
      out.write("                                     </div></td>\n");
      out.write("                                </tr>\n");
      out.write("                                 </table>\n");
      out.write("                                \n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div>\t\t\t\t\n");
      out.write("\t\t\t\t<button type=\"submit\" id=\"login\">Login</button>\n");
      out.write("\t\t\t</div>\n");
      out.write("                    \n");
      out.write("            \t\t</form>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("    <div class=\"rightcol\">\n");
      out.write("     \n");
      out.write("      <div class=\"panel\">\n");
      out.write("        <div class=\"content\">\n");
      out.write("       \n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  <div class=\"clearing\"></div>  \n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<!---wrap4--->\n");
      out.write("<div class=\"wrap3\">\n");
      out.write("<div class=\"container\">\n");
      out.write(" \n");
      out.write("<div class=\"clearing\"></div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("<div class=\"shadows2\">\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
