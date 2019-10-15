package Mat18th;

import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Main {
  public static void main(String[] args) throws Exception {
    Robot robot = new Robot();
    
    while(true){
    	
    	robot.keyRelease(KeyEvent.VK_F5);
    	robot.keyPress(KeyEvent.VK_F5);
    	Thread.sleep(180*60);
    	
    }
    
  }
}