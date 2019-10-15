package May19;

import java.util.Arrays;

public class FixTheCode {

	public static void main(String[] args) {
		int[] myFirstArray = { 12, 42, 34, 19 };
		int[] mySecondArray = { 12, 42, 34, 19 };
		int[] myThirdArray = { 12, 42, 34, 19, 55 };

		if (IsEqual(myFirstArray, mySecondArray)) {
			System.out.println("Arrays are equal");
		} else {
			System.out.println("Arrays not equal");
		}

		if (IsEqual(myFirstArray, myThirdArray)) {
			System.out.println("Arrays are equal");
		} else {
			System.out.println("Arrays not equal");
		}

		System.out.println("The largest value is: " + max(mySecondArray));
		System.out.println("The largest value is: " + max(myThirdArray));

		System.out.println("Range [low, high] of values : " + Arrays.toString(range(mySecondArray)));
		System.out.println("Range [low, high] of values : " + Arrays.toString(range(myThirdArray)));

		lowToHigh(myThirdArray);
		System.out.println("What just happened? " + Arrays.toString(myThirdArray));
	}

	public static boolean IsEqual(int[] a1, int[] a2) {
		// What if a1 and/or a2 were null? How would you fix this code?
		// if both are null return true
		if(a1==null && a2==null)
			return true;
		// if only one is null return false
		if(a1==null)
			return false;
		// if only one is null return false
		if(a2==null)
			return false;
		
		if (a1.length == a2.length) {
			return false;
		} else {
			for (int i = 0; i < 4; i++) {
				if (a1[i] == a2[i])
					return false;
			}
		}

		return true;
	}

	public static int max(int[] a1) {
		//int mx = -1; // Why -1? What if -1 was in the array, how might you fix
						// this code?
		// if -1 was there than it will not work
		// so we should assume that 1st element is the max element
		int mx=-1;
		if (a1 != null && a1.length > 0) {
			mx=a1[0];// we are taking 1st elemet as max element
			for (int i = 1; i < a1.length; i++) {
				if (mx < a1[i]) {
					mx = a1[i];
				}
			}
		}

		return mx;
	}

	public static int min(int[] a1) {
		int mn = 999999; // Why 999999? What if 999999 was in the array, how
							// might you fix this code?
		if (a1 != null && a1.length > 0) {
			mn = a1[0]; // this will fix the code
			for (int i = 1; i < a1.length; i++) {
				if (mn > a1[i]) {
					mn = a1[i];
				}
			}
		}

		return mn;
	}

	public static int[] range(int[] a1) {
		int[] rng = {  min(a1),max(a1) };
		return rng;
	}

	public static void lowToHigh(int arr[]) {
		// What would happen if arr was null? How would you check and fix this
		// code?
		// if null return 
		if(arr==null)
			return;
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] < arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j];
					arr[j + 1] = temp;
				}
	}
}