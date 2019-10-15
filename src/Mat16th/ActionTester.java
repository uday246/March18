package Mat16th;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ActionTester {
	public static void main(String[] args) {
		JFrame frame = new JFrame(); // PUT YOUR CODE BELOW
		JPanel panel = new JPanel();
		panel.setLayout(null);

		final JTextField user = new JTextField(10);
		user.setBounds(320, 50, 100, 30);
		user.setText("None");
		JButton open = new JButton();
		open.setText("Open");
		open.setBounds(200, 150, 100, 20);

		JButton close = new JButton();
		close.setText("Close");
		close.setBounds(320, 150, 100, 20);
		close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				user.setText("Close");

			}
		});
		open.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				user.setText("Open");

			}
		});
		panel.add(user);
		panel.add(open);
		panel.add(close);

		frame.add(panel);

		frame.setSize(600, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
