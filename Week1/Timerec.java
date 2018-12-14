import java.net.*;
import java.io.*;
class recTcpT{
	public static void main (String [] args)throws Exception 
	{
		ServerSocket ss = new ServerSocket(3500);
		Socket s = ss.accept();
		DataInputStream din = new DataInputStream(s.getInputStream());
		String S = (String)din.readUTF();
		String b = (String)din.readUTF();
		System.out.println("Data is "+S+" sent at "+b);
		System.out.println("Received at "+java.time.LocalTime.now());
		
	}
}
