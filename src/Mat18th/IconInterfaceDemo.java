package Mat18th;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;

import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class IconInterfaceDemo extends JPanel {

  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public IconInterfaceDemo() {
  }

  public static void main(String[] a) {
    JFrame mainFrame = new JFrame();

    JLabel label = new JLabel("label");

    label.setIcon(new ColoredSquare(Color.green));
    label.setDisabledIcon(new ColoredSquare(Color.red));

    mainFrame.getContentPane().add(label);

    mainFrame.setSize(100, 100);

    mainFrame.setVisible(true);

  }
}

class ColoredSquare implements Icon {
  Color color;

  public ColoredSquare(Color color) {
    this.color = color;
  }

  public void paintIcon(Component c, Graphics g, int x, int y) {
    Color oldColor = g.getColor();
    g.setColor(color);
    g.fill3DRect(x, y, getIconWidth(), getIconHeight(), true);
    g.setColor(oldColor);
  }

  public int getIconWidth() {
    return 40;
  }

  public int getIconHeight() {
    return 40;
  }
}