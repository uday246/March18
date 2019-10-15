package Mar15th;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

 public class BelgiumFlag extends JPanel {
	private static final long serialVersionUID = 1L;
public void paint(Graphics g) {
     g.fillRect(120,110,40,160);
      g.setColor(Color.YELLOW);
      g.fillRect(160,110,40,160);
      g.setColor(Color.RED);
      g.fillRect(200,110,40,160);
      
      
    
	
	
  
  
   }
  
   public static void main(String[] args) {
      JFrame f = new JFrame();
      f.getContentPane().add(new BelgiumFlag());
      f.setSize(450, 350);
      f.setVisible(true);
   }
}
