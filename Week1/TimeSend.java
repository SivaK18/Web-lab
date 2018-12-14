import java.net.*;
import java.io.*;
import java.time.*;
class sendTcpT{
	public static void main (String [] args)throws Exception 
	{
		Socket s = new Socket("127.0.0.1",3500);
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());
		String S = "Hello World";
		String b = java.time.LocalTime.now().toString();
		
		dout.writeUTF(S+" "+b);
		dout.flush(); 
		dout.writeUTF(b);
		s.close();
		System.out.println("send at "+b);		
	}
}
