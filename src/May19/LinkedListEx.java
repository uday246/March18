package May19;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Random;

public class LinkedListEx {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		Random r = new Random();
		int n;
		int sum = 0;
		double avg = 0;
		for (int i = 0; i < 25; i++) {
			n = r.nextInt(100);
			list.add(n);
			sum += n;
		}
		System.out.println(list);
		avg = sum / 25.0;
		//sorting the list using the comparator
		Collections.sort(list, new Comparator<Integer>() {

			@Override
			public int compare(Integer a1, Integer a2) {
				return -1 * a1.compareTo(a2);
			}
		});
		System.out.println("Sum is: " + sum);
		System.out.println("Average is: " + avg);
		System.out.println(list);

	}
}
