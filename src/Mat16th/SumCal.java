package Mat16th;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class SumCal {  
static    JFrame frame = new JFrame("JFrame Example");  

	public static void main(String s[]) {  
        JPanel panel = new JPanel();  
        panel.setLayout(null);  
        
        final JLabel label1 = new JLabel();  
        label1.setBounds(200, 190, 100, 30);
        
        
        final JTextField num1= new JTextField(10);
        num1.setBounds(200, 50, 100, 30);
        // password field
        final JTextField num2= new JTextField(10);
        num2.setBounds(200, 100, 100, 30);
        
        JButton login = new JButton();  
        login.setText("Sum");  
        login.setBounds(200, 150, 100, 20);
        login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
            	int sum = Integer.parseInt(num1.getText())+Integer.parseInt(num2.getText());
            	label1.setText("Sum is : "+sum);
            }
        });
       
        panel.add(label1);
        panel.add(num1);
        panel.add(num2);
        panel.add(login);
        
        frame.add(panel);
        
        
        frame.setSize(600, 300);  
        frame.setLocationRelativeTo(null);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.setVisible(true);  
    }  
}  

