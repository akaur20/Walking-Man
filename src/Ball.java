import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

public class Ball extends JComponent
{

	private Ellipse2D.Double ball;
	private int dx = 0, dy = 0;
	
	
	public Ball(int x, int y)
	{
		ball = new Ellipse2D.Double(0, 0, 10, 10);
		this.setSize(11,11);
		this.setLocation(x, y);
	}
	
	public void paintCompoonent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		g2.draw(ball);
	}
	
	public void setDX(int x)
	{
		dx = x;
	}
	
	public void setDY(int y)
	{
		dy = y;
	}

}
