import java.awt.*;
import java.applet.*;
import java.util.*;

public class newapp extends Applet{
	public void paint(Graphics g)
	{
		Date d = new Date();
		g.setColor(Color.red);
		
		int x = Integer.parseInt(getParameter("x1"));
		int y = Integer.parseInt(getParameter("y1"));
		
		g.drawString("SYSTEM DATE AND TIME  : " +d,x,y);
		g.setColor(Color.blue);
		g.drawString("SIT", 300,100);
		showStatus("Applet STaYus");
		}
}
