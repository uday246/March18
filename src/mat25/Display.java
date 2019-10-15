package mat25;

import java.util.Scanner;

public class Display {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	// reading number from user
	System.out.println("Enter number");
	int num = sc.nextInt();
	// call displayNumbers
	displayNumbers(num);
}
public static void displayNumbers(int n){
	// starting the loop from 1 to n
	for(int i=1;i<=n;i++)
		// printing numbers by appending space
		System.out.print(i+" ");
}
}
