package Mat16th;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SimpleDrawingTool extends JPanel{
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
public void paint(Graphics g) {
      Graphics2D g2 = (Graphics2D)g;
      
      g2.drawString("Text", 2, 12);
   }
   public static void main(String[] args) {
      JFrame f = new JFrame();
      f.getContentPane().add(new SimpleDrawingTool());
      f.setSize(300, 200);
      f.setVisible(true);
   }
}