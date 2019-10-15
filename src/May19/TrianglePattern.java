package May19;

import java.util.Scanner;

public class TrianglePattern {
	
	public static void main(String[] args) {
		try{
		test();
		}catch(ArithmeticException e){e.printStackTrace();}
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a positive integer: ");
		int rows = sc.nextInt();
		for(int i = 1, k = 0; i <= rows; ++i, k = 0)
	    {
	        for(int space = 1; space <= rows-i; ++space)
	        {
	            System.out.print("  ");
	        }

	        while(k != 2*i-1)
	        {
	            System.out.print("* ");
	            ++k;
	        }
	        System.out.println();
	    } 
	}

	private static void test() {
		try{	
		int a=10/0;
		}catch(NullPointerException e){};
	}
}
