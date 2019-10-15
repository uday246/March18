package Mat16th;

import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
public class JFrmaeGraphics extends JPanel{
	public void paint(Graphics g){
		
		g.setFont(new Font("sansarif", Font.PLAIN, 10));
		g.drawString(" Sun Mon Tue Wed Thu Fri Sat", 25, 15);
		for (int i=1; i< 8; i++){
		g.drawRect(25, 25,i* 25,25);
		g.drawRect(25, 25,i* 25,50);
		g.drawRect(25, 25,i* 25,75);
		g.drawRect(25, 25,i* 25,100);
		g.drawRect(25, 25,i* 25,125);		
	}
	}
	public static void main(String[] args){
		JFrame frame= new JFrame("Welecome to JavaTutorial.net");	
		frame.getContentPane().add(new JFrmaeGraphics());
		frame.setSize(600, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);		
	}
}