import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.Timer;

public class WalkingManMain extends JFrame implements ActionListener 
{
	
	WalkingMan man;
	Ball ball;
	public WalkingManMain()
	{
		setTitle("Walking Man");
		setBounds(100, 100, 600, 400);
		setLayout(null);
		
		man = new WalkingMan(20,20);
		
		addKeyListener(new KeyListener()
				{

					
					public void keyPressed(KeyEvent e) 
					{
						if(e.getKeyCode() == e.VK_UP)
						{
							
							if(man.getY() <= 10)
							{
								man.setDY(0);
							}
							else
							{
								man.setDY(-3);
							}
							
							
						}
						
						else if(e.getKeyCode() == e.VK_DOWN)
						{
							
							if(man.getY() >= 299)
							{
								man.setDY(0);
							}
							else
							{
								man.setDY(3);
							}
							
						}
						
						
						else if(e.getKeyCode() == e.VK_RIGHT)
						{
							if(man.getX() >= 520)
							{
								man.setDX(0);
							}
							else
							{
								man.setDX(3);
							}
							
							
						}
						
						else if(e.getKeyCode() == e.VK_LEFT)
						{
							if(man.getX() <= 2)
							{
								man.setDX(0);
							}
							else
							{
								man.setDX(-3);
							}
							
						}
						if(e.getKeyCode() == e.VK_ENTER)
						{
							ball = new Ball(man.getX() + 8, man.getY());
							ball.setDX(3);
							add(ball);
						}
						
					}

				
					public void keyReleased(KeyEvent e) 
					{
						if(e.getKeyCode() == e.VK_UP)
						{
							man.setDY(0);
						}
						
						else if(e.getKeyCode() == e.VK_DOWN)
						{
							man.setDY(0);
						}
						
						
						else if(e.getKeyCode() == e.VK_RIGHT)
						{
							man.setDX(0);
						}
						
						else if(e.getKeyCode() == e.VK_LEFT)
						{
							man.setDX(0);
						}

						
					}

					
					public void keyTyped(KeyEvent arg0) 
					{
						// TODO Auto-generated method stub
						
					}
				
				});
		add(man);
	
		
		Timer t1 = new Timer(40, this);
		t1.start();
		
		setFocusable(true);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public void actionPerformed(ActionEvent arg0) 
	{
		
		
		man.update();
		repaint();
	}
	
	public static void main(String[] args) 
	{
		new WalkingManMain();
	}

	
	

}
