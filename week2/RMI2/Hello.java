import java.rmi.*;
public interface Hello extends Remote
{
	void printMsg () throws RemoteException;
}
