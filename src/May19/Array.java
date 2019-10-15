package May19;

import java.util.Random;

public class Array {
	public static void main(String[] args) {
		double arr[][] = getArray();
		displayArray(arr);
		double sum = getSum(arr);
		System.out.printf("Sum: %.2f\n" , sum);
		getColumnSum(arr);
	}

	private static double getSum(double[][] arr) {
		double sum = 0;
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				sum += arr[i][j];
		return sum;
	}

	private static double getColumnSum(double[][] arr) {
		double sum = 0;
		for (int i = 0; i < 3; i++) {
			sum = 0;
			for (int j = 0; j < 3; j++)
				sum += arr[j][i];
			System.out.printf("Column " + (i + 1) + " sum: %.2f\n" , sum);
		}
		return sum;
	}

	private static void displayArray(double[][] arr) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++)
				System.out.printf("%6.2f", arr[i][j]);
			System.out.println();
		}
	}

	private static double[][] getArray() {
		double arr[][] = new double[3][3];
		Random r = new Random();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++)
				arr[i][j] = (100) * r.nextDouble();
		}
		return arr;
	}
}
