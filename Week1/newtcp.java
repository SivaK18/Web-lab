import java.net.*;
import java.io.*;
class recTcp{
	public static void main (String [] args)throws Exception 
	{
		ServerSocket ss = new ServerSocket(3500);
		Socket s = ss.accept();
		DataInputStream din = new DataInputStream(s.getInputStream());
		String S = (String)din.readUTF();
		System.out.println(S);
	}
}
