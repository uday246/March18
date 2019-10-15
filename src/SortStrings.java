import java.util.Scanner;

public class SortStrings {
	public static void main(String[] args) {
		String arr[] = new String[10];
		Scanner sc = new Scanner(System.in);
		// reading names
		System.out.println("Enter 10 words");
		for (int i = 0; i < arr.length; i++)
			arr[i] = sc.next();
		// calling sort function
		sort(arr);
		// printing names
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}

	public static void sort(String arr[]) {
		int i, j;
		String temp;
		int n = arr.length;
		// outer loop to travel through the all elements
		for (i = 0; i < n - 1; i++) {
			// inner loop to compare the outer loop elements
			for (j = 0; j < n - i - 1; j++)
				// if element at j< than j+1 than swap both
				if (arr[j].compareTo(arr[j + 1]) > 0) {
					// swap logic
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
		}

	}
}
