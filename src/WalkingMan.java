import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

public class WalkingMan extends JComponent implements Update
{
	
	private Ellipse2D.Double head;
	private Rectangle leftArm, rightArm, leftLeg, rightLeg, body;
	private int dx = 0, dy = 0;
	
	public WalkingMan(int x, int y)
	{
		this.setLocation(x, y);
		this.setSize(56, 56);
		head = new Ellipse2D.Double(15, 0, 11, 10);
		leftArm = new Rectangle(6,13,10,5);
		rightArm = new Rectangle(26,13,10,5);
		rightLeg = new Rectangle(23,30,5,15);
		leftLeg = new Rectangle(15,30,5,15);
		body = new Rectangle(16,10,10,20);
	}
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.blue);
		g2.fill(head);
		g2.fill(leftArm);
		g2.fill(rightArm);
		g2.fill(leftLeg);
		g2.fill(rightLeg);
		g2.fill(body);
	}
	
	public void setDX(int x)
	{
		dx = x;
	}
	
	public void setDY(int y)
	{
		dy = y;
	}

	
	public void update() 
	{
		setLocation(getX() + dx, getY() + dy);
	}
}
