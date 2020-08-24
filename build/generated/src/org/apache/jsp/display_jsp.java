package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import database.dbCon;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class display_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/animate.css\">\n");
      out.write("\t\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/icomoon.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/themify-icons.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/magnific-popup.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/bootstrap-datepicker.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/owl.theme.default.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Admin</title>\n");
      out.write("    </head>\n");
      out.write("    <body><center><h1> BOOKING DETAILS</h1>\n");
      out.write("\n");
      out.write("        <table border=\"1\" class=\"table table-striped\">\n");
      out.write("            <tr>\n");
      out.write("                <th>Persons</th>\n");
      out.write("                <th>Date</th>\n");
      out.write("                <th>Time</th>\n");
      out.write("                \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </tr>\n");
      out.write("            ");

                try {
                    Statement statement = null;
                    ResultSet resultSet = null;

                    dbCon obj_DB_Connection = new dbCon();
                    Connection connection = obj_DB_Connection.get_connection();
                    statement = connection.createStatement();
                    String sql = "SELECT * FROM reservation ";

                    resultSet = statement.executeQuery(sql);
                    while (resultSet.next()) {
            
      out.write("\n");
      out.write("\n");
      out.write("            <tr>\n");
      out.write("\n");
      out.write("                <td><label>\n");
      out.write("                        \n");
      out.write("                        ");
      out.print(resultSet.getString("person"));
      out.write("</label></td>\n");
      out.write("\n");
      out.write("                <td><label>\n");
      out.write("                      \n");
      out.write("                        ");
      out.print(resultSet.getString("date"));
      out.write("</label></td>\n");
      out.write("                <td><label>\n");
      out.write("                       \n");
      out.write("                        ");
      out.print(resultSet.getString("time"));
      out.write("</label></td>\n");
      out.write("              \n");
      out.write("                <td><form action=\"deleteservlet\" method=\"post\">\n");
      out.write("                                            <input style=\"display: none;\" type=\"text\" name=\"req_id\"\n");
      out.write("                                                   value='");
      out.print(resultSet.getString("id"));
      out.write("'>\n");
      out.write("                                            <button type=\"submit\" class=\"btn danger\" >Delete</button>\n");
      out.write("                                        </form></td>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </tr>\n");
      out.write("            ");

                        }
                    
      out.write("\n");
      out.write("\n");
      out.write("                    ");

                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </table>  \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </center>\n");
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
