package May19;

import java.util.ArrayList;
import java.util.List;

public class TestGenerics {
	public static void main(String[] args) {
		ArrayList<Double> list = new ArrayList<Double>();
		list.add(1.1);
		list.add(2.2);
		list.add(3.3);
		list.add(4.4);
		list.add(5.5);
		list.add(6.6);
		ArrayList<Character> letters = new ArrayList<Character>();
		letters.add('a');
		letters.add('b');
		letters.add('c');
		letters.add('d');
		letters.add('e');
		letters.add('f');
		letters.add('g');
		System.out.println("Original lists: ");
		System.out.println(list);
		System.out.println(letters);
		removeEveryOtherElement(list);
		removeEveryOtherElement(letters);
		System.out.println();
		System.out.println("After removing: ");
		System.out.println(list);
		System.out.println(letters);

	}

	public static <T> void removeEveryOtherElement(List<T> list) {
		List<T> res = new ArrayList<T>();
		for (int i = 0; i < list.size(); i += 2) {
			res.add(list.get(i));
		}
		list.clear();
		list.addAll(res);
	}
}
