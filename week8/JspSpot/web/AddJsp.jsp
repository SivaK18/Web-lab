<%-- 
    Document   : AddJsp
    Created on : Feb 1, 2019, 3:59:13 PM
    Author     : sf52
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% class add{
            int a,b;int ans; 
    
    add(){}
    int addv(int a,int b){
        ans=a+b;
       return ans;
    }
    
}; %>

<%    int a=Integer.parseInt(request.getParameter("FirstNumber"));
int b=Integer.parseInt(request.getParameter("LastNumber"));
add k=new add();

int z=k.addv(a, b);
%> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Add</title>
    </head>
    <body>
    <center><h1>Answer is !</h1></center>
        <% out.print("<p align=\"center\">"+z); %>
        <% out.print("</p>"); %>
    </body>
</html>
