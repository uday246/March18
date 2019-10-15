package Mar20th;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.DecimalFormat;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class TempCalc {
	static JLabel outText = new JLabel("");
	static String input = "", output = "";
	static JTextField inputText = new JTextField();
	static DecimalFormat df = new DecimalFormat(".##");

	public TempCalc() {

		JFrame f = new JFrame();
		JLabel inputLabel = new JLabel("Input");
		JLabel outputLabel = new JLabel("Outut");

		inputLabel.setBounds(150, 70, 80, 30);

		inputText.setBounds(190, 70, 300, 30);
		outText.setBounds(190, 400, 300, 30);
		outputLabel.setBounds(150, 400, 300, 30);

		JLabel inputScale = new JLabel("Input Scale");
		inputScale.setBounds(75, 100, 300, 30);
		ButtonGroup bg = new ButtonGroup();
		JRadioButton input1 = new JRadioButton("Celcius");
		JRadioButton input2 = new JRadioButton("Farhenheit");

		input1.setBounds(75, 140, 300, 30);
		input2.setBounds(75, 180, 300, 30);
		bg.add(input1);
		bg.add(input2);

		JLabel outputScale = new JLabel("output Scale");
		outputScale.setBounds(575, 100, 300, 30);
		ButtonGroup bg1 = new ButtonGroup();
		JRadioButton output1 = new JRadioButton("Celcius");
		JRadioButton output2 = new JRadioButton("Farhenheit");

		output1.setBounds(575, 140, 300, 30);
		output2.setBounds(575, 180, 300, 30);
		bg1.add(output1);
		bg1.add(output2);

		input1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				System.out.println(e.getStateChange());
				if (e.getStateChange() == 1) {
					input = "C";
					if (input.length() != 0 && output.length() != 0) {
						if (output.equals("F")) {
							outText.setText(
									df.format(TemparatureCal.celciusToFahrenheit(inputText.getText().trim())));
						}
						if (output.equals("K")) {

							outText.setText(df.format(TemparatureCal.celciusToKelvin(inputText.getText().trim())));
						}
						if (output.equals("C")) {
							outText.setText(df.format(Double.parseDouble(inputText.getText().trim())));
						}
					} else {
						outText.setText("No Input");
					}
				}
			}
		});
		input2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				System.out.println(e.getStateChange());
				if (e.getStateChange() == 1) {
					input = "F";
					if (input.length() != 0 && output.length() != 0) {
						if (output.equals("F")) {
							outText.setText((df.format(Double.parseDouble(inputText.getText().trim()))) + "");
						}
						if (output.equals("K")) {
							outText.setText(
									df.format(TemparatureCal.fahrenheitToKelvin(inputText.getText().trim())) + "");
						}
						if (output.equals("C")) {
							outText.setText(
									df.format(TemparatureCal.fahrenheitTocelcius(inputText.getText().trim())) + "");
						}
					} else {
						outText.setText("No Input");
					}
				}
			}
		});

		

		output1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				System.out.println(e.getStateChange());
				if (e.getStateChange() == 1) {
					output = "C";
					if (input.length() != 0 && output.length() != 0) {
						if (input.equals("F")) {
							outText.setText(
									df.format(TemparatureCal.fahrenheitTocelcius(inputText.getText().trim())));
						}
						if (input.equals("K")) {
							outText.setText(df.format(TemparatureCal.kelvinToCelcius(inputText.getText().trim())) + "");
						}
						if (input.equals("C")) {
							outText.setText(df.format(Double.parseDouble(inputText.getText().trim())));
						}
					} else {
						outText.setText("No Input");
					}
				}
			}
		});

		output2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == 1) {
					output = "F";
					if (input.length() != 0 && output.length() != 0) {
						if (input.equals("F")) {
							outText.setText(df.format(Double.parseDouble(inputText.getText().trim())) + "");
						}
						if (input.equals("K")) {
							outText.setText(
									df.format(TemparatureCal.kelvinToFahrenheit(inputText.getText().trim())) + "");
						}
						if (input.equals("C")) {
							outText.setText(
									df.format(TemparatureCal.celciusToFahrenheit(inputText.getText().trim())) + "");
						}
					} else {
						outText.setText("No Input");
					}
				}

			}
		});
		

		f.add(output1);
		f.add(output2);
		f.add(input1);
		f.add(input2);
		f.add(inputLabel);
		f.add(inputText);
		f.add(outText);
		f.add(outputLabel);
		f.setSize(1000, 600);
		f.setLayout(null);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new TempCalc();
	}
}

class TemparatureCal {
	static public double celciusToFahrenheit(String input) {
		double temp = Double.parseDouble(input);
		temp = temp * 9 / 5 + 32;
		return temp;
	}

	static public double celciusToKelvin(String input) {
		double temp = Double.parseDouble(input);
		temp = temp + 273.15;
		return temp;
	}

	static public double fahrenheitTocelcius(String input) {
		double temp = Double.parseDouble(input);
		temp = (temp - 32) * 5 / 9;
		return temp;
	}

	static public double fahrenheitToKelvin(String input) {
		double temp = Double.parseDouble(input);
		temp = (temp + 459.67) * 5 / 9;
		return temp;
	}

	static public double kelvinToFahrenheit(String input) {
		double temp = Double.parseDouble(input);
		temp = temp * 9 / 5 - 459.67;
		return temp;
	}

	static public double kelvinToCelcius(String input) {
		double temp = Double.parseDouble(input);
		temp = temp - 273.15;
		return temp;
	}
}