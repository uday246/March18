package May19;

import java.util.Scanner;

public class SortArrayRows {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[3][3];
		int rows = 3, cols = 3;

		System.out.println("Enter a 3 by 3 matrix row by row: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Before Sort: ");
		printArray(arr);
		arr = sortRows(arr);
		System.out.println("After Sort: ");
		printArray(arr);
	}

	public static int[] sort(int arr[]) {
		int i, j, temp, n = arr.length;
		// outer loop to travel through the all elements
		for (i = 0; i < n - 1; i++) {
			// inner loop to compare the outer loop elements
			for (j = 0; j < n - i - 1; j++)
				// if element at j< than j+1 than swap both
				if (arr[j] > arr[j + 1]) {
					// swap logic
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
		}
		return arr;
	}

	private static int[][] sortRows(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sort(arr[i]);
		}

		return arr;

	}

	private static void printArray(int[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}
}
