package Mar27th;

import java.awt.Color;
import java.awt.Graphics;
//import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawArcs extends JFrame  
{
	private static final long serialVersionUID = 6244316483407986513L;


	public DrawArcs()
	{
		setTitle("Fans");
		getContentPane().add(new FanssPanel());
		// uncomment the lines 2 get the part 2
		/*getContentPane().add(new FanssPanel());
		getContentPane().add(new FanssPanel());
		getContentPane().add(new FanssPanel());
		
		setLayout(new GridLayout(2, 2));*/
		
		
	}
	
	

	public static void main (String [] args)
	{
		DrawArcs frame = new DrawArcs();
		
	
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(250, 300);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}


	class FanssPanel extends JPanel
	{

		private static final long serialVersionUID = 1L;

		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
	
			int xc = getWidth() / 2;
			int yc = getHeight() / 2;
			int r = (int)(Math.min(getWidth(), getHeight()) * 0.4);
			int x = xc - r;
			int y = yc - r;
		
			g.setColor(Color.blue);
			if(x-r<0)
				x=0;
			
			g.fillOval(x,y, 2 * r, 2 * r);
				
		}
	
	}
	
}