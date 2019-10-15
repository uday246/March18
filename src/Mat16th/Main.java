package Mat16th;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main {

	public static void main(String[] args) {

		new GUIFrame().setVisible(true);

	}

}

class GUIFrame extends JFrame {

	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;

	private JPanel mContentPane;

	private JTextField txtGreen;

	private JTextField txtBlue;

	private JTextField txtRed;

	public JTextField getTxtGreen() {
		return txtGreen;
	}

	public void setTxtGreen(JTextField aTxtGreen) {
		txtGreen = aTxtGreen;
	}

	public JTextField getTxtBlue() {
		return txtBlue;
	}

	public void setTxtBlue(JTextField aTxtBlue) {
		txtBlue = aTxtBlue;
	}

	public JTextField getTxtRed() {
		return txtRed;
	}

	public void setTxtRed(JTextField aTxtRed) {
		txtRed = aTxtRed;
	}

	public GUIFrame() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setBounds(100, 100, 200, 200);

		setResizable(false);

		// initialize the JPanel

		mContentPane = new JPanel();

		mContentPane.setLayout(null);

		// set the JFrame's JPanel

		setContentPane(mContentPane);

		JButton btnDisplay = new JButton("Display");
		btnDisplay.setBounds(33, 138, 117, 25);
		mContentPane.add(btnDisplay);
		btnDisplay.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent aE) {
				int r = 0, g = 0, b = 0;
				try {
					r = Integer.parseInt(getTxtRed().getText());
					g = Integer.parseInt(getTxtBlue().getText());
					b = Integer.parseInt(getTxtGreen().getText());

				} catch (Exception e) {

				}
				getContentPane().setBackground(new Color(r, g, b));
			}
		});

		txtRed = new JTextField();

		txtRed.setBounds(104, 10, 66, 30);

		mContentPane.add(txtRed);

		txtGreen = new JTextField();

		txtGreen.setBounds(104, 52, 66, 30);

		mContentPane.add(txtGreen);

		txtBlue = new JTextField();

		txtBlue.setBounds(104, 94, 66, 30);

		mContentPane.add(txtBlue);

		JLabel lblRed = new JLabel("RED");

		lblRed.setBounds(23, 17, 70, 15);

		mContentPane.add(lblRed);

		JLabel lblGreen = new JLabel("GREEN");

		lblGreen.setBounds(23, 59, 70, 15);

		mContentPane.add(lblGreen);

		JLabel lblBlue = new JLabel("BLUE");

		lblBlue.setBounds(23, 101, 70, 15);

		mContentPane.add(lblBlue);
		txtRed.addKeyListener(new keyListenerEx());
		txtGreen.addKeyListener(new keyListenerEx());
		txtBlue.addKeyListener(new keyListenerEx());
		

	}

	class keyListenerEx implements KeyListener {

		@Override
		public void keyTyped(KeyEvent e) {
			System.out.println("AAAAA");
			
			if (!(e.getKeyChar() >= '0' && e.getKeyChar() <= '9')) {
				JOptionPane.showMessageDialog(null, "Invalid value, please enter number", "Alert",
						JOptionPane.ERROR_MESSAGE);
			}
		}

		@Override
		public void keyPressed(KeyEvent aE) {
			// TODO Auto-generated method stub

		}

		@Override
		public void keyReleased(KeyEvent e) {
			JTextField field = (JTextField) e.getSource();
			if (!(e.getKeyChar() >= '0' && e.getKeyChar() <= '9')) {
				field.setText("");
			}
		}

	}
}