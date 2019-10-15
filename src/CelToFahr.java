import java.util.Scanner;

public class CelToFahr {

	public static void main(String[] args) {

		double low, high,low1,high1;
		Scanner sc = new Scanner(System.in);
		// reading the low and high values from the uesr
		System.out.println("Enter low temparature in Celcius");
		low = sc.nextDouble();
		System.out.println("Enter high temparature in Celcius");
		high = sc.nextDouble();

		System.out.println("Enter low temparature in Fahrenheit");
		low1 = sc.nextDouble();
		System.out.println("Enter high temparature in Fahrenheit");
		high1 = sc.nextDouble();

		double i = low;
		// displaying the table for Celsius to Fahrenheit
		System.out.println("Celsius  | Fahrenheit");
		System.out.println("--------+-----------");

		for (i =low; i <= high; i += 5) {
			System.out.print("    " + i + " |");

			double sum = (i * (9.0 / 5.0)) + 32;
			System.out.printf("%6d", (int) sum);
			System.out.println();
		}
		// displaying the table for Fahrenheit to Celsius
		System.out.println();
		System.out.println("Fahrenheit  |  Celsius");
		System.out.println("--------+-----------");

		for (i = low1; i <= high1; i += 5) {
			System.out.print("    " + i + " |");

			double sum = (i -32) * 5/9;
			System.out.printf("%6d", (int) sum);
			System.out.println();
		}
		sc.close();



	}
}