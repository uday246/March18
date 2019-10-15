package Mat16th;

import java.util.Scanner;

public class Dollars {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dollrs,temp;
		System.out.println("Enter Dollrs : ");
		dollrs = sc.nextInt();
		temp = dollrs;
		System.out.println("Please pay using below denominations:");
		// diving with 20 to find 20 coins
		if(temp>=20){
			System.out.println( "Please pay "+(temp/20)+"  20$ coins");
			temp = temp%20;
		}
		// diving with 10 to find 10 coins
		if(temp>=10){
			System.out.println( "Please pay "+(temp/10)+"  10$ coins");
			temp = temp%10;
		}
		// diving with 5 to find 20 coins
		if(temp>=5){
			System.out.println( "Please pay "+(temp/5)+"  5$ coins");
			temp = temp%5;
		}
		// diving with 1 to find 1 coins
		if(temp>=1){
			System.out.println( "Please pay "+(temp/1)+"  1$ coins");
			temp = temp%1;
		}
	}
}
