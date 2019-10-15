package Mat16th;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class LoadDataIntoGUI {
	static JTextArea data=new JTextArea("");  
	static JLabel result = new JLabel();
	public static void main(String s[]) {
		JFrame frame = new JFrame("JFrame Example");
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
        data.setBounds(10,30, 600,200);  
        panel.add(data);   

		JButton load = new JButton("Load data");
		load.setBounds(170, 240, 120, 20);
		
		// when user clicks on load button will read the input.txt and set data to the text area
		load.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent aE) {

					BufferedReader reader = null;
					String data="";
					try {
						reader = new BufferedReader(new FileReader("input.txt"));
						String line = reader.readLine();
						while(line!=null){
							data +=line+"\n";
							line = reader.readLine();
						}
					} catch (Exception e) {
						LoadDataIntoGUI.result.setText("File not Found, Please check the path");

					}
					
				
				LoadDataIntoGUI.data.setText(data);
				LoadDataIntoGUI.result.setText("Loaded");
				
			}
		});
		
		
		result.setBounds(250, 270, 180, 20);
		result.setForeground(Color.RED);

		JButton save = new JButton("Save data");
		save.setBounds(310, 240, 120, 20);

		// when user click on save the data present in the text area will be saved into the output.txt
		save.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent aE) {
				PrintWriter pw = null;
				String data="";
				try {
					pw = new PrintWriter(new FileWriter("output.txt"));
					data = LoadDataIntoGUI.data.getText();
					if(data.trim().length()==0){
						LoadDataIntoGUI.result.setText("Can't save empty data");
						return;
					}
					pw.print(data);
					pw.close();
					LoadDataIntoGUI.data.setText(data);
					LoadDataIntoGUI.result.setText("Saved to output.txt");
				} catch (Exception e) {
					System.out.println(e);
				}
				
			
			LoadDataIntoGUI.data.setText(data);
			}
		});
		panel.add(load);
		panel.add(save);
		
		panel.add(result);
		frame.add(panel);

		frame.setSize(600, 500);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
