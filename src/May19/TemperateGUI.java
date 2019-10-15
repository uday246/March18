package May19;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class TemperateGUI extends JFrame

{

	private JLabel lengthL, widthL, areaL, perimeterL;

	JTextField Ftemp;

	JTextField Ctemp;

	JTextField areaTF;

	JTextField perimeterTF;

	private JButton calculateB, exitB;

	private CalculateButtonHandler cbHandler;

	private ExitButtonHandler ebHandler;

	private static final int WIDTH = 400;

	private static final int HEIGHT = 400;

	public TemperateGUI()

	{

		// Create the four labels

		lengthL = new JLabel("enter temperature in farenheight: ",

				SwingConstants.RIGHT);

		widthL = new JLabel("Enter temperature in celcius: ",

				SwingConstants.RIGHT);

		areaL = new JLabel("Converted to celcius: ", SwingConstants.RIGHT);

		perimeterL = new JLabel("Converted to farenheight: ",

				SwingConstants.RIGHT);

		// Create the four text fields

		Ftemp = new JTextField(10);

		Ctemp = new JTextField(10);

		areaTF = new JTextField(10);

		perimeterTF = new JTextField(10);

		// Create Calculate Button

		calculateB = new JButton("Calculate");

		cbHandler = new CalculateButtonHandler();

		calculateB.addActionListener(cbHandler);

		// Create Exit Button

		exitB = new JButton("Exit");

		ebHandler = new ExitButtonHandler();

		exitB.addActionListener(ebHandler);

		// Set the title of the window

		setTitle("Temperature Converter");

		// Get the container

		Container pane = getContentPane();

		// Set the layout

		pane.setLayout(new GridLayout(5, 2));

		// Place the components in the pane

		pane.add(lengthL);

		pane.add(Ftemp);

		pane.add(widthL);

		pane.add(Ctemp);

		pane.add(areaL);

		pane.add(areaTF);

		pane.add(perimeterL);

		pane.add(perimeterTF);

		pane.add(calculateB);

		pane.add(exitB);

		// Set the size of the window and display it

		setSize(WIDTH, HEIGHT);

		setVisible(true);

		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	private class CalculateButtonHandler implements ActionListener

	{

		public CalculateButtonHandler() {
			// TODO Auto-generated constructor stub
		}

		public void actionPerformed(ActionEvent e)

		{

			double Celcius, Farenheight, ConvertedToC, CoonvertToF;

			Farenheight = Double.parseDouble(Ftemp.getText());

			Celcius = Double.parseDouble(Ctemp.getText());

			ConvertedToC = (Farenheight - 32) * (5 / 9.0);

			CoonvertToF = (Celcius * 9 / 5 + 32);

			areaTF.setText("" + ConvertedToC);

			perimeterTF.setText("" + CoonvertToF);

		}

	}

	private class ExitButtonHandler implements ActionListener

	{

		public ExitButtonHandler() {
			// TODO Auto-generated constructor stub
		}

		public void actionPerformed(ActionEvent e)

		{

			System.exit(0);

		}

	}

	public static void main(String[] args)

	{

		TemperateGUI rectObject = new TemperateGUI();

	}

}