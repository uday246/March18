package Mar15th;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

 public class NetherlandsFlag extends JPanel {
	private static final long serialVersionUID = 1L;
public void paint(Graphics g) {
    g.setColor(Color.RED);
	g.fillRect(120,110,140,40);
	
	g.setColor(Color.WHITE);
	g.fillRect(120,150,140,40);
	g.setColor(Color.BLUE);
	g.fillRect(120,190,140,40);
	
	
  
  
   }
  
   public static void main(String[] args) {
      JFrame f = new JFrame();
      f.getContentPane().add(new NetherlandsFlag());
      f.setSize(450, 350);
      f.setVisible(true);
   }
}
