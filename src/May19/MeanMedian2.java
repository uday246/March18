package May19;

import java.util.Scanner;

public class MeanMedian2 {
	public static void main(String[] args) {
		int[] nums = new int[20];
		int num = 0;
		String entry;
		String list = "You entered: ";
		int a, b;
		int temp;
		double median = 0;
		int total = 0;
		double mean = 0;
		final int QUIT = 9999;
		int size = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers: (9999 to exit)");
		num = sc.nextInt();
		for (a = 0; num != QUIT && a < nums.length; ++a) {
			System.out.println(list + num);
			nums[a] = num;
			System.out.println("Enter numbers: (9999 to exit)");
			num = sc.nextInt();
			// your code here
		}
		size = a;
		System.out.println("size is " + size);
		for (a = 0; a < size; ++a) {
			mean += nums[a];
			for (b = 0; b < size - 1; ++b) {
				if (nums[b] > nums[b + 1]) {
					temp = nums[b];
					nums[b] = nums[b + 1];
					nums[b + 1] = temp;
				}
			}
		}
		mean /= size;
		if (size % 2 == 1)
			median = nums[size / 2];
		else {
			median = nums[size / 2] + nums[size / 2 + 1];
			median = median / 2;
		}
		// your code here

		System.out.println("The mean is " + mean + " and the median is " + median);

	}
}