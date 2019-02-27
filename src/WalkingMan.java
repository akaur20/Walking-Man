import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

public class WalkingMan extends JComponent
{
	
	private Ellipse2D.Double head;
	private Rectangle leftArm, rightArm, leftLeg, rightLeg, body;
	
	public WalkingMan(int x, int y)
	{
		this.setLocation(x, y);
		this.setSize(31, 56);
		head = new Ellipse2D.Double(15, 0, 10, 10);
		leftArm = new Rectangle(8,2,4,7);
		rightArm = new Rectangle(6,3,4,7);
		rightLeg = new Rectangle(5,1,4,7);
		leftLeg = new Rectangle(12,7,4,7);
		body = new Rectangle(8,5,5,10);
	}
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		g2.draw(head);
		g2.draw(leftArm);
		g2.draw(rightArm);
		g2.draw(leftLeg);
		g2.draw(body);
	}
}
