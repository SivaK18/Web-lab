<%-- 
    Document   : refresh
    Created on : Feb 1, 2019, 1:25:22 PM
    Author     : sf52
--%>

<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8" import="java.io.*,java.util.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Auto Page Refresh</title>
    </head>
    <body>
    <center>
        <h1>Auto Refresh !</h1>
        <% response.setIntHeader("Refresh",5);
        Calendar Calendar = new GregorianCalendar();
        String am_pm;
        Date d = new Date();
        out.println("LAST REFRESHED AT  "+d);
        
        
        
        %>
    </center>
    </body>
    
</html>
