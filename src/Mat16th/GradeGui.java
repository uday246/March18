package Mat16th;




import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class GradeGui {  
static    JFrame frame = new JFrame("Grade Converted");  
static JTextField marks= new JTextField(10);
static JLabel label2 = new JLabel("Your grade will be ");  

	public static void main(String s[]) {  
        JPanel panel = new JPanel();  
        panel.setLayout(null);  
        JLabel label1 = new JLabel("Score");  
        
        label1.setBounds(120, 50, 100, 30);
        
        marks.setBounds(200, 50, 100, 30);
        
        JButton exit = new JButton();  
        exit.setText("Convert");  
        exit.setBounds(200, 150, 100, 20);
        label2.setBounds(200, 180, 200, 20);
        
        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
            	String res="Your grade will be : ";
            	// getting marks and checking for  grade
            	double marks = Double.parseDouble(GradeGui.marks.getText());
            	if(marks>= 96 && marks<=100)
            		res+="A";
            	if(marks>= 90 && marks<=95)
            		res+="A-";
            	if(marks>= 87 && marks<=89)
            		res+="B+";
            	if(marks>= 84 && marks<=86)
            		res+="B";
            	if(marks>= 80 && marks<=83)
            		res+="B-";
            	
            	if(marks>= 77 && marks<=79)
            		res+="C+";
            	if(marks>= 74 && marks<=76)
            		res+="C";
            	if(marks>= 70 && marks<=73)
            		res+="C-";
            	
            	if(marks>= 58 && marks<=67)
            		res+="D+";
            	if(marks>= 64 && marks<=66)
            		res+="D+";
            	if(marks>= 60 && marks<=63)
            		res+="D-";
            	if(marks>= 0 && marks<=59)
            		res+="F";
            	// setting the grade
            	GradeGui.label2.setText(res);
            	
            }
        });
        panel.add(label1);
        panel.add(label2);
        
        panel.add(marks);
        panel.add(exit);
        
        frame.add(panel);
        
        
        frame.setSize(600, 300);  
        frame.setLocationRelativeTo(null);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.setVisible(true);  
    }  
}  

