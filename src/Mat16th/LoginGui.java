package Mat16th;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoginGui {
	static JFrame frame = new JFrame("JFrame Example");

	public static void main(String s[]) {
		JPanel panel = new JPanel();
		panel.setLayout(null);
		final JLabel label3 = new JLabel("Adult ticket $50.Children ticket $25");
		label3.setBounds(150, 15, 500, 30);
		JLabel label1 = new JLabel("Enter the number of adult ticket: ");
		label1.setBounds(200, 50, 300, 30);

		final JTextField adult = new JTextField(10);
		adult.setBounds(400, 50, 100, 30);

		JLabel label2 = new JLabel("Enter the number of children ticket: ");
		label2.setBounds(200, 100, 250, 30);
		// password field
		final JTextField children = new JTextField(10);
		children.setBounds(400, 100, 100, 30);

		JButton login = new JButton();
		login.setText("Calculate total cost");
		login.setBounds(200, 150, 250, 20);

		JLabel total = new JLabel("Total Price: ");
		total.setBounds(200, 200, 300, 30);

		final JTextField totalPrice = new JTextField(10);
		totalPrice.setBounds(400, 200, 100, 30);

		JButton exit = new JButton();
		exit.setText("Exit");
		exit.setBounds(320, 150, 100, 20);

		

		login.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent aE) {
				String a = adult.getText();
				String c = children.getText();
				int ad = 0;
				if (a.trim().length() != 0)
					ad = Integer.parseInt(a);
				int ac = 0;
				if (c.trim().length() != 0)
					ac = Integer.parseInt(c);
				totalPrice.setText((ac * 25 + ad * 50) + "");

			}
		});

		panel.add(label1);
		panel.add(label2);
		panel.add(label3);
		panel.add(adult);
		panel.add(children);
		panel.add(login);
		panel.add(exit);
		panel.add(totalPrice);
		panel.add(total);
		frame.add(panel);

		frame.setSize(600, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
