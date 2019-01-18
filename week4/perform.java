import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class perform extends HttpServlet {
	private String message;
	public void init() throws ServletException
	{
		message = "Hello This is SK";
	}
	public void doGet(HttpServletRequest request ,HttpServletResponse response) throws ServletException , IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		//out.println("<h1>"+message+"</h1>");
		out.println("<table style=\" border:10px solid \" >"+"<tr><th>Name</th><th>RollNumber</th><th>Year</th>"+"</tr>"+"<tr>"+"<td>"+request.getParameter("Name")+"</td>"+"<td>"+request.getParameter("Number")+"</td>"+"<td>"+request.getParameter("year")+"</td>"+"</tr>"+"</table>");
	}
	public void destroy()
	{
	}
}