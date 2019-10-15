package May19;

import java.util.Scanner;

public class Lab75 {
	public static void main(String[] args) {
		double arr[] = new double[5];
		double sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 values: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextDouble();
			sum += arr[i];
		}
		sc.close();
		System.out.println("Sum: "+sum);
		double average = sum / arr.length;
		System.out.println("Average: "+average);
		printHigherThanAverage(arr, average);
	}

	private static void printHigherThanAverage(double[] arr, double avg) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= avg)
				System.out.print(arr[i] + " ");
		}
	}
}
