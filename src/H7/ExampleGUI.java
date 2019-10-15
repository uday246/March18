package H7;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ExampleGUI extends JFrame {

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private JPanel contentPane;
public void paint(Graphics g) {
	
	
    g.setColor(Color.BLACK);
	g.fillRect(20,50,150,150);
	g.fillRect(190,50,150,150);
	
  
  
   }



public static void main(String[] args) {
  EventQueue.invokeLater(new Runnable() {
   public void run() {
    try {
     ExampleGUI frame = new ExampleGUI();
     frame.setVisible(true);
     frame.setSize(400,400);
     
    } catch (Exception e) {
     e.printStackTrace();
    }
   }
  });
}

/**
* Create the frame.
*/
public ExampleGUI() {
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setBounds(100, 100, 450, 300);
  contentPane = new JPanel();
  
  contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
  contentPane.setLayout(new BorderLayout(0, 0));
  setContentPane(contentPane);
}

}