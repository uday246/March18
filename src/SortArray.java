import java.util.Set;
import java.util.TreeSet;

public class SortArray {
	public static void main(String[] args) {

		int j = 1;

		int i = 3 / j;

		for (i =1; i > -1; i++)

		i--;
		
		/*int arr[] = { 1, 5, 3, 9, 7, 54, 23, 67, 213, 1, 5, 3, 54 };

		System.out.println("Before Sort");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		arr = sortAndRemove(arr);
		System.out.println("After Sort");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}*/
	}

	private static int[] sortAndRemove(int[] aArr) {
		Set<Integer> set = new TreeSet<Integer>();
		// adding elements to the tree set so that it will be in sorted order and unique
		for (int ele : aArr) {
			set.add(ele);
		}
		// converting the set to int
		int arr[] = new int[set.size()];
		int index = 0;
		for (Object ele : set) {
			arr[index++] = (int) ele;
		}
		return arr;
	}
}
