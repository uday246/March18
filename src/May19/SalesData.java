package May19;

import java.util.Scanner;

public class SalesData {
	public static void main(String[] args) {
		int sales[] = new int[12];
		int max = -1, index = 0;
		Scanner sc = new Scanner(System.in);
		int q1 = 0, q2 = 0, q3 = 0, q4 = 0, total = 0;
		for (int i = 0; i < 12; i++) {
			System.out.println("Please enter the data for month " + (i + 1));
			sales[i] = sc.nextInt();
			if (max < sales[i]) {
				max = sales[i];
				index = i;
			}
		}
		for (int i = 0; i < 12; i++) {
			if (i < 3) {
				q1 += sales[i];
			} else if (i < 6) {
				q2 += sales[i];
			} else if (i < 9) {
				q3 += sales[i];
			} else if (i < 12) {
				q4 += sales[i];
			}
			total += sales[i];
		}
		System.out.println("The first quarter total is " + q1);
		System.out.println("The second quarter total is " + q2);
		System.out.println("The third quarter total is " + q3);
		System.out.println("The fourth quarter total is " + q4);
		System.out.println("The Annual sales total is " + total);
		System.out.println("Month " + (index + 1) + " has the highest sales " + max);
	}
}
