import java.rmi.*;
import java.rmi.server.*;
import java.util.*;

public class Strrev extends UnicastRemoteObject implements str {
	Strrev() throws RemoteException
	{
		super();
	}
	public String rev(String str)
	{
		String str1=" ";
		int n=0;
		//str1=str.rev();
		for(int i= str.length()-1;i>=0;i--)
		{
		                                                                                                                
		}
		//String k="Sivakailash";
		StringBuilder snew=new StringBuilder(str);
		snew=snew.reverse();
		System.out.println(snew);
		
		return(str1);
	}
}