/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import database.dbCon;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Damindu
 */
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        try {

            String username = request.getParameter("user");
            String password = request.getParameter("pass");
            String dbUsername = null;
            String dbPassword = null;
            String dbtype = null;
            String userid = null;

            dbCon obj_DB_Connection = new dbCon();
            Connection connection = obj_DB_Connection.get_connection();
            PreparedStatement ps = null;
            ResultSet rs = null;

            String sql = "select username,password,type , id from users where username=? and password=?";
            Class.forName("com.mysql.jdbc.Driver");
            ps = connection.prepareStatement(sql);

            ps.setString(1, username);
            ps.setString(2, password);
            rs = ps.executeQuery();
            while (rs.next()) {
                dbUsername = rs.getString(1);
                dbPassword = rs.getString(2);
                dbtype = rs.getString(3);
                userid = rs.getString(4);
            }
            if (username.equals(dbUsername) && password.equals(dbPassword)) {

                HttpSession session = request.getSession();
                session.setAttribute("LogedInUserName", username);
                session.setAttribute("LogedInUserid", userid);
                session.setAttribute("LogedInUserType", dbtype);

                if (dbtype.equals("admin")) {
                    session.setAttribute("LogedInOwnerName", username);

                    out.println("<script type=\"text/javascript\">");
                    out.println("location='Admin.jsp';");
                    out.println("</script>");
                } else {
                    session.setAttribute("LogedInUserName", username);

                    out.println("<script type=\"text/javascript\">");
                    out.println("location='home.html';");
                    out.println("</script>");
                }

            } else {
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Username Or Password is wrong !!');");
                out.println("location='login.jsp';");
                out.println("</script>");
            }

        } catch (SQLException ex) {
            out.println(ex);
        } catch (ClassNotFoundException ex) {
            out.println(ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
