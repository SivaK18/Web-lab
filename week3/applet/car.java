import java.awt.*;
import java.applet.*;

public class car extends Applet
{
	public void init()
	{
		//super();
	}
	
	public void paint(Graphics g)
	{   
	try{
		int i=1;
	    int x=0,y=0,z=0;
		setBackground(Color.black);
	    //while(i==1)
		//{
		//g.wait(5);
		
		//setBackground(Color.black);
		g.setColor(Color.green);
		g.fillRect(20+x,20,200,100);
		g.fillRect(100+x,5,80,25);
		g.setColor(Color.white);
		g.fillOval(20+x,120,10,5);
		g.fillOval(210+x,120,10,5);
	    g.clearRect(0,0,1000,1000);
		x++;
		y++;
		
		//} 
	}
    catch(Exception e)	
	{
	}
		
	}
}
