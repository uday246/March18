package Mat18th;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class MobileShop {
	JFrame f;
	static double mobileCost = 0;
	static double packagePrice = 0;
	static JTextField solutionsPrice;
	static JTextField mobilePrice;
	static JTextField voiceMailPrice;
	static JTextField textMsgPrice;
	static double voiceMailCost = 0;
	static double textMsgCost = 0;
	static JTextField totalBil;
	static double totalAmount;
	MobileShop() {
		f = new JFrame();
		JLabel solutionsHeader = new JLabel("Please select the package from the below");
		solutionsPrice = new JTextField("Price : " + packagePrice);
		solutionsPrice.setBounds(650, 100, 300, 30);

		mobilePrice = new JTextField("Price : " + mobileCost);
		mobilePrice.setBounds(650, 270, 150, 30);

		voiceMailPrice = new JTextField("Price : $" + voiceMailCost);
		voiceMailPrice.setBounds(650, 380, 300, 30);

		textMsgPrice = new JTextField("Price : $" + voiceMailCost);
		textMsgPrice.setBounds(650, 410, 300, 30);

		totalBil= new JTextField("Total : $" + totalAmount);
		totalBil.setBounds(650, 450, 300, 30);

		JRadioButton r1 = new JRadioButton("300 minutes per month");
		JRadioButton r2 = new JRadioButton("800 minutes per month");
		JRadioButton r3 = new JRadioButton("1500 minutes per month");

		solutionsHeader.setBounds(50, 20, 300, 30);

		ButtonGroup bg = new ButtonGroup();
		r1.setBounds(75, 80, 300, 30);
		r2.setBounds(75, 130, 300, 30);
		r3.setBounds(75, 160, 300, 30);
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		f.add(r1);
		f.add(r2);
		f.add(r3);
		f.add(solutionsHeader);
		f.add(solutionsPrice);

		r1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				System.out.println(e.getStateChange());
				if (e.getStateChange() == 1) {
					MobileShop.packagePrice = 45;
					MobileShop.solutionsPrice.setText("Price : $45");
				}
			}
		});
		r2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == 1) {
					MobileShop.packagePrice = 66;
					MobileShop.solutionsPrice.setText("Price : $66");
				}

			}
		});
		r3.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == 1) {
					MobileShop.packagePrice = 99;
					MobileShop.solutionsPrice.setText("Price : $99");
				}
			}
		});

		JLabel mobile = new JLabel(
				"Please select the package from the below .A 6% sales tax applies to the sale of a phone");

		JRadioButton c1 = new JRadioButton("Model 100: $29.95");
		JRadioButton c2 = new JRadioButton("Model 110: $49.95");
		JRadioButton c3 = new JRadioButton("Model 200: $99.95");

		c1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				System.out.println(e.getStateChange());
				if (e.getStateChange() == 1) {
					MobileShop.mobileCost = 29.95*1.06;
					MobileShop.mobilePrice.setText("Price : $31.27");
				}
			}
		});
		c2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == 1) {
					MobileShop.mobileCost = 49.95*1.06;
					MobileShop.mobilePrice.setText(("Price : $52.94"));
				}

			}
		});
		c3.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == 1) {
					MobileShop.mobileCost = 99.95*1.06;
					MobileShop.mobilePrice.setText("Price : $105.94");
				}
			}
		});

		mobile.setBounds(50, 200, 800, 30);

		c1.setBounds(75, 260, 300, 30);
		c2.setBounds(75, 310, 300, 30);
		c3.setBounds(75, 340, 300, 30);

		ButtonGroup bg1 = new ButtonGroup();
		bg1.add(c1);
		bg1.add(c2);
		bg1.add(c3);
		f.add(c1);
		f.add(c2);
		f.add(c3);
		f.add(mobile);
		f.add(mobilePrice);

		JCheckBox ch1 = new JCheckBox("Voice mail");
		JCheckBox ch2 = new JCheckBox("ext messaging");

		ch1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == 1) {
					MobileShop.voiceMailCost = 5;
					MobileShop.voiceMailPrice.setText("Price : $5");
				} else {
					MobileShop.voiceMailCost = 0;
					MobileShop.voiceMailPrice.setText("Price : $0");
				}
			}
		});

		ch2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == 1) {
					MobileShop.textMsgCost = 10;
					MobileShop.textMsgPrice.setText("Price : $10");
				} else {
					MobileShop.textMsgCost = 0;
					MobileShop.textMsgPrice.setText("Price : $0");
				}
			}
		});

		ch1.setBounds(50, 380, 300, 30);
		ch2.setBounds(50, 410, 300, 30);
		JButton button = new JButton(" Total ");
		button.setBounds(650, 490, 80, 30);
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent aE) {
				double temp = mobileCost+packagePrice+voiceMailCost+textMsgCost;
					MobileShop.totalBil.setText(temp+"");
			}
		});

		f.add(voiceMailPrice);
		f.add(textMsgPrice);
		f.add(ch1);
		f.add(totalBil);
		f.add(ch2);
		f.add(button);

		f.setSize(1000, 600);
		f.setLayout(null);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new MobileShop();
	}
}
