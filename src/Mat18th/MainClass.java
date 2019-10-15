package Mat18th;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class MainClass {

  public static void main(String[] args) {
	  // 1st Paremeter is the time time Interval  as per the code it 1sec which 1000milli sec and second one is the object of ActionListner
	  // Interval means how frequently the task should get invoke
    Timer timer = new Timer(1000, new MyTimerActionListener());

    timer.start();
    // Sleeping the main thread for 10sec so that main program will not end, we can change the number seconds to wait
   try{ Thread.sleep(10000);}catch(Exception e){System.out.println(e);}
   
    timer.stop();
  }

}

class MyTimerActionListener implements ActionListener {
  public void actionPerformed(ActionEvent e) {

    System.out.println("Hello World");

  }
}
