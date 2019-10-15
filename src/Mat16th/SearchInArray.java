package Mat16th;

public class SearchInArray {
	public static void main(String[] args) {
		int arr[] = { 1, 5, 2, 4, 7, 6 };
		int ele = 3;
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ele) {
				flag = true;
				break;
			}
		}
		if (flag) {
			System.out.println("Found");
		} else {
			System.out.println("Not found");
		}
	}
}
