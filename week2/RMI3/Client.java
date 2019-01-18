import java.rmi.*;
import java.io.*;
import java.util.*;
public class Client 
{
	public static void main(String args[]) throws Exception
	{
		try 
		{    Scanner sc = new Scanner(System.in);
			 str stub =(str) Naming.lookup("rmi://localhost:5000/sonoo");
			 System.out.println("enter a name");
			 String s = sc.next();
			 System.out.println(stub.rev(s));
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}
