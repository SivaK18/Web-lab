import java.io.*;
import javax.Servlet.*;
import javax.Servlet.http.*;
public class HelloWorld extends HTTPServlet {
	private String message;
	public void init() throws ServletException
	{
		message = "Hello This is SK";
	}
	public void doget(HTTPServletRequest request ,HTTPServletResponse response) throws ServletException , IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getwriter();
		out.println("<h1>"+message+"</h1>");
	}
	public void destroy()
	{
	}
}
