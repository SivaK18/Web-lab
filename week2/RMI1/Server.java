import java.rmi.*;
import java.rmi.server.*;
public class Server
{
	public static void main(String []args) throws Exception
	{
		try
		{
			Adder ske=new AdderRemote();
			Naming.rebind("rmi://localhost:5000/sonoo",ske);
	}
	catch (Exception e)
	{
		System.out.println(e);
	}
	}
}	

