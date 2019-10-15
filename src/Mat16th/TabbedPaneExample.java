package Mat16th;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;  
public class TabbedPaneExample {  
	static JFrame f;  
	static JFrame add;
	static String students[][]=new String[100][];
	static String instr[][]={ {"Instructor1","123","Instr@123"},    
			{"Instructor2","345","Instr2@345"},    
			{"Instructor3","456","Instr@345"},    
	}; 

	static JTextField name = new JTextField();

	static JTextField id = new JTextField();
	static JTextField password = new JTextField();
	static JLabel nameL = new JLabel("Name");
	static JLabel idL = new JLabel("Id");
	static JLabel passwordL = new JLabel("Password");

	JRadioButton r1=new JRadioButton("Student");    
	JRadioButton r2=new JRadioButton("Instructor");    
	TabbedPaneExample(){  
		f=new JFrame();  
		JPanel p1=new JPanel();  
		JPanel p2=new JPanel();  
		JTabbedPane tp=new JTabbedPane();  
		tp.setBounds(50,50,600,600);  
		tp.add("students",p1);  
		tp.add("instructions",p2);  

		String column[]={"Name","Id","Password"};         
		JTable jt=new JTable(students,column);    
		jt.setBounds(30,40,200,300);          
		JScrollPane sp=new JScrollPane(jt); 
		p1.add(sp);

		String column1[]={"Name","Id","Password"};         
		JTable jt1=new JTable(instr,column1);    
		jt1.setBounds(30,40,200,300);          
		JScrollPane sp1=new JScrollPane(jt1); 
		p2.add(sp1);
		JButton button = new JButton("Add new Instructor/Student");
		button.setBounds(300,700,200,30);
		f.add(button);

		f.add(tp);  

		f.setSize(800,800);  
		f.setLayout(null);  
		f.setVisible(true);  
		
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent aE) {
				add = new JFrame();  
				
				
				
				nameL.setBounds(20,50,100,30);
				idL.setBounds(20,90,100,30);
				passwordL.setBounds(20,130,100,30);

				
				name.setBounds(130,50,130,30);
				id.setBounds(130,90,130,30);
				password.setBounds(130,130,130,30);
				r1.setBounds(75,160,100,30);    
				r2.setBounds(185,160,100,30);    
				ButtonGroup bg=new ButtonGroup();    
				bg.add(r1);bg.add(r2);    
				add.add(r1);add.add(r2);     
				
				
				JButton btn= new JButton("Add");
				btn.setBounds(150,200,130,30);
				btn.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent aE) {
						
						if(r1.isSelected()){
							String temp[][]= new String[students.length+1][3];
							int i=0;
							for(i=0;i<students.length;i++){
								temp[i][0] = students[i][0];
								temp[i][1] = students[i][1];
								temp[i][2] = students[i][2];
							}
							temp[i][0] = name.getText();
							temp[i][1] = id.getText();
							temp[i][2] = password.getText();
							students = new String[temp.length][];
							
							for(i=0;i<temp.length;i++){
								students[i][0] = "A";
								students[i][1] = "B";
								students[i][2] = "C";
							}
						}
						
					}
				});
				
				add.add(btn);
				add.add(name);
				add.add(id);
				add.add(password);
				
				add.add(nameL);
				add.add(idL);
				add.add(passwordL);
				
				
				add.setSize(400,400);  
				add.setLayout(null);  
				add.setVisible(true);  
			}
		});
	}  
	public static void main(String[] args) {  
		new TabbedPaneExample();  
	}}  