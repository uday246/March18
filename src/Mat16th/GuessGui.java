package Mat16th;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class GuessGui {  
static    JFrame frame = new JFrame("JFrame Example");  
static int randNumber;
static int count=0;
public static void main(String s[]) {  
        JPanel panel = new JPanel();  
        panel.setLayout(null);  
        
        final JLabel label1 = new JLabel();  
        label1.setBounds(200, 50, 300, 30);
        final JLabel label2 = new JLabel("");  
        label2.setBounds(200, 200, 400, 30);
        
        
        final JTextField num1= new JTextField(10);
        num1.setBounds(200, 130, 100, 30);
       label1.setText("Number between 0-20");
        Random r=new Random();
        randNumber=r.nextInt(20);
        JButton login = new JButton();  
        login.setText("Guess ");  
        login.setBounds(200, 170, 100, 20);
        login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
            	int n = Integer.parseInt(num1.getText());
            	if(n<randNumber){
            		label2.setText("Low..");
            		count++;
            	}
            	else if(n>randNumber){
            		label2.setText("High...");
            		count++;
            	}
            	else{
            		label2.setText("Congratulations....!! Your guess Correct in "+count+" guesses");
            	}
            	if(count>=3){
            		label2.setText("Sorry....!! Your failed to guess correctly, Number is "+randNumber);
                    
            	}
            	
            	
            }
        });
       
        panel.add(label1);
        panel.add(label2);
        
        panel.add(num1);
        panel.add(login);
        
        frame.add(panel);
        
        
        frame.setSize(600, 300);  
        frame.setLocationRelativeTo(null);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.setVisible(true);  
    }  
}  


