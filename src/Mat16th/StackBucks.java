package Mat16th;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class StackBucks extends JPanel {
	private static final long serialVersionUID = 1L;
	boolean flag;
	int y=100;
	public void paint(Graphics g) {
	    g.setColor(Color.BLUE);
		g.fillRect(200, 100, 600, 900);
	    flag = true;
	   
	    	g.setColor(Color.RED);
			g.fillRect(200, 100, 600, y);
			y+=10;
	}
	    
		
	  public void drawBrick(){
		  repaint();
	  }
	   public static void main(String[] args) {
	      JFrame f = new JFrame();
	      f.getContentPane().add(new StackBucks());
	      f.setBackground(Color.WHITE);
	      f.setSize(1200, 1200);
	      f.setVisible(true);
	      f.setLayout(null);
	      JButton button = new JButton("Add Brick");
	      button.setBounds(50, 50, 100, 30);
	      f.add(button);
	      StackBucks s = new StackBucks();
	      for(int i=0;i<5;i++)
	      {
	    	  s.drawBrick();
	    	  try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	      }
	   }
	  
	   
	   
	   
}
