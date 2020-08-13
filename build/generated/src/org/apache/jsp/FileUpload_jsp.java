package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class FileUpload_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"en\" lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<title>Gadgets design</title>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"/>\n");
      out.write("<link rel=\"stylesheet\" href=\"style.css\" type=\"text/css\" charset=\"utf-8\" />\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div id=\"outer\">\n");
      out.write("  <div id=\"wrapper\">\n");
      out.write("    <div id=\"nav\">\n");
      out.write("      <div id=\"nav-left\">\n");
      out.write("        <div id=\"nav-right\">\n");
      out.write("          <ul>\n");
      out.write("            <li><a href=\"#\">ABOUT US</a></li>\n");
      out.write("            <li><a href=\"#\">PRODUCTS</a></li>\n");
      out.write("            <li><a href=\"#\">SERVICES</a></li>\n");
      out.write("            <li><a href=\"#\">SHOPPING CART</a></li>\n");
      out.write("            <li><a href=\"#\">NEW GADGETS</a></li>\n");
      out.write("            <li><a href=\"#\">REGISTER</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"clear\"></div>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"head\">\n");
      out.write("      <div id=\"head-left\"></div>\n");
      out.write("      <div id=\"head-right\"></div>\n");
      out.write("      <div id=\"head-1\"></div>\n");
      out.write("      <h1><span class=\"logo\"><span class=\"top\">top</span><span class=\"gadgets\">gadgets</span></span></h1>\n");
      out.write("      <div id=\"navb\">\n");
      out.write("        <ul>\n");
      out.write("          <li><a href=\"#\">HOME</a></li>\n");
      out.write("          <li><a href=\"#\">CONTACT</a></li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"head-2\"></div>\n");
      out.write("    <div id=\"login\">\n");
      out.write("      <div id=\"login-bot\">\n");
      out.write("        <div id=\"login-box\">\n");
      out.write("          <h2 class=\"login\"><em>user</em>login</h2>\n");
      out.write("          <form action=\"#\">\n");
      out.write("            <div id=\"login-username\">\n");
      out.write("              <div>\n");
      out.write("                <label for=\"username\">username</label>\n");
      out.write("                :\n");
      out.write("                <input type=\"text\" name=\"username\" value=\"\" id=\"username\" />\n");
      out.write("              </div>\n");
      out.write("              <div>\n");
      out.write("                <label for=\"password\">password</label>\n");
      out.write("                :\n");
      out.write("                <input type=\"password\" name=\"password\" value=\"\" id=\"password\" />\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"login-button\">\n");
      out.write("              <input type=\"image\" src=\"images/btn_login.gif\" name=\"l\" value=\"h\" id=\"l\" />\n");
      out.write("            </div>\n");
      out.write("            <div class=\"clear\">\n");
      out.write("              <div class=\"reg\"> New User? <a href=\"#\">REGISTER for FREE</a> </div>\n");
      out.write("            </div>\n");
      out.write("          </form>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"login-welcome\">\n");
      out.write("          <div>\n");
      out.write("            <h2>Welcome</h2>\n");
      out.write("            <p>Don't forget to check <a href=\"#\">free website templates</a> every day, because we add a new free website template almost daily.</p>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"clear\"></div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"body\">\n");
      out.write("      <div id=\"body-bot\">\n");
      out.write("        <h2><span>top <strong>GADGETS</strong> of this month</span></h2>\n");
      out.write("        <div id=\"items\">\n");
      out.write("          <div class=\"item\"> <img src=\"images/pic_1.jpg\" width=\"91\" height=\"105\" alt=\"iPod\" class=\"left\" />\n");
      out.write("            <h3><a href=\"http://www.justwebtemplates.com\">Just Web Templates</a></h3>\n");
      out.write("            <p>Even more websites all about website templates on <a href=\"http://www.justwebtemplates.com\">Just Web Templates</a>.</p>\n");
      out.write("            <div><a href=\"#\" class=\"details\">details</a> <a href=\"#\" class=\"addtocart\">add to cart</a></div>\n");
      out.write("            <div class=\"divider\"></div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"item\"> <img src=\"images/pic_3.jpg\" width=\"91\" height=\"105\" alt=\"Plasma screen\" class=\"left\" />\n");
      out.write("            <h3><a href=\"http://www.templatebeauty.com\">Template Beauty</a></h3>\n");
      out.write("            <p>If you're looking for beautiful and professionally made templates you can find them at <a href=\"http://www.templatebeauty.com\">Template Beauty</a>.</p>\n");
      out.write("            <div><a href=\"#\" class=\"details\">details</a> <a href=\"#\" class=\"addtocart\">add to cart</a></div>\n");
      out.write("            <div class=\"divider\"></div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"item\"> <img src=\"images/pic_2.jpg\" width=\"91\" height=\"105\" alt=\"CD Player\" class=\"left\" />\n");
      out.write("            <h3>Plasma Screens</h3>\n");
      out.write("            <p>This is a template designed by free website templates for you for free you can replace all the text by your own text. </p>\n");
      out.write("            <div><a href=\"#\" class=\"details\">details</a> <a href=\"#\" class=\"addtocart\">add to cart</a></div>\n");
      out.write("            <div class=\"divider\"></div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"item\"> <img src=\"images/pic_4.jpg\" width=\"91\" height=\"105\" alt=\"Camera\" class=\"left\" />\n");
      out.write("            <h3><a href=\"#\">The Forum</a></h3>\n");
      out.write("            <p>If you're having problems editing the template please don't hesitate to ask for help on the <a href=\"#\">forum</a>.</p>\n");
      out.write("            <div><a href=\"#\" class=\"details\">details</a> <a href=\"#\" class=\"addtocart\">add to cart</a></div>\n");
      out.write("            <div class=\"divider\"></div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"clear\"></div>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"banner\"> <img src=\"images/pic_5.jpg\" width=\"256\" height=\"109\" alt=\"Nokia 6015i\" class=\"left\" />\n");
      out.write("          <div id=\"banner-text\">\n");
      out.write("            <h3><a href=\"#\">Nokia 6015i</a> (Verizon Wireless)</h3>\n");
      out.write("            <ul>\n");
      out.write("              <li>You can remove any link to our websites from this template you're free to use the template without linking back to us.</li>\n");
      out.write("              <li>This is just a place holder so you can see how the site would look like.</li>\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"clear\"></div>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"footer\">\n");
      out.write("          <div id=\"footloose\"><span class=\"logo\"><span class=\"top\">top</span><span class=\"gadgets\">gadgets</span></span></div>\n");
      out.write("          <p><a href=\"#\">Privacy Policy</a> <strong>&nbsp;:&nbsp;</strong> <a href=\"#\">Terms &amp; Conditions</a> <br />\n");
      out.write("&copy; Copyright 2007. All rights reserved.<br />\n");
      out.write("designed by <a href=\"http://www.freewebsitetemplates.com\">free website templates</a></p>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
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
