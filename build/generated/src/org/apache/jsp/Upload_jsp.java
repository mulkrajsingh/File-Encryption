package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Upload_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>File Upload Example in JSP and Servlet - Java web application</title>\n");
      out.write("    </head>\n");
      out.write(" \n");
      out.write("    <body> \n");
      out.write("        <div>\n");
      out.write("            <h3> Choose File to Upload in Server </h3>\n");
      out.write("            <form name=\"form1\" method=\"post\" action=\"UploadServlet\" enctype=\"multipart/form-data\">\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <div align=\"center\"><font size=\"5\" face=\"Imprint MT Shadow\">File Upload Page</font></div>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("                <br>               \n");
      out.write("                ");

                String Username=session.getAttribute("username").toString();
                
      out.write("\n");
      out.write("                <div align=\"left\">\n");
      out.write("                <font size=\"4\" face=\"Andalus\">\n");
      out.write("               <h1>welcome, ");
      out.print(Username);
      out.write("</h1></font>\n");
      out.write("               </div>\n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <div align=\"center\">Select a File:</div>\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <label for=\"browse\"></label>\n");
      out.write("                            <input type=\"file\" name=\"filename\" id=\"filename\">\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <div align=\"center\">\n");
      out.write("                                <input type=\"submit\" name=\"submit\" id=\"submit\" value=\"submit\">\n");
      out.write("                            </div>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                    <div align=\"right\">\n");
      out.write("                        <a href=\"Index.jsp\"><font size=\"5\" face=\"Comic Sans Ms\">Exit</font></a>\n");
      out.write("                    </div>\n");
      out.write("                </tr>\n");
      out.write("                </table>\n");
      out.write("            </form>         \n");
      out.write("        </div>\n");
      out.write("      \n");
      out.write("    </body>\n");
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
