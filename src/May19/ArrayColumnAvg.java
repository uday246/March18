package May19;

import java.util.Random;
import java.util.Scanner;

public class ArrayColumnAvg {
	final static int MAX = 50;
	final static int MIN = 1;

	public static void main(String[] args) {
		int row, col;
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		String ch = "Y";
		while (ch.equalsIgnoreCase("Y")) {
			System.out.println("Enter row size: ");
			row = sc.nextInt();
			while (row <= 0) {
				System.out.println("ERROR! Should be positive. REENTER: ");
				row = sc.nextInt();
			}
			System.out.println("Enter col size: ");
			col = sc.nextInt();
			while (col <= 0) {
				System.out.println("ERROR! Should be positive. REENTER: ");
				col = sc.nextInt();
			}
			int arr[][] = new int[row][col];
			System.out.println("The original table is: ");
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					arr[i][j] = r.nextInt(MAX - MIN) + MIN;
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
			double avg[] = getColumnAvg(arr);
			System.out.println("The average of each column: ");
			for (double d : avg)
				System.out.print(d + " ");
			System.out.println();
			System.out.println("Do you want to continue (Y/N): ");
			ch = sc.nextLine();
			ch = sc.nextLine();
		}
	}

	private static double[] getColumnAvg(int[][] arr) {
		double avg[] = new double[arr[0].length];
		double sum = 0;
		Arrays.parallelSe
		for (int i = 0; i < arr[0].length; i++) {
			sum = 0;
			for (int j = 0; j < arr.length; j++) {
				sum += arr[j][i];
			}
			avg[i] = sum / arr[0].length;
		}
		return avg;
	}
}
