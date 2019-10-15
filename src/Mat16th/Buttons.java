package Mat16th;


import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class Buttons {  
static    JFrame frame = new JFrame("JFrame Example");  
static JTextField textF= new JTextField(10);
	public static void main(String s[]) {  
        JPanel panel = new JPanel();  
        GridLayout grid = new GridLayout(3,5);
        panel.setLayout(grid);  
        JLabel label1 = new JLabel("Button Pressed");  
        panel.add(label1);
        panel.add(textF);
        MyActionListner al = new MyActionListner();
        
        JButton button1 = new JButton();  
        button1.setText("Button1");  
        panel.add(button1);
        button1.addActionListener(al);
        
        JButton button2 = new JButton();  
        button2.setText("Button2");  
        panel.add(button2);
        button2.addActionListener(al);
        
        JButton button3 = new JButton();  
        button3.setText("Button3");  
        panel.add(button3);
        button3.addActionListener(al);
        
        
        JButton button4 = new JButton();  
        button4.setText("Button4");  
        panel.add(button4);
        button4.addActionListener(al);
        
        
        JButton button5 = new JButton();  
        button5.setText("Button5");  
        panel.add(button5);
        button5.addActionListener(al);
        
        JButton button6 = new JButton();  
        button6.setText("Button6");  
        panel.add(button6);
        button6.addActionListener(al);
        
        JButton button7 = new JButton();  
        button7.setText("Button7");  
        panel.add(button7);
        button7.addActionListener(al);
        
        JButton button8 = new JButton();  
        button8.setText("Button8");  
        panel.add(button8);
        button8.addActionListener(al);
        
        JButton button9 = new JButton();  
        button9.setText("Button9");  
        panel.add(button9);
        button9.addActionListener(al);
        
        JButton button10 = new JButton();  
        button10.setText("Button10");  
        panel.add(button10);
        button10.addActionListener(al);
        
        frame.add(panel);
        
        
        frame.setSize(600, 300);  
        frame.setLocationRelativeTo(null);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.setVisible(true);  
    }  
}  
// action listner which gets invoked when button clicked
class MyActionListner implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent aE) {
	    String command = ((JButton) aE.getSource()).getActionCommand();
	    command+=" Pressed";
	    System.out.println(command);
	    Buttons.textF.setText(command);
	}
	
}