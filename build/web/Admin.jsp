<%-- 
    Document   : Admin
    Created on : Aug 24, 2020, 1:28:31 PM
    Author     : Damindu
--%>

<%@page import="java.sql.Connection"%>
<%@page import="database.dbCon"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <script>function openCity(evt, reservation) {
  // Declare all variables
  var i, tabcontent, tablinks;

  // Get all elements with class="tabcontent" and hide them
  tabcontent = document.getElementsByClassName("tabcontent");
  for (i = 0; i < tabcontent.length; i++) {
    tabcontent[i].style.display = "none";
  }

  // Get all elements with class="tablinks" and remove the class "active"
  tablinks = document.getElementsByClassName("tablinks");
  for (i = 0; i < tablinks.length; i++) {
    tablinks[i].className = tablinks[i].className.replace(" active", "");
  }

  // Show the current tab, and add an "active" class to the button that opened the tab
  document.getElementById(reservation).style.display = "block";
  evt.currentTarget.className += " active";
}</script>
        <style>
            .tab {
  overflow: hidden;
  border: 1px solid #ccc;
  background-color: #f1f1f1;
}

/* Style the buttons that are used to open the tab content */
.tab button {
  background-color: inherit;
  float: left;
  border: none;
  outline: none;
  cursor: pointer;
  padding: 14px 16px;
  transition: 0.3s;
}

/* Change background color of buttons on hover */
.tab button:hover {
  background-color: #ddd;
}

/* Create an active/current tablink class */
.tab button.active {
  background-color: #ccc;
}

/* Style the tab content */
.tabcontent {
  display: none;
  padding: 6px 12px;
  border: 1px solid #ccc;
  border-top: none;
}
            </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="tab">
  <button class="tablinks" onclick="openCity(event, 'reservation')">Reservation</button>
  <button class="tablinks" onclick="openCity(event, 'registedUsers')">Registered users</button>

</div>

<!-- Tab content -->
<div id="reservation" class="tabcontent">
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
</div>

<div id="registedUsers" class="tabcontent">
  <h3>Registered Users</h3>
  <table border="1" class="table table-striped">
            <tr>
                <th>username</th>
                <th>Email</th>
                
                <th></th>



            </tr>
            <%
                try {
                    Statement statement = null;
                    ResultSet resultSet = null;

                    dbCon obj_DB_Connection = new dbCon();
                    Connection connection = obj_DB_Connection.get_connection();
                    statement = connection.createStatement();
                    String sql = "SELECT * FROM users ";

                    resultSet = statement.executeQuery(sql);
                    while (resultSet.next()) {
            %>

            <tr>

                <td><label>
                        
                        <%=resultSet.getString("username")%></label></td>

                <td><label>
                      
                        <%=resultSet.getString("Email")%></label></td>
               
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

</div>


       
    </body>
</html>
