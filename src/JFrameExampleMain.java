
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class JFrameExample {
	static JFrame frame = new JFrame("JFrame Example");

	static JLabel label1 = new JLabel("Hello...");
	static JTextField user = new JTextField(10);

	JFrameExample() {
		JPanel panel = new JPanel();
		panel.setLayout(null);
		label1.setBounds(200, 50, 300, 30);
		user.setBounds(200, 100, 100, 30);

		JButton hi = new JButton();
		hi.setText("Hi");
		hi.setBounds(200, 150, 100, 20);

		JButton bye = new JButton();
		bye.setText("Bye");
		bye.setBounds(320, 150, 100, 20);
		panel.add(label1);
		panel.add(user);
		panel.add(hi);
		panel.add(bye);

		frame.add(panel);

		frame.setSize(600, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}

public class JFrameExampleMain {
	public static void main(String[] args) {
		new JFrameExample();
	}
}
