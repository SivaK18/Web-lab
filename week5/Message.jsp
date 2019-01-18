<%-- 
    Document   : Message.jsp
    Created on : Jan 11, 2019, 3:50:51 PM
    Author     : sf52
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
         <h3><%=request.getAttribute("Message")%></h3>
    </body>
</html>
