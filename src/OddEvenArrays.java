
public class OddEvenArrays {
	public static void main(String[] args) {
		int[][] a = { { 31, 14, 23, 22 }, { 98, 87, 26, 11 }, { 16, 4, 9, 2 } };
		System.out.println("Even Numbers : ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] % 2 == 0)
					System.out.print(a[i][j] + " ");
			}
		}
		System.out.println("Odd Numbers : ");
		int small = a[0][0], big = a[0][0];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] % 2 == 1)
					System.out.print(a[i][j] + " ");
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] % 2 < small)
					small = a[i][j];

				if (a[i][j] > big)
					big = a[i][j];

			}
		}
		System.out.println("\nBig number in array : " + big);
		System.out.println("\nSmall  number in array : " + small);
		int sum[] = new int[a.length], total = 0;
		for (int i = 0; i < a.length; i++) {
			total = 0;
			for (int j = 0; j < a[i].length; j++) {
				total = total + a[i][j];

			}
			sum[i] = total;
		}
		big = 0;
		for (int i = 0; i < sum.length; i++) {
			if (sum[big] < sum[i])
				big = i;
		}
		System.out.println("\nRow with largest sum : " + big);

	}
}
