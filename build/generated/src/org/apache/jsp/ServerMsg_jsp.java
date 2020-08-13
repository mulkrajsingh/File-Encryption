package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ServerMsg_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<title>Home</title>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta name = \"format-detection\" content = \"telephone=no\" />\n");
      out.write("<link rel=\"icon\" href=\"images/favicon.ico\">\n");
      out.write("<link rel=\"shortcut icon\" href=\"images/favicon.ico\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"css1/touchTouch.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css1/camera.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css1/style.css\">\n");
      out.write("<script src=\"js1/jquery.js\"></script>\n");
      out.write("<script src=\"js1/jquery-migrate-1.1.1.js\"></script>\n");
      out.write("<script src=\"js1/jquery.easing.1.3.js\"></script>\n");
      out.write("<script src=\"js1/script.js\"></script>\n");
      out.write("<script src=\"js1/superfish.js\"></script>\n");
      out.write("<script src=\"js1/jquery.equalheights.js\"></script>\n");
      out.write("<script src=\"js1/jquery.mobilemenu.js\"></script>\n");
      out.write("<script src=\"js1/tmStickUp.js\"></script>\n");
      out.write("<script src=\"js1/jquery.ui.totop.js\"></script>\n");
      out.write("<script src=\"js1/touchTouch.jquery.js\"></script>\n");
      out.write("<script src=\"js1/camera.js\"></script>\n");
      out.write("<!--[if (gt IE 9)|!(IE)]><!-->\n");
      out.write("<script src=\"js1/jquery.mobile.customized.min.js\"></script>\n");
      out.write("<!--<![endif]-->\n");
      out.write("<script>\n");
      out.write(" $(window).load(function(){\n");
      out.write("  $().UItoTop({ easingType: 'easeOutQuart' });\n");
      out.write("  $('#camera_wrap').camera({\n");
      out.write("    loader: false,\n");
      out.write("    pagination: false ,\n");
      out.write("    minHeight: '400',\n");
      out.write("    thumbnails: true,\n");
      out.write("    height: '46.32478632478632%',\n");
      out.write("    caption: false,\n");
      out.write("    navigation: false,\n");
      out.write("    fx: 'mosaic'\n");
      out.write("  });\n");
      out.write("  $('.gallery .gall_item').touchTouch();\n");
      out.write(" });\n");
      out.write("</script>\n");
      out.write("<!--[if lt IE 8]>\n");
      out.write(" <div style=' clear: both; text-align:center; position: relative;'>\n");
      out.write("   <a href=\"http://windows.microsoft.com/en-US/internet-explorer/products/ie/home?ocid=ie6_countdown_bannercode\">\n");
      out.write("     <img src=\"http://storage.ie6countdown.com/assets/100/images/banners/warning_bar_0000_us.jpg\" border=\"0\" height=\"42\" width=\"820\" alt=\"You are using an outdated browser. For a faster, safer browsing experience, upgrade for free today.\" />\n");
      out.write("   </a>\n");
      out.write("</div>\n");
      out.write("<![endif]-->\n");
      out.write("<!--[if lt IE 9]>\n");
      out.write("<script src=\"js/html5shiv.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" media=\"screen\" href=\"css/ie.css\">\n");
      out.write("<![endif]-->\n");
      out.write("</head>\n");
      out.write("<body class=\"\" id=\"top\">\n");
      out.write("<!--==============================\n");
      out.write("              header\n");
      out.write("=================================-->\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"main\">\n");
      out.write("<header>\n");
      out.write("  <div class=\"container_12\">\n");
      out.write("    <div class=\"grid_12\">\n");
      out.write("      <h1 class=\"logo\">\n");
      out.write("        <a href=\"index.html\">Your Server Was Tried By Hi-Jackers</a>\n");
      out.write("      </h1>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"clear\"></div>\n");
      out.write("  </div>\n");
      out.write("  <section id=\"stuck_container\">\n");
      out.write("\n");
      out.write("\n");
      out.write("  <!--==============================\n");
      out.write("              Stuck menu\n");
      out.write("  =================================-->\n");
      out.write("   \n");
      out.write("  </section>\n");
      out.write("</header>\n");
      out.write("<section class=\"slider_wrapper\">\n");
      out.write("  <div class=\"container_12\">\n");
      out.write("    <div class=\"grid_12\">\n");
      out.write("      <div id=\"camera_wrap\" class=\"\">\n");
      out.write("        <div data-src=\"images1/slide-1.jpg\" data-thumb=\"images1/thumb-2.jpg\"></div>\n");
      out.write("        <div data-src=\"images1/slide-2.jpg\" data-thumb=\"images1/thumb-3.jpg\"></div>\n");
      out.write("        <div data-src=\"images1/slide-3.jpg\" data-thumb=\"images1/thumb-1.jpg\"></div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"clear\"></div>\n");
      out.write("  </div>\n");
      out.write("</section>\n");
      out.write("<!--=====================\n");
      out.write("          Content\n");
      out.write("======================-->\n");
      out.write("    \n");
      out.write("\n");
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
