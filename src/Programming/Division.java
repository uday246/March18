package Programming;

import java.util.Scanner;

public class Division {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int quotient = 0;
		System.out.println("Enter dividend ");
		int dividend = sc.nextInt();
		System.out.println("Enter divisor ");
		int divisor = sc.nextInt();
		sc.close();
		// checking for proper input
		if (dividend < 0 || divisor <= 0) {
			System.out.println(" dividend and divisor must be greater than 0");
			return;
		}
// looping until dividend < less than divisor
		while (dividend >= divisor) {
			quotient++;
			dividend -= divisor;
		}
		System.out.println("Reminder :" + dividend);
		System.out.println("quotient : " + quotient);
	}
}
