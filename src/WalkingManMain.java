import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.Timer;

public class WalkingManMain extends JFrame implements ActionListener 
{
	
	WalkingMan man;

	ArrayList<Ball> ballList;
	public WalkingManMain()
	{
		setTitle("Walking Man");
		setBounds(100, 100, 600, 400);
		setLayout(null);
		
		man = new WalkingMan(20,20);
		
		ballList = new ArrayList<Ball>();
		
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
						if(e.getKeyCode() == e.VK_SPACE)
						{
							Ball ball = new Ball(man.getX() + 8, man.getY());
							add(ball);
							ball.setDX(3);
							ballList.add(ball);
							
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
		for(int i = 0; i< ballList.size(); i++)
		{
			ballList.get(i).update();
		}
		
		repaint();
		
		for(int i=0; i < ballList.size(); i++)
		{
			
			if(ballList.get(i).getX() >= 600)
			{
				remove(ballList.get(i));
				ballList.remove(i);
				i--;
				
			}
			
		}
	}
	
	public static void main(String[] args) 
	{
		new WalkingManMain();
		
	}

	
	

}
