package Programming;

import java.util.Scanner;

public class LargestNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;

		do {
			System.out.println("Enter Num1 : ");
			num1 = sc.nextInt();
			System.out.println("Enter Num2 : ");
			num2 = sc.nextInt();
			int res = getLargestNumber(num1, num2);
			System.out.println("Largest Num is : " + res);

		} while (num1 != 0 && num2 != 0);
		// breaks if both are 0
		sc.close();
	}

	// will return the largest number in the given number
	private static int getLargestNumber(int aNum1, int aNum2) {
		aNum1 = Math.abs(aNum1);
		aNum2 = Math.abs(aNum2);
		return (aNum1 > aNum2) ? aNum1 : aNum2;
	}
}
