package mat25;

import java.util.Scanner;

public class DivideByX {
public static void main(String[] args) {
	int userNum;
	int x;
	//reading usernum and x
	Scanner sc = new Scanner(System.in);
	userNum=sc.nextInt();
	x=sc.nextInt();
	//diving and printing 4 times
	userNum=userNum/2;
	System.out.print(userNum+" ");
	userNum=userNum/2;
	System.out.print(userNum+" ");
	userNum=userNum/2;
	System.out.print(userNum+" ");
	userNum=userNum/2;
	System.out.print(userNum+" ");
	
}
}
