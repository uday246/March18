package May19;

import java.util.Scanner;

public class Factors {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start and end numbers");
		int start = sc.nextInt();
		int end = sc.nextInt();
		int t = 0, f = 0;
		for (int i = start; i <= end; i++) {
			if (i % 3 == 0)
				t++;
			if (i % 5 == 0)
				f++;
		}
		System.out.println(t);
		System.out.println(f);

	}

}