package May19;

import java.util.Scanner;

public class BarGraph {
	public static void main(String[] args) {
		System.out.println("Enter 4 values: ");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int n4 = sc.nextInt();
		printBar(n1);
		printBar(n2);
		printBar(n3);
		printBar(n4);

	}

	private static void printBar(int n) {
		for (int i = 0; i < n; i++)
			System.out.print("*");
		System.out.println();
	}
}
