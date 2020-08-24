<%-- 
    Document   : display
    Created on : Aug 24, 2020, 1:04:44 PM
    Author     : Damindu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="database.dbCon"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>

<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="css/animate.css">
	
	<link rel="stylesheet" href="css/icomoon.css">
	<link rel="stylesheet" href="css/themify-icons.css">
        <link rel="stylesheet" href="css/magnific-popup.css">
	<link rel="stylesheet" href="css/bootstrap-datepicker.min.css">
	<link rel="stylesheet" href="css/owl.carousel.min.css">
	<link rel="stylesheet" href="css/owl.theme.default.min.css">
        <link rel="stylesheet" href="css/style.css">
<!DOCTYPE html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin(booking Details)</title>
    </head>
    <body><center><h1> BOOKING DETAILS</h1>

        <table border="1" class="table table-striped">
            <tr>
                <th>Persons</th>
                <th>Date</th>
                <th>Time</th>
                



            </tr>
            <%
                try {
                    Statement statement = null;
                    ResultSet resultSet = null;

                    dbCon obj_DB_Connection = new dbCon();
                    Connection connection = obj_DB_Connection.get_connection();
                    statement = connection.createStatement();
                    String sql = "SELECT * FROM reservation ";

                    resultSet = statement.executeQuery(sql);
                    while (resultSet.next()) {
            %>

            <tr>

                <td><label>
                        
                        <%=resultSet.getString("person")%></label></td>

                <td><label>
                      
                        <%=resultSet.getString("date")%></label></td>
                <td><label>
                       
                        <%=resultSet.getString("time")%></label></td>
              
                <td><form action="deleteservlet" method="post">
                                            <input style="display: none;" type="text" name="req_id"
                                                   value='<%=resultSet.getString("id")%>'>
                                            <button type="submit" class="btn danger" >Delete</button>
                                        </form></td>



            </tr>
            <%
                        }
                    %>

                    <%
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    %>


        </table>  



    </center>
</body>
</html>
