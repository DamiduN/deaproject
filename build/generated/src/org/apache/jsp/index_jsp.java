package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Savory</title>\n");
      out.write("</head>\n");
      out.write("<link rel=\"icon\" type=\"image/png\" href=\"images/images.png\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\tsetTimeout(function(){\n");
      out.write("\t\tvar user_check_val = document.getElementById('user_check').innerText;\n");
      out.write("\t\tvar usertype_check_val = document.getElementById('usertype_check').innerText;\n");
      out.write("\t\t\n");
      out.write("\t    if(user_check_val == \"null\"){\n");
      out.write("\t      \twindow.location.href = \"login.jsp\";\n");
      out.write("\t    }\n");
      out.write("\t    else{\n");
      out.write("\t    \tif(usertype_check_val == \"owner\"){\n");
      out.write("\t    \t\twindow.location.href = \"owner/home.jsp\";\n");
      out.write("\t    \t}\n");
      out.write("\t    \telse if(usertype_check_val == \"manager\"){\n");
      out.write("\t    \t\twindow.location.href = \"manager/home.jsp\";\n");
      out.write("\t    \t}\n");
      out.write("\t    \telse{\n");
      out.write("\t    \t\twindow.location.href = \"user/home.jsp\";\n");
      out.write("\t    \t}\n");
      out.write("\t    }\n");
      out.write("         }, 2500);\n");
      out.write("</script>\n");
      out.write("<style type=\"text/css\">\n");
      out.write(".img_cls {\n");
      out.write("\ttop: 50%;\n");
      out.write("\tleft: 50%;\n");
      out.write("\tposition: absolute;\n");
      out.write("\ttransform: translate(-50%, -50%);\n");
      out.write("\tpadding: 30px;\n");
      out.write("\tborder-radius: 50%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".loading_img {\n");
      out.write("\ttop: 60%;\n");
      out.write("\tleft: 50%;\n");
      out.write("\tposition: absolute;\n");
      out.write("\ttransform: translate(-50%, -50%);\n");
      out.write("\twidth: 300px;\n");
      out.write("\theight: 25px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\t<img src=\"images/logo_white.png\" class=\"w3-blue img_cls\" style=\"\">\n");
      out.write("\n");
      out.write("\t<img src=\"images/images.png\" class=\"loading_img\">\n");
      out.write("\n");
      out.write("\t<p id=\"user_check\" style=\"display: none;\">");
      out.print( session.getAttribute( "LogedInUserName" ) );
      out.write("</p>\n");
      out.write("\t<p id=\"usertype_check\" style=\"display: none;\">");
      out.print( session.getAttribute( "LogedInUserType" ) );
      out.write("</p>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
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
