import java.util.Scanner;

public class NumberEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Int");
		int num1 = sc.nextInt();
		num1 = num1 + 10;
		System.out.println("Integer after increasing 10 : " + num1);
		System.out.println("Enter decimal");
		double num2 = sc.nextDouble();
		num2 = num2 * 2;
		double q = num2 / 5;
		// loops until user enters valid number
		while (true) {
			if (q >= 5) {
				// break if QUOTIENT is >5
				System.out.println(q);
				break;
			}
			// ask another decimal num if QUOTIENT <5
			System.out.println("Enter another decimal");
			num2 = sc.nextDouble();
			num2 = num2 * 2;
			q = num2 / 5;
		}

	}
}
