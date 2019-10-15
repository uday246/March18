package Mar27th;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class main1 extends JFrame {

	// JFrame

	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;

	JFrame frame;

	// Panels

	JPanel panelCont;

	JPanel panelOne;

	CardLayout cards;

	main2 panelTwo;

	// TextField Variables

	private JTextField devTxt;

	private JTextField emailTxt;

	private JTextField passTxt;

	private JTextField thirdpartyTxt;

	private JTextField thirdpartypassTxt;

	private JTextField gcodeTxt;

	private JTextField rendevzousTxt;

	// ComboBox Variables

	JComboBox environD = new JComboBox();

	JComboBox signD = new JComboBox();

	JComboBox browserD = new JComboBox();

	JComboBox deviceD = new JComboBox();

	JComboBox urlD = new JComboBox();

	JComboBox accountD = new JComboBox();

	// Button Variables

	JButton btnCtn;

	// Label Variables

	JLabel lblAccount = new JLabel("ACCOUNT");

	JLabel lblSignin = new JLabel("SIGN UP/SIGN IN");

	private JLabel lblMain;

	JLabel lblBrowser = new JLabel("BROWSER");

	JLabel cbsIcon = new JLabel("");

	JLabel lblURL = new JLabel("FLOW");

	JLabel lblDevice = new JLabel("PLATFORM");

	JLabel lblEnvironment = new JLabel("ENVIRONMENT");

	Image cbslogo;

	// Checkbox Variables

	JCheckBox chckbxRegexsub = new JCheckBox("Reg/Ex-Sub");

	JCheckBox chckbxAnnual = new JCheckBox("Annual");

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {

			public void run() {

				new main1();

			}

		});

	}

	public main1() {

		// --- GUI

		initGUI();

		// --- Listeners

		addListeners();

	}

	private void initGUI()

	{

		// Layout

		frame = new JFrame("Test");

		panelCont = new JPanel();

		panelOne = new JPanel();

		panelOne.setPreferredSize(new Dimension(650, 900));

		cards = new CardLayout();

		panelTwo = new main2(cards, panelCont);

		panelCont.setLayout(cards);

		panelOne.setBackground(new Color(245, 245, 245));

		panelCont.add(panelOne, "1");

		// Items

		lblMain = new JLabel("STEP1");

		btnCtn = new JButton("CONTINUE");

		// Card1 Textfield

		setEmailTxt(new JTextField());

		setPassTxt(new JTextField());

		setDevTxt(new JTextField());

		// Frame

		frame.getContentPane().add(panelCont);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.pack();

		frame.setVisible(true);

		GridBagLayout gbl_panelOne = new GridBagLayout();

		// Panel

		gbl_panelOne.columnWidths = new int[] { 170, 310, 170 };

		gbl_panelOne.rowHeights = new int[] { 75, 75, 31, 31, 31, 31, 31, 31, 31, 31, 31, 31, 31, 31, 31, 31, 31, 31,
				31, 31, 31, 150 };

		panelOne.setLayout(gbl_panelOne);

		// GridBag

		GridBagConstraints gbc_label = new GridBagConstraints();

		gbc_label.insets = new Insets(0, 0, 5, 5);

		GridBagConstraints gbc_signD = new GridBagConstraints();

		gbc_signD.anchor = GridBagConstraints.WEST;

		gbc_signD.insets = new Insets(0, 0, 5, 5);

		GridBagConstraints gbc_emailTxtfield = new GridBagConstraints();

		gbc_emailTxtfield.anchor = GridBagConstraints.WEST;

		GridBagConstraints gbc_passTxtfield = new GridBagConstraints();

		gbc_passTxtfield.anchor = GridBagConstraints.WEST;

		GridBagConstraints gbc_exsubfield = new GridBagConstraints();

		gbc_exsubfield.anchor = GridBagConstraints.WEST;

		GridBagConstraints gbc_signIn = new GridBagConstraints();

		gbc_signIn.anchor = GridBagConstraints.WEST;

		GridBagConstraints gbc_lblBrowse = new GridBagConstraints();

		gbc_lblBrowse.anchor = GridBagConstraints.WEST;

		GridBagConstraints gbc_ddBrowse = new GridBagConstraints();

		gbc_ddBrowse.anchor = GridBagConstraints.WEST;

		GridBagConstraints gbc_lblEnv = new GridBagConstraints();

		gbc_lblEnv.anchor = GridBagConstraints.WEST;

		GridBagConstraints gbc_ddEnv = new GridBagConstraints();

		gbc_ddEnv.anchor = GridBagConstraints.WEST;

		GridBagConstraints gbc_devTxt = new GridBagConstraints();

		gbc_devTxt.anchor = GridBagConstraints.WEST;

		GridBagConstraints gbc_lblURL = new GridBagConstraints();

		gbc_lblURL.anchor = GridBagConstraints.WEST;

		GridBagConstraints gbc_ddurl = new GridBagConstraints();

		gbc_ddurl.anchor = GridBagConstraints.WEST;

		GridBagConstraints gbc_ttTxt = new GridBagConstraints();

		gbc_ttTxt.anchor = GridBagConstraints.WEST;

		GridBagConstraints gbc_passttTxt = new GridBagConstraints();

		gbc_passttTxt.anchor = GridBagConstraints.WEST;

		GridBagConstraints gbc_giftTxt = new GridBagConstraints();

		gbc_giftTxt.anchor = GridBagConstraints.WEST;

		GridBagConstraints gbc_renTxt = new GridBagConstraints();

		gbc_renTxt.anchor = GridBagConstraints.WEST;

		GridBagConstraints gbc_lbldevice = new GridBagConstraints();

		gbc_lbldevice.anchor = GridBagConstraints.WEST;

		GridBagConstraints gbc_dddevice = new GridBagConstraints();

		gbc_dddevice.anchor = GridBagConstraints.WEST;

		GridBagConstraints gbc_lblAccount = new GridBagConstraints();

		gbc_lblAccount.anchor = GridBagConstraints.WEST;

		GridBagConstraints gbc_ddaccount = new GridBagConstraints();

		gbc_ddaccount.anchor = GridBagConstraints.WEST;

		GridBagConstraints gbc_checkAnn = new GridBagConstraints();

		gbc_checkAnn.anchor = GridBagConstraints.WEST;

		GridBagConstraints gbc_buttonOne = new GridBagConstraints();

		gbc_buttonOne.insets = new Insets(0, 0, 0, 5);

		// Header

		lblMain.setForeground(Color.GRAY);

		lblMain.setFont(new Font("Heiti TC", Font.PLAIN, 36));

		gbc_label.gridx = 1;

		gbc_label.gridy = 1;

		panelOne.add(lblMain, gbc_label);

		lblSignin.setAlignmentY(Component.TOP_ALIGNMENT);

		// Sign In Label

		lblSignin.setForeground(Color.GRAY);

		lblSignin.setFont(new Font("Arial", Font.PLAIN, 14));

		gbc_signIn.gridx = 1;

		gbc_signIn.gridy = 2;

		panelOne.add(lblSignin, gbc_signIn);

		// Sign In Dropdown

		signD.setPreferredSize(new Dimension(300, 27));

		signD.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

		signD.setModel(new DefaultComboBoxModel(new String[] { "Sign Up", "Sign In" }));

		signD.setForeground(Color.DARK_GRAY);

		gbc_signD.gridx = 1;

		gbc_signD.gridy = 3;

		panelOne.add(signD, gbc_signD);

		// Email Textfield

		getEmailTxt().setPreferredSize(new Dimension(250, 26));

		getEmailTxt().setBorder(BorderFactory.createLineBorder(Color.blue));

		getEmailTxt().setVisible(false);

		gbc_emailTxtfield.gridx = 1;

		gbc_emailTxtfield.gridy = 4;

		panelOne.add(getEmailTxt(), gbc_emailTxtfield);

		// Password Textfield

		getPassTxt().setPreferredSize(new Dimension(150, 26));

		getPassTxt().setBorder(BorderFactory.createLineBorder(Color.blue));

		getPassTxt().setVisible(false);

		gbc_passTxtfield.gridx = 1;

		gbc_passTxtfield.gridy = 5;

		panelOne.add(getPassTxt(), gbc_passTxtfield);

		// Checkbox exsub

		chckbxRegexsub.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

		chckbxRegexsub.setForeground(Color.GRAY);

		chckbxRegexsub.setVisible(false);

		chckbxRegexsub.setBorder(BorderFactory.createLineBorder(Color.blue));

		gbc_exsubfield.gridx = 1;

		gbc_exsubfield.gridy = 6;

		panelOne.add(chckbxRegexsub, gbc_exsubfield);

		// Browser Label

		lblBrowser.setForeground(Color.GRAY);

		lblBrowser.setFont(new Font("Arial", Font.PLAIN, 14));

		gbc_lblBrowse.gridx = 1;

		gbc_lblBrowse.gridy = 7;

		panelOne.add(lblBrowser, gbc_lblBrowse);

		// Browser DD

		browserD.setPreferredSize(new Dimension(300, 27));

		browserD.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

		browserD.setForeground(Color.DARK_GRAY);

		browserD.setModel(new DefaultComboBoxModel(new String[] { "Chrome", "FireFox", "Safari" }));

		gbc_ddBrowse.gridx = 1;

		gbc_ddBrowse.gridy = 8;

		panelOne.add(browserD, gbc_ddBrowse);

		// Environment Label

		lblEnvironment.setForeground(Color.GRAY);

		lblEnvironment.setFont(new Font("Arial", Font.PLAIN, 14));

		gbc_lblEnv.gridx = 1;

		gbc_lblEnv.gridy = 9;

		panelOne.add(lblEnvironment, gbc_lblEnv);

		// Environment Dropdown

		environD.setPreferredSize(new Dimension(300, 27));

		environD.setModel(new DefaultComboBoxModel(new String[] { "Prod", "Dev" }));

		environD.setForeground(Color.DARK_GRAY);

		gbc_ddEnv.gridx = 1;

		gbc_ddEnv.gridy = 10;

		panelOne.add(environD, gbc_ddEnv);

		// Dev Textfield

		getDevTxt().setPreferredSize(new Dimension(100, 27));

		getDevTxt().setBorder(BorderFactory.createLineBorder(Color.blue));

		gbc_devTxt.gridx = 1;

		gbc_devTxt.gridy = 11;

		panelOne.add(getDevTxt(), gbc_devTxt);

		getDevTxt().setVisible(false);

		// Device Label

		lblDevice.setForeground(Color.GRAY);

		lblDevice.setFont(new Font("Arial", Font.PLAIN, 14));

		gbc_lbldevice.gridx = 1;

		gbc_lbldevice.gridy = 16;

		panelOne.add(lblDevice, gbc_lbldevice);

		// Device DropDown

		deviceD.setPreferredSize(new Dimension(300, 27));

		deviceD.setForeground(Color.DARK_GRAY);

		deviceD.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

		deviceD.setModel(new DefaultComboBoxModel(new String[] { "Desktop", "Mobile Web", "Tablet" }));

		gbc_dddevice.gridx = 1;

		gbc_dddevice.gridy = 17;

		panelOne.add(deviceD, gbc_dddevice);

		// Account Label

		lblAccount.setForeground(Color.GRAY);

		lblAccount.setFont(new Font("Arial", Font.PLAIN, 14));

		gbc_lblAccount.gridx = 1;

		gbc_lblAccount.gridy = 18;

		panelOne.add(lblAccount, gbc_lblAccount);

		// Account Dropdown

		accountD.setPreferredSize(new Dimension(300, 27));

		accountD.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

		accountD.setForeground(Color.DARK_GRAY);

		accountD.setModel(new DefaultComboBoxModel(new String[] { "Registered "

		}));

		gbc_ddaccount.gridx = 1;

		gbc_ddaccount.gridy = 19;

		panelOne.add(accountD, gbc_ddaccount);

		// Annual checkbox

		chckbxAnnual.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

		chckbxAnnual.setForeground(Color.GRAY);

		chckbxAnnual.setVisible(true);

		gbc_checkAnn.gridx = 1;

		gbc_checkAnn.gridy = 20;

		panelOne.add(chckbxAnnual, gbc_checkAnn);

		// Continue Button

		btnCtn.setBackground(UIManager.getColor("CheckBoxMenuItem.selectionBackground"));

		btnCtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

		btnCtn.setFont(new Font("Lucida Grande", Font.PLAIN, 15));

		btnCtn.setForeground(Color.WHITE);

		btnCtn.setBorder(new EmptyBorder(0, 0, 0, 0));

		btnCtn.setOpaque(true);

		btnCtn.setHorizontalTextPosition(SwingConstants.CENTER);

		btnCtn.setPreferredSize(new Dimension(150, 29));

		gbc_buttonOne.gridy = 21;

		// gbc_buttonOne.anchor = GridBagConstraints.CENTER;

		gbc_buttonOne.gridx = 1;

		panelOne.add(btnCtn, gbc_buttonOne);

	}

	private void addListeners() {

		environD.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				JComboBox EnvCB1 = (JComboBox) e.getSource();

				Object selectEnv = EnvCB1.getSelectedItem();

				if (selectEnv.toString().equals("Dev"))

				{

					getDevTxt().setVisible(true);

					getDevTxt().setText(" Branch #");

					getDevTxt().setForeground(Color.GRAY);

					getDevTxt().setFont(new Font("Arial", Font.ITALIC, 12));

				}

				if (selectEnv.toString().equals("Stage") || selectEnv.toString().equals("Preview")
						|| selectEnv.toString().equals("Prod")

						|| selectEnv.toString().equals("Shadow"))

					getDevTxt().setVisible(false);

			}

		});

		signD.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent event)

			{

				JComboBox SignInAccountSwitchCB = (JComboBox) event.getSource();

				JComboBox PasswordCB = (JComboBox) event.getSource();

				JComboBox EmailCB = (JComboBox) event.getSource();

				JComboBox CBexsubcheckbox = (JComboBox) event.getSource();

				Object selectSignInAccountSwitch = SignInAccountSwitchCB.getSelectedItem();

				Object selectPasswordCB = PasswordCB.getSelectedItem();

				Object selectEmailCB = EmailCB.getSelectedItem();

				Object Objexsubcheckbox = CBexsubcheckbox.getSelectedItem();

				if (selectSignInAccountSwitch.toString().equals("Sign In")) {

					accountD.setVisible(false);

					chckbxAnnual.setVisible(false);

					lblAccount.setVisible(false);

				}

				if (selectSignInAccountSwitch.toString().equals("Sign Up")) {

					urlD.setSelectedIndex(0);

				}

				if (selectPasswordCB.toString().equals("Sign In"))

					getPassTxt().setVisible(true);

				getPassTxt().setText(" Enter Password");

				getPassTxt().setForeground(Color.GRAY);

				getPassTxt().setFont(new Font("Arial", Font.ITALIC, 11));

				if (selectPasswordCB.toString().equals("Sign Up"))

					getPassTxt().setVisible(false);

				if (selectEmailCB.toString().equals("Sign In"))

					getEmailTxt().setVisible(true);

				getEmailTxt().setText(" Enter Email");

				getEmailTxt().setForeground(Color.GRAY);

				getEmailTxt().setFont(new Font("Arial", Font.ITALIC, 11));

				if (selectEmailCB.toString().equals("Sign Up"))

					getEmailTxt().setVisible(false);

				if (Objexsubcheckbox.toString().equals("Sign In")) {

					chckbxRegexsub.setVisible(true);

				}

				if (Objexsubcheckbox.toString().equals("Sign Up")) {

					chckbxRegexsub.setVisible(false);

				}

			}
		});

		btnCtn.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				panelCont.add(panelTwo, "2");

				cards.show(panelCont, "2");

			}

		});

	}

	public JTextField getDevTxt() {
		return devTxt;
	}

	public void setDevTxt(JTextField aDevTxt) {
		devTxt = aDevTxt;
	}

	public JTextField getEmailTxt() {
		return emailTxt;
	}

	public void setEmailTxt(JTextField aEmailTxt) {
		emailTxt = aEmailTxt;
	}

	public JTextField getPassTxt() {
		return passTxt;
	}

	public void setPassTxt(JTextField aPassTxt) {
		passTxt = aPassTxt;
	}

}

class main2 extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	JButton btnTwo;

	CardLayout layout;

	JPanel panelCont;

	JLabel label = new JLabel("Page 2");

	JComboBox signD2 = new JComboBox();

	public main2(final CardLayout layout, final JPanel panelCont) {

		this.layout = layout;

		this.panelCont = panelCont;

		// setLayout(gridBagLayout2);

		setBackground(Color.RED);

		btnTwo = new JButton("Back");

		// GridBag

		GridBagConstraints gbc_label = new GridBagConstraints();

		GridBagConstraints gbc_signD = new GridBagConstraints();


		// Label

		label.setFont(new Font("Avenir", Font.PLAIN, 35));

		gbc_label.gridx = 1;

		gbc_label.gridy = 0;

		add(label, gbc_label);

		// Dropdown

		signD2.setPreferredSize(new Dimension(200, 27));

		signD2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

		signD2.setModel(new DefaultComboBoxModel(new String[] { "Dropdown3", "Dropdown4" }));

		signD2.setForeground(Color.DARK_GRAY);

		gbc_signD.gridx = 1;

		gbc_signD.gridy = 1;

		add(signD2, gbc_signD);

		btnTwo.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				layout.show(panelCont, "1");

			}

		});

	}

}