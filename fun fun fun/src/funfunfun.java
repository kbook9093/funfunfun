import java.awt.*;
import java.applet.*;
public class funfunfun extends Applet
{
	public void paint(Graphics g)
	{
	for (int red=0;red<=255;red++)
	{
		g.setColor(new Color(red,0,0));
		g.drawLine(red,0,red,600);
		}
	
	for (int green=0;green<=255;green++)
	{
		g.setColor(new Color(0,green,0));
		g.drawLine(green+255,0, green+255,600);
		}
	
	for (int blue=0;blue<=255;blue++)
	{
		g.setColor(new Color(0,0,blue));
		g.drawLine(blue+510,0,blue+510,600);
		}
	g.setColor(new Color(0,0,0));
	g.fillRect(800, 0, 800, 200);
	
	g.setColor(new Color(255,0,0));
	g.fillRect(800,200,800,200);
	
	g.setColor(new Color(250,210,0));
	g.fillRect(800, 400, 800, 200);
	}
}
