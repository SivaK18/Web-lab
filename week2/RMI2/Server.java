import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;
import java.rmi.server.UnicastRemoteObject;
public class Server extends ImplExample
{
	public Server()
	{
	}
	public static void main(String args []) throws Exception
	{
		try
		{
			ImplExample obj = new ImplExample();
			Hello stub= (Hello) UnicastRemoteObject.exportObject(obj,0);
			Registry registry = LocateRegistry.getRegistry();
			registry.bind("Hello",stub);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	
}
