package Mar27th;

import java.util.Scanner;

public class NumberToWordsConverter {

	public static final String[] units = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
			"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen",
			"Nineteen" };

	public static final String[] tens = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty",
			"Ninety" };

	// covert given num in words
	public static String convert(final int n) {
		if (n < 0) {
			return "Minus " + convert(-n);
		}

		if (n < 20) {
			return units[n];
		}

		if (n < 100) {
			return tens[n / 10] + ((n % 10 != 0) ? " " : "") + units[n % 10];
		}

		if (n < 1000) {
			return units[n / 100] + " Hundred" + ((n % 100 != 0) ? " " : "") + convert(n % 100);
		}
		return "";
	}

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		double num = sc.nextDouble();
		sc.close();
		if (num >= 1000) {
			System.out.println("Invalid num");
			return;
		}
		System.out.print(convert((int) num));

	}
}