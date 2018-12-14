import java.net.*;
import java.io.*;
class sendTcp{
	public static void main (String [] args)throws Exception 
	{
		Socket s = new Socket("127.0.0.1",3500);
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());
		String S = "Hello World";
		dout.writeUTF(S);
	}
}
