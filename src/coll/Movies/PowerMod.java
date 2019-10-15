package coll.Movies;

import java.util.Arrays;
import java.util.Scanner;

// if he wants to pick more than he shoud start picking from the lowest so here I sorted array from low to high
public class PowerMod {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int amount = sc.nextInt();
		int shades[] = new int[count];
		for (int i = 0; i < count; i++)
			shades[i] = sc.nextInt();
		Arrays.sort(shades);
		int sum = 0, i;
		for (i = 0; i < count; i++) {
			if (sum <= amount) {
				sum += shades[i];
			} else {
				break;
			}
		}
		System.out.println(i-1);
		sc.close();
	}
}
