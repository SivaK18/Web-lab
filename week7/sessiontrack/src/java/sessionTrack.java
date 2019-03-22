/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.*;
/**
 *
 * @author sf52
 */
@WebServlet(urlPatterns = {"/sessionTrack"})
public class sessionTrack extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet sessionTrack</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet sessionTrack at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
        
        
        
        
        
        
        
    }
    public void doGet(HttpServletRequest req , HttpServletResponse res)
            throws ServletException, IOException {
    HttpSession session = req.getSession(true);
    Date CreateTime = new Date(session.getCreationTime());
    Date LastAccessTime = new Date(session.getLastAccessedTime());
    String Title = "Welcome Back To my WebSite";
    Integer VisitCount = new Integer(0);
    String VisitCountKey = new String("VisitCount");
    String UserIDKey = new String("UserIDKey");
    String UserID = new String("ABCD");
    res.setContentType("text/html");
    PrintWriter out = res.getWriter();
    if(session.isNew())
    {
        Title ="Hello Welcome To my Website";
        session.setAttribute(UserIDKey, UserID);
        
        
    }
    else
    {
        VisitCount = (Integer)session.getAttribute(VisitCountKey);
        VisitCount=VisitCount+1;
        UserID=(String)session.getAttribute(UserIDKey);
    }
    session.setAttribute(VisitCountKey,VisitCount);
    
    String doctype = "<!doctype html public \"-//w3c//dtd// html 4.0"+"transtitional//en\">\n";
    out.println(doctype);
    out.println(VisitCountKey);
    out.println("\n <html>\n<head><title>"+Title+"</title></head><body bgcolor = \"#FOFOFO\">");
    out.println("<h1 align = \"center\">"+Title+"</h1>\n<h2 align=\"center\"> Session Info </h2>");
    out.println("<table border=\"1\" align =\"center\">\n");
    out.println("<tr bgcolour=\"#949494\"> <th>session Info </th> <th>Value</th></tr>");
    out.println("<tr><td>ID</td><td>"+session.getId()+"</td></tr>");
    out.println("<tr><td>Creation Time</td><td>"+CreateTime+"</td></tr>");
    out.println("<tr><td>Time of Last Access</td><td>"+LastAccessTime+"</td></tr>");
    out.println("<tr><td>UserID</td><td>"+UserID+"</td></tr>");
    out.println("<tr><td>No of Visits</td><td>");
    out.println(VisitCount);
    out.println("</td></tr>");
    out.println("</table></body></html>");
    
    }
    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    

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
