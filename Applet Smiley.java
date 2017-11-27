import java.util.*;
import java.awt.*;
import java.applet.*;

public class smiley extends Applet{
	
	public void paint(Graphics g)
	{
		Color yllow=new Color(255,155,51);
		g.drawOval(100,100,100,100);
		g.setColor(yllow);
		g.fillOval(100,100,100,100);
		g.setColor(Color.white);
		g.drawOval(125,130,20,20);
		g.fillOval(125,130,20,20);
		g.drawOval(155,130,20,20);
		g.fillOval(155,130,20,20);
		g.setColor(Color.black);
		
		g.drawOval(130,135,14,14);
		g.fillOval(130,135,14,14);
		g.drawOval(160,135,14,14);
		g.fillOval(160,135,14,14);
		g.drawLine(130,170,170,170);
	}
}
