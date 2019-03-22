<%-- 
    Document   : main
    Created on : Feb 1, 2019, 2:30:59 PM
    Author     : sf52
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% Cookie FirstName = new Cookie("FirstName",request.getParameter("FirstName")); 
Cookie LastName = new Cookie("LastName",request.getParameter("LastName"));
FirstName.setMaxAge(60*60);
LastName.setMaxAge(60*60);
response.addCookie(FirstName);
response.addCookie(LastName);

%>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Set Cookie</title>
    </head>
    <body><center>
        <h1>Set Cookie</h1>
            </center>
    <ul> <li> <p><b>FirstName</b>
                <%= request.getParameter("FirstName") %>
                </p>
                </li>
            <li> <p><b>LastName</b>
                <%= request.getParameter("LastName") %>
                </p>
                </li>
                </ul>
            <center><form id = "rd" action="index.html" method="GET">
             <input type="submit" value ="Go Back to Home">
            </form>
            </center>    

    </body>
</html>
