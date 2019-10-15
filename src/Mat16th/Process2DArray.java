package Mat16th;

public class Process2DArray {
	public static void main(String[] args) {
		int arr[][] = new int[5][5];
		for (int i = 0; i < arr.length; i++)
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = i * j;
			}
		int ele = 6;
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			System.out.println();
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == ele) {
					flag = true;
					i = arr.length + 1;
					break;
				}
			}
		}
		if (flag) {
			System.out.println("Found");
		} else {
			System.out.println("Not found");
		}
	}
}
