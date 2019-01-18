import java.rmi.*;
import java.io.*;
import java.util.*;
public class Client 
{
	public static void main(String args[]) throws Exception
	{
		try 
		{    
			 Scanner sc = new Scanner(System.in);
			 Adder stub =(Adder) Naming.lookup("rmi://localhost:5000/sonoo");
			 System.out.println("enter a num");
			 int x= sc.nextInt();
			 System.out.println("enter a num");
			 int y=sc.nextInt();
			 
			 System.out.println(stub.add(x,y));
			 
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}
