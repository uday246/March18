package May19;

public class TwoDArray {
	public static void main(String[] args) {
		int arr[][] = { { -2, 3, 5 }, { 5, 4, -6 }, { 3, -8, 7 } };
		int res = arr[0][0];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] > res && arr[i][j] % 2 == 0)
					res = arr[i][j];
			}
		}
		System.out.println("Largest even num: " + res);
	}
}
