import java.net.*;
 class rec{
	public static void main(String [] args) throws Exception {
		DatagramSocket ds = new DatagramSocket(9098);
		byte [] buf = new byte[1024];
		DatagramPacket dp = new DatagramPacket(buf,1024);
		ds.receive(dp);
		String S= new String(dp.getData(),0,dp.getLength());
		System.out.println("Message is "+S);
		ds.close();
	}
}
