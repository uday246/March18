import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {

		int counter = 0, value;

		System.out.println("Enter array length \n");

		Scanner sc = new Scanner(System.in);
		counter = sc.nextInt();
		int numArray[] = new int[counter];

		int i = 0;
System.out.println("Enter "+counter+" elements");
		while (i < counter) {
			numArray[i] = sc.nextInt();
			i++;
		}

		i = 0;


		int totalSwaps = sort(numArray, counter);

		System.out.println("Swaps: " + totalSwaps);

		i = 0;

		while (i < counter) {

			System.out.println(numArray[i] + " ");
			i++;

		}

	}

	public static int sort(int array[], int count) {

		int i, j, temp;

		int swaps = 0;

		for(i = 0; i < count-1; ++i) {

			for(j=0; j < count-1-i; ++j) {

				if(array[j] > array[j+1]) {

					temp = array[j+1];

					array[j+1] = array[j];

					array[j] = temp;

					swaps++;

				}

			}

		}
		return swaps;
	}
	
}