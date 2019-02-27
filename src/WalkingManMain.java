import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class WalkingManMain extends JFrame 
{

	public WalkingManMain()
	{
		setTitle("Walking Man");
		setBounds(100, 100, 600, 400);
		setLayout(null);
		
		WalkingMan man = new WalkingMan(20,20);
		
		addKeyListener(new KeyListener()
				{

					@Override
					public void keyPressed(KeyEvent arg0) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void keyReleased(KeyEvent arg0) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void keyTyped(KeyEvent arg0) {
						// TODO Auto-generated method stub
						
					}
			
					// height head plus height body plus height leg
				
				});
		add(man);
	
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) 
	{
		new WalkingManMain();
	}

}
