package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Connection;
import database.dbCon;
import java.sql.ResultSet;
import java.sql.Statement;

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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <script>function openCity(evt, reservation) {\n");
      out.write("  // Declare all variables\n");
      out.write("  var i, tabcontent, tablinks;\n");
      out.write("\n");
      out.write("  // Get all elements with class=\"tabcontent\" and hide them\n");
      out.write("  tabcontent = document.getElementsByClassName(\"tabcontent\");\n");
      out.write("  for (i = 0; i < tabcontent.length; i++) {\n");
      out.write("    tabcontent[i].style.display = \"none\";\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  // Get all elements with class=\"tablinks\" and remove the class \"active\"\n");
      out.write("  tablinks = document.getElementsByClassName(\"tablinks\");\n");
      out.write("  for (i = 0; i < tablinks.length; i++) {\n");
      out.write("    tablinks[i].className = tablinks[i].className.replace(\" active\", \"\");\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  // Show the current tab, and add an \"active\" class to the button that opened the tab\n");
      out.write("  document.getElementById(reservation).style.display = \"block\";\n");
      out.write("  evt.currentTarget.className += \" active\";\n");
      out.write("}</script>\n");
      out.write("        <style>\n");
      out.write("            .tab {\n");
      out.write("  overflow: hidden;\n");
      out.write("  border: 1px solid #ccc;\n");
      out.write("  background-color: #f1f1f1;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Style the buttons that are used to open the tab content */\n");
      out.write(".tab button {\n");
      out.write("  background-color: inherit;\n");
      out.write("  float: left;\n");
      out.write("  border: none;\n");
      out.write("  outline: none;\n");
      out.write("  cursor: pointer;\n");
      out.write("  padding: 14px 16px;\n");
      out.write("  transition: 0.3s;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Change background color of buttons on hover */\n");
      out.write(".tab button:hover {\n");
      out.write("  background-color: #ddd;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Create an active/current tablink class */\n");
      out.write(".tab button.active {\n");
      out.write("  background-color: #ccc;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Style the tab content */\n");
      out.write(".tabcontent {\n");
      out.write("  display: none;\n");
      out.write("  padding: 6px 12px;\n");
      out.write("  border: 1px solid #ccc;\n");
      out.write("  border-top: none;\n");
      out.write("}\n");
      out.write("<header id=\"gtco-header\" class=\"gtco-cover gtco-cover-md\" role=\"banner\" style=\"background-image: url(images/img_bg_1.jpg)\" data-stellar-background-ratio=\"0.5\">\n");
      out.write("            </style>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"tab\">\n");
      out.write("  <button class=\"tablinks\" onclick=\"openCity(event, 'reservation')\">Reservation</button>\n");
      out.write("  <button class=\"tablinks\" onclick=\"openCity(event, 'registedUsers')\">Registered users</button>\n");
      out.write("<button class=\"tablinks\" onclick=\"openCity(event, 'comment')\">Comment</button>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- Tab content -->\n");
      out.write("<div id=\"reservation\" class=\"tabcontent\">\n");
      out.write("   <table border=\"1\" class=\"table table-striped\">\n");
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
      out.write("</div>\n");
      out.write("\n");
      out.write("<div id=\"registedUsers\" class=\"tabcontent\">\n");
      out.write("  <h3>Registered Users</h3>\n");
      out.write("  <table border=\"1\" class=\"table table-striped\">\n");
      out.write("            <tr>\n");
      out.write("                <th>username</th>\n");
      out.write("                <th>Email</th>\n");
      out.write("                \n");
      out.write("            \n");
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
                    String sql = "SELECT * FROM users ";

                    resultSet = statement.executeQuery(sql);
                    while (resultSet.next()) {
            
      out.write("\n");
      out.write("\n");
      out.write("            <tr>\n");
      out.write("\n");
      out.write("                <td><label>\n");
      out.write("                        \n");
      out.write("                        ");
      out.print(resultSet.getString("username"));
      out.write("</label></td>\n");
      out.write("\n");
      out.write("                <td><label>\n");
      out.write("                      \n");
      out.write("                        ");
      out.print(resultSet.getString("Email"));
      out.write("</label></td>\n");
      out.write("               \n");
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
      out.write("</div>\n");
      out.write("                    <div id=\"comment\" class=\"tabcontent\">\n");
      out.write("  <h3>Feedback</h3>\n");
      out.write("  <table border=\"1\" class=\"table table-striped\">\n");
      out.write("            <tr>\n");
      out.write("                <th>Name</th>\n");
      out.write("                <th>Email</th>\n");
      out.write("                <th>Comment</th>\n");
      out.write("                \n");
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
                    String sql = "SELECT * FROM comment ";

                    resultSet = statement.executeQuery(sql);
                    while (resultSet.next()) {
            
      out.write("\n");
      out.write("\n");
      out.write("            <tr>\n");
      out.write("\n");
      out.write("                <td><label>\n");
      out.write("                        \n");
      out.write("                        ");
      out.print(resultSet.getString("firstname"));
      out.write("</label></td>\n");
      out.write("\n");
      out.write("                <td><label>\n");
      out.write("                      \n");
      out.write("                        ");
      out.print(resultSet.getString("email"));
      out.write("</label></td>\n");
      out.write("                <td><label>\n");
      out.write("                      \n");
      out.write("                        ");
      out.print(resultSet.getString("description"));
      out.write("</label></td>\n");
      out.write("               \n");
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
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("       \n");
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
