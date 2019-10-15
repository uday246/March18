package May19;

import java.util.Scanner;

public class Avg {
	public static void main(String[] args) {
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter " + size + " elements: ");
		for (int i = 0; i < size; i++)
			arr[i] = sc.nextInt();
		double sum = 0;
		System.out.println("Average: ");
		for (int i = 0; i < size - 2; i++) {
			sum = arr[i] + arr[i + 1] + arr[i + 2];
			sum = sum / 3;
			System.out.printf("(%d,%d,%d)->%.3f\n", arr[i],arr[i+1],arr[i+2],sum);
		}
	}
}
