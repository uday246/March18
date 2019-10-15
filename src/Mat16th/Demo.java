package Mat16th;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Demo extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private final LayoutManager layout;

	private JButton button0;
	private JButton button1;
	private JButton button2;
	private JTextArea textArea0;
	private JTextArea textArea1;

	public Demo(){
		super("Add your title here");
		layout = new FlowLayout(0);
		setLayout(layout);
		button0 = new JButton("Copy");
		button1 = new JButton("Append");
		button2 = new JButton("Clear");
		Dimension d=new Dimension(100, 35);
		button0.setPreferredSize(d);
		setTextArea0(new JTextArea("JTextArea0",6,20));
		setTextArea1(new JTextArea("JTextArea1",6,20));
		JPanel p=new JPanel();
		p.setLayout(new GridLayout(3,1));
		p.add(button0);
		p.add(button1);
		p.add(button2);
		add(new JScrollPane(getTextArea0()));
		add(p);
		add(new JScrollPane(getTextArea1()));
		// copies text from one box to another
		button0.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent aE) {
				getTextArea1().setText(getTextArea0().getText());
			}
		});
		// appends text to box2 from the box 1
		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent aE) {
				String temp = getTextArea1().getText();
				temp=temp+getTextArea0().getText();
				
				getTextArea1().setText(temp);
			}
		});
		// clears text from both the boxes
		button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent aE) {
				getTextArea1().setText("");
				getTextArea0().setText("");

			}
		});
	}

	public static void main(String[] args){
		Demo testing= new Demo();
		testing.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		testing.setSize(620, 180);
		testing.setVisible(true);
	}

	public JTextArea getTextArea0() {
		return textArea0;
	}

	public void setTextArea0(JTextArea aTextArea0) {
		textArea0 = aTextArea0;
	}

	public JTextArea getTextArea1() {
		return textArea1;
	}

	public void setTextArea1(JTextArea aTextArea1) {
		textArea1 = aTextArea1;
	}

}