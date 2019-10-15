package May19;

import java.util.Scanner;

public class Comparison {
	public static void main(String[] args) {
		System.out.println("Enter 2 strings");
		// reading strins from the user
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		// reading the number of char to compare
		System.out.println("Enter number of chars to compare");
		int n = sc.nextInt();
		// reading the starting index of comparison
		System.out.println("Enter starting indec of comparison");
		int l = sc.nextInt();
		// caling regionMatches with true so that it will ignore the case
		System.out.println(str1.regionMatches(true, l, str2, 0, n));

	}
}
