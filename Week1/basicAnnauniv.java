import java.net.*;
import java.io.*;
 class inet
{
	public static void main(String [] args) throws Exception{
		try{
			InetAddress ia = InetAddress.getByName("www.annauniv.edu");
		String S = ia.toString();
		System.out.println("The address is "+S);
	}
	catch(Exception E)
	{
		System.out.println(E)
	}
	}
	}
	