package mat25;

import java.util.Scanner;

class Update extends Thread{
	public void run(){
		for(;;){
			try{
				System.out.println("Updating screen.....!!!");
				Thread.sleep(60000);
			}
			catch(Exception e){}
		}
	}
}
public class UpdateScreen {
public static void main(String[] args) {
	// started new thread which updates the screen for every one minute
	new Update().start();
	Scanner sc = new Scanner(System.in);
	//infinite loop to accept the numbers from user
	for(;;){
		
		// reading number
		double num=sc.nextDouble();
		// printing number
		System.out.println(num);
	}
}
}
