import java.rmi.*;
public interface str extends Remote
{
	public String rev (String str) throws RemoteException;
}
