package May19;

import java.util.Arrays;
import java.util.Scanner;

class BubbleSort {
	int arr[];

	public BubbleSort(int[] aArr) {
		super();
		arr = aArr;
	}

	@Override
	public String toString() {
		return Arrays.toString(arr);
	}

	public void sort() {
		int i, j, temp;
		int count = arr.length;
		for (i = 0; i < count - 1; ++i) {
			for (j = 0; j < count - 1 - i; ++j) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}

public class TestBubbleSort {
	public static void main(String[] args) {
		System.out.println("Enter array length \n");

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int numArray[] = new int[size];

		int i = 0;
		System.out.println("Enter " + size + " elements");
		while (i < size) {
			numArray[i] = sc.nextInt();
			i++;
		}
		BubbleSort b = new BubbleSort(numArray);
		System.out.println(b);
		b.sort();
		System.out.println(b);
		sc.close();
	}
}
