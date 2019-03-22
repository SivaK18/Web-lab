<%-- 
    Document   : ReadDel.jsp
    Created on : Feb 1, 2019, 2:57:50 PM
    Author     : sf52
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Reading Cookie</title>
    </head>
    <body><center>
        <h1>Reading Cookies!</h1></center>
    <% Cookie cookie=null; 
    Cookie cookies[]=null;
    cookies=request.getCookies();
    if(cookies!=null)
    {out.println("<h2> Found Cookie name and value </h2>");
    for(int i=0;i<cookies.length;i++)
    {
    cookie=cookies[i];
    if((cookie.getName()).compareTo("FirstName")==0)
    {cookie.setMaxAge(0);
    response.addCookie(cookie);
    out.println("Deleted Cookie : "+ cookie.getName()+"<br/>" );
    }
    out.println("<ul color=\"red\"><li>Name : <b>"+cookie.getName()+"</b></li><li>Value : <b>"+cookie.getValue()+"</b></li></ul>");    
    }
    }
    else
    out.print("No Cookie");
    
    %>
     <center><form id = "rd" action="index.html" method="GET">
             <input type="submit" value ="Go Back to Home">
            </form>
            </center>   
    </body>
</html>
