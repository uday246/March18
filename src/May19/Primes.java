package May19;

import java.util.ArrayList;

public class Primes {
	public static void main(String[] args) {
		int arr[] = { 4, 7, -2, 17, 51, 23 };
		movePrimesLeft(arr);
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}

	private static void movePrimesLeft(int[] arr) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (isPrime(arr[i])) {
				list.add(arr[i]);
			}
			arr[i] = 0;
		}
		for (int i = 0; i < list.size(); i++)
			arr[i] = list.get(i);
	}

	private static boolean isPrime(int aI) {
		if(aI<=0)
			return false;
		for (int i = 2; i < aI; i++)
			if (aI % i == 0)
				return false;
		return true;
	}
}
