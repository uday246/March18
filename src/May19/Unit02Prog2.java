package May19;

import java.util.Scanner;

public class Unit02Prog2 {
	public static void test(int i){System.out.println("I");}
	public static void test(short i){System.out.println("S");}
	
	public static void main(String[] args) {
		int total = 0;
		short s=0;
		test(s);
		test(total);
		
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.println("Please enter a number: ");
			total += sc.nextInt();
		}
		System.out.println("The total is " + total);
	}
}
