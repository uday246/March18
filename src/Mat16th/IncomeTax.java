package Mat16th;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class IncomeTax {  
static    JFrame frame = new JFrame("Incometax calculator");  

	public static void main(String s[]) {  
        JPanel panel = new JPanel();  
        panel.setLayout(null);  
        JLabel label1 = new JLabel("Anaual Income");  
        
        label1.setBounds(200, 50, 100, 30);
        final JTextField income= new JTextField(10);
        income.setBounds(320, 50, 100, 30);
        JLabel label2 = new JLabel("Marrige status");  
        label2.setBounds(200, 100, 100, 30);
        // password field
        final JTextField status= new JTextField(10);
        status.setBounds(320, 100, 100, 30);
        final JLabel label3 = new JLabel("");  
        label3.setBounds(250, 200, 300, 20);
        JButton calculate = new JButton();  
        calculate.setText("Calculate");  
        calculate.setBounds(200, 150, 100, 20);
        // calculates tax when user cliks on calculate button
        calculate.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent aE) {
				double in = Double.parseDouble(income.getText());
				String st  = status.getText();
				double tax = 0;
				// if the status is single than it is 10% else 12%
				if(st.equalsIgnoreCase("Single")){
					tax = in * .1;
				}
				else{
					tax = in * .12;
						
				}
				label3.setText("Tax to be paid : "+tax);
			}
		});
        
        
        JButton exit = new JButton();  
        exit.setText("Exit");  
        exit.setBounds(320, 150, 100, 20);
        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
            	// to close the frame
            	IncomeTax.frame.dispose();
            }
        });
        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        panel.add(income);
        panel.add(status);
        panel.add(calculate);
        panel.add(exit);
        
        frame.add(panel);
        
        
        frame.setSize(600, 300);  
        frame.setLocationRelativeTo(null);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.setVisible(true);  
    }  
}  

