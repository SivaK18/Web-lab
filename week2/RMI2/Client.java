import java.rmi.registry.*;
public class Client 
{
	private Client()
	{
	}
	public static void main(String [] args) throws Exception
	{
		try  
		{
			Registry registry = LocateRegistry.getRegistry(null);
			Hello stub = (Hello) registry.lookup("Hello");
			stub.printMsg();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
