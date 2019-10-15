package May19;

import java.util.Random;

public class RandEx {
	public static void main(String[] args) {
		System.out.println(randomInt(2));
		System.out.println(randomInt(3));

	}

	private static int randomInt(int n) {
		int max = (int) Math.pow(10, n);
		int min = (int) Math.pow(10, n - 1);
		Random r = new Random();
		return r.nextInt(max - min) + min;
	}
}
