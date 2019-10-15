package Mat16th;

import java.util.Scanner;

public class MonthTest {
	public static void main(String[] args) {
		String arr[] = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };

		int month;

		System.out.println("Enter month number");
		Scanner sc = new Scanner(System.in);
		month = sc.nextInt();
		while (month < 1 || month > 12) {
			System.out.println("Invalid input");
			month = sc.nextInt();
		}
		System.out.println(arr[month - 1]);
	}
}
