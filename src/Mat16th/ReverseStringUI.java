package Mat16th;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class ReverseStringUI {  
static    JFrame frame = new JFrame("JFrame Example");  
static JTextField reverse= new JTextField(10);
static JTextField str= new JTextField(10);

	public static void main(String s[]) {  
        JPanel panel = new JPanel();  
        panel.setLayout(null);  
        JLabel label1 = new JLabel("Actual String");  
        label1.setBounds(200, 50, 100, 30);
        str.setBounds(320, 50, 100, 30);
        JLabel label2 = new JLabel("Reversed String");  
        label2.setBounds(200, 100, 100, 30);
        // password field
        reverse.setBounds(320, 100, 100, 30);
        
        JButton convert = new JButton();  
        convert.setText("Reverse");  
        convert.setBounds(200, 150, 100, 20);

        JButton exit = new JButton();  
        exit.setText("Exit");  
        exit.setBounds(320, 150, 100, 20);
        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
            	LoginGui.frame.dispose();
            }
        });
        
        str.addKeyListener(new KeyAdapter() {
        	public void keyReleased(KeyEvent e) {
                
              }

              public void keyTyped(KeyEvent e) {
              }

              public void keyPressed(KeyEvent e) {
            	  // if typed code is Enter on textfield than reversing the string
            	  if(e.getKeyCode()==KeyEvent.VK_ENTER){
                  	ReverseStringUI.reverse.setText(new StringBuffer(ReverseStringUI.str.getText()).reverse().toString());

            	  }
              }
		});
        convert.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
            	ReverseStringUI.reverse.setText(new StringBuffer(ReverseStringUI.str.getText()).reverse().toString());
            }
        });
        panel.add(label1);
        panel.add(label2);
        panel.add(str);
        panel.add(reverse);
        panel.add(convert);
        panel.add(exit);
        
        frame.add(panel);
        
        
        frame.setSize(600, 300);  
        frame.setLocationRelativeTo(null);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.setVisible(true);  
    }  
}  

