package May19;

import java.util.Scanner;

public class ArrayInt {
	public static void main(String[] args) {
		int arr[] = getArray();
		displayArray(arr);
		int sum = getSum(arr);
		int min = getMin(arr);
		System.out.println("Sum: " + sum);
		System.out.println("Minimum element: " + min);

	}

	private static int getSum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++)
			sum += arr[i];
		return sum;
	}

	private static int getMin(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++)
			if (arr[i] < min)
				min = arr[i];
		return min;
	}

	private static void displayArray(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	private static int[] getArray() {
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 elements: ");
		for (int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();
		sc.close();
		return arr;
	}
}
