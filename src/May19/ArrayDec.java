package May19;

import java.io.File;
import java.util.Scanner;

public class ArrayDec {
	public static void main(String[] args) throws Exception {
		double d1[] = new double[200];
		double d2[] = new double[200];
		int count = 0;
		//opening the file to read the data
		Scanner sc = new Scanner(new File("input.txt"));
		//reading the data
		while (sc.hasNextDouble()) {
			//reading data to 2 arrays
			d1[count] = sc.nextDouble();
			d2[count++] = sc.nextDouble();
		}
		//iterating the loop till the count to print the values from the arrays
		for (int i = 0; i < count; i++) {
			System.out.println(d1[i] + " : " + d2[i]);
		}
	}
}
