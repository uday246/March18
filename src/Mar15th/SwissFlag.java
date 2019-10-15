package Mar15th;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JFrame;
import javax.swing.JPanel;

 public class SwissFlag extends JPanel {
	private static final long serialVersionUID = 1L;
public void paint(Graphics g) {
    g.setColor(Color.RED);
	g.fillRect(120,110,150,150);
	
	Graphics2D g2 = (Graphics2D) g;
    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    g2.setFont(new Font("Serif", Font.PLAIN, 150));
    g.setColor(Color.white);
	      g2.drawString("+",140,240);
	
  
  
   }
  
   public static void main(String[] args) {
      JFrame f = new JFrame();
      f.getContentPane().add(new SwissFlag());
      f.setSize(450, 350);
      f.setVisible(true);
   }
}
