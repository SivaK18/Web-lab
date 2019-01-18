import java.awt.*;
import java.applet.*;

public class shapes extends Applet
{
	public void paint(Graphics g)
	{
		g.drawString("Cylinder",10,100);
		g.setColor(Color.red);
		//g.drawRect(10,100,20,20);
		g.fillOval(10,10,50,10);
		//g.setColor(Color.yellow);
		g.fillOval(10,80,50,10);
		g.setColor(Color.blue);
		//g.drawRect(10,15,60,85);
		g.drawLine(10,15,10,85);
		g.drawLine(60,15,60,85);
		g.setColor(Color.green);
		g.fillRect(11,15,49,70);
		
		g.drawString("Cube",100,110);
		
		g.fillRect(80,10,50,50);
		g.setColor(Color.red);
		g.fillRect(95,25,50,50);
		g.setColor(Color.blue);
		g.drawLine(80,10,95,25);
		g.drawLine(130,10,145,25);
		g.drawLine(80,60,95,75);
		//g.drawLine(130,60,95,75);
		//delay(700);
		
		g.drawString("Square Inside a Circle",150,110);
		g.setColor(Color.orange);
		g.fillOval(180,10,80,80);
		g.setColor(Color.blue);
		g.fillRect(192,22,55,55);
		
		g.drawString("Circle Inside a Square",280,110);
		
		g.setColor(Color.blue);
		g.fillRect(290,10,80,80);
		g.setColor(Color.orange);
		g.fillOval(290,10,80,80);
		
		g.setColor(Color.red);
		g.drawString("PolyGon",270,195);
		int a[]={200,300,200,300};
		int b[]={200,300,300,200};
		g.fillPolygon(a,b,4);
		
		g.setColor(Color.yellow);
		g.fillOval(50,200,150,110);
		g.setColor(Color.green);
		g.fillOval(65,230,20,50);
		g.fillOval(165,230,20,50);
		
		
	
	}
	
	
	
}