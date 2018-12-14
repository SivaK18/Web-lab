import java.net.*;
class sender{
	public static void main(String [] args) throws Exception {
		DatagramSocket ds = new DatagramSocket();
		InetAddress ia = InetAddress.getByName("127.0.0.1");
		String S = " Sending Text ";
		DatagramPacket dp = new DatagramPacket(S.getBytes(),S.length(),ia,9098);
		//System.out.println(ia);
		ds.send(dp);
		ds.close();
	}
}

	
		