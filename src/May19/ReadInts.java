package May19;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class ReadInts {
	public static void main(String[] args) throws Exception {
		//opening file
		Scanner sc = new Scanner(new File("input.txt"));
		ArrayList<Integer> list = new ArrayList<Integer>();
		//reading from file and appenind to list
		while (sc.hasNextInt()) {
			list.add(sc.nextInt());
		}
		sc.close();
		//calling method to remove occurances
		list = removeOccurances(list);
		//printing list
		System.out.println(list);
	}

	private static ArrayList<Integer> removeOccurances(ArrayList<Integer> aList) {
		return new ArrayList<Integer>(new HashSet<Integer>(aList));
	}
}
