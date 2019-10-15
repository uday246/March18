package Mar20th;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MembershipReport {

	public static void main(String[] args)  throws Exception{

		
		new GUI();
	}

}
class GUI {  
	static  JLabel message = new JLabel();
	static JTextField memberName= new JTextField(10);
	static ArrayList<String>list = new ArrayList<String>();
	static boolean modified;
    public GUI() throws Exception {  
    	BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\teegu\\Desktop\\members.txt"));
		String name = reader.readLine();
		while(name!=null){
			list.add(name.trim());
			name = reader.readLine();
		}
		reader.close();
        JFrame frame = new JFrame("JFrame Example");  
        JPanel panel = new JPanel();  
        panel.setLayout(null);  
       
        
        
        memberName.setBounds(150, 60, 200, 30);
        memberName.setToolTipText("Enter Member Name to add or remove");
        JButton add = new JButton();  
        add.setText("Add member");  
        add.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent aE) {
				if(GUI.list.contains(memberName.getText().trim())){
					GUI.message.setText("Member already exist");
				}
				else if(memberName.getText().trim().length()!=0 )
				 {
					GUI.modified=true;		
					GUI.list.add(memberName.getText().trim());
					GUI.message.setText("Added Successfully");
				 }
				else{
					GUI.message.setText("Please enter member Name to add");
				}
				
				
			}
		});
        message.setBounds(330, 180, 220, 20);
        JButton remove = new JButton();  
        remove.setText("Remove  member");  
        remove.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent aE) {
				if(!GUI.list.contains(memberName.getText().trim())){
					GUI.message.setText("Member Does not exist");
				}
				else if(memberName.getText().trim().length()!=0)
				 {
					GUI.list.remove(memberName.getText().trim());
					GUI.message.setText("removed Successfully");
					GUI.modified=true;
				 }
				else{
					GUI.message.setText("Please enter member Name to remove");
				}
			}
		});
        
        
        JButton check = new JButton();  
        check.setText("Check Membership");  
        // will check whether the persion had membership or not
        check.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent aE) {
				String name = memberName.getText().trim();
				if(GUI.list.contains(name))
				 {
					GUI.message.setText("Your memeber");
				 }
				else{
					GUI.message.setText("Your not a member");
				}
			}
		});
        JButton report = new JButton();  
        report.setText("Membership Report");  
        
        add.setBounds(80, 150, 120, 20);
        remove.setBounds(210, 150, 120, 20);
        check.setBounds(340, 150, 120, 20);
        report.setBounds(470, 150, 150, 20);

        
        // Generating the report
        report.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent aE) {
				try {
					PrintWriter pw = new PrintWriter(new FileWriter("C:\\Users\\teegu\\Desktop\\report.txt"));
					String date = new SimpleDateFormat("dd/mm/yyyy").format(new Date());
					pw.println("Name\t\t\t\tDate");
					for(String str:GUI.list){
						pw.println(str+"\t\t"+date);
					}
					pw.flush();
					pw.close();
				} catch (Exception e) {
				}
				
			}
		});
        panel.add(add);  
        panel.add(message);
        panel.add(check);
        panel.add(memberName);
        panel.add(remove);
        panel.add(report);
        frame.add(panel);  
        
        frame.setSize(700, 300);  
        frame.setLocationRelativeTo(null);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.setVisible(true);  
        
        // while closing window if any changes are made than writing those changes into the file
        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
            	
            	if(GUI.modified){
            	try {
					PrintWriter pw = new PrintWriter(new FileWriter("C:\\Users\\teegu\\Desktop\\members.txt"));
					for(String str:GUI.list){
						pw.println(str);
					}
					pw.flush();
					pw.close();
				} catch (Exception e) {
				}
            	}
            }
        });
    }  
}  