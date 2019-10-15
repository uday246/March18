package May19;

public class Theatre {
	public static void main(String[] args) {
		int arr[][] = { { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 }, { 1, 0, 1, 0, 0 }, { 0, 1, 1, 1, 1 }, { 0, 1, 0, 0, 0 } };
		int row = getAvailableRow(arr);
		if (row == -1)
			System.out.println("No rows are available");
		else
			System.out.println("Available at row: " + row);
	}

	private static int getAvailableRow(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == 0)
					return i;
			}
		}
		return -1;
	}
}
