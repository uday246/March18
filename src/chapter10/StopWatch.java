package chapter10;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;

public class StopWatch extends JApplet
{

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private final int TIME_DELAY = 1000;
  int numSeconds = 0;
  private JTextField seconds;
  private JButton startButton;
  private JButton stopButton;
  private JPanel secondsPanel;
private JPanel buttonPanel;
  private Timer timer;

public void init()
{

buildButtonPanel();
  buildSecondsPanel();
  add(buttonPanel, BorderLayout.SOUTH);
  add(secondsPanel, BorderLayout.CENTER);

setTimer(new Timer(TIME_DELAY, new TimerListener()));
}

private void buildButtonPanel()
{

buttonPanel = new JPanel();

startButton = new JButton("Start");
  stopButton = new JButton("Stop");

startButton.addActionListener(new StartButtonListener());
  stopButton.addActionListener(new StopButtonListener());

buttonPanel.add(startButton);
  buttonPanel.add(stopButton);
}

private void buildSecondsPanel()
{

secondsPanel = new JPanel();

setSeconds(new JTextField(10));
  getSeconds().setEditable(false);
  getSeconds().setFont(new Font("SansSerif", Font.BOLD, 18));
  getSeconds().setText("0");

secondsPanel.add(getSeconds());

}

public Timer getTimer() {
	return timer;
}

public void setTimer(Timer aTimer) {
	timer = aTimer;
}

public JTextField getSeconds() {
	return seconds;
}

public void setSeconds(JTextField aSeconds) {
	seconds = aSeconds;
}

private class StartButtonListener implements ActionListener
{

public StartButtonListener() {
		// TODO Auto-generated constructor stub
	}

public void actionPerformed(ActionEvent e)
  {
getTimer().start();
  }

}

private class StopButtonListener implements ActionListener
{
public StopButtonListener() {
		// TODO Auto-generated constructor stub
	}

public void actionPerformed(ActionEvent e)
{
getTimer().stop();
  }

}

private class TimerListener implements ActionListener
{
  public TimerListener() {
		// TODO Auto-generated constructor stub
	}

public void actionPerformed(ActionEvent e)
  {
	  numSeconds++;
getSeconds().setText(String.valueOf(numSeconds));
  }

}

}