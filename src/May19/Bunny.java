package May19;

import java.util.ArrayList;

public class Bunny {
	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add(100);
		l.add(200);
		l.add(300);
		l.add(3, 400);
		System.out.println(l);
		System.out.println(new Bunny().countX("xxhixx"));
		System.out.println(new Bunny().endX("xxre"));
		System.out.println(new Bunny().endX("xxhixx"));
		RuntimeException e;

	}

	public int bunnyEars(int bunnies) {

		if (bunnies == 0)
			return 0;

		return 2 + bunnyEars(bunnies - 1);

	}

	public int countX(String str) {
		if (str.length() == 0) {
			return 0;
		}
		int count = 0;
		// if char is x than count
		if (str.charAt(0) == 'x') {
			count++;
		}
		// we are moving char by char
		// so we sending substring from 1 every time
		return count + countX(str.substring(1));
	}
	public String endX(String str) {

		if (str.length() <= 1)
			return str;
		// if the staring char is x than adding it to the end
		if (str.charAt(0) == 'x')
			return endX(str.substring(1)) + "x";
		// here we are going char by
		return str.charAt(0) + endX(str.substring(1));
	}
}
