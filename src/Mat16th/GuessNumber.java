package Mat16th;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	public static final String CORRECT = "correct";
	public static final String HIGH = "high";
	public static final String LOW = "low";

	static Scanner  sc = new Scanner(System.in);
	public static void main(String[] args) {
		boolean keepPlay = true;
		System.out.println("Enter number between 1 to 100");
		Random r = new Random();
		// generating number in given range
		int count = 0;
		String ch = "";
		while (true) {
			int rand = getRandomNumber();
			System.out.println(rand);
			while (true) {
				int num = getUserInput();
				String res = checkNumber(rand, num);
				if (res.equals(CORRECT)) {
					System.out.println("Congratulations...you gussed correct..!!!");
					break;
				} else if (res.equalsIgnoreCase(HIGH)) {
					System.out.println("High...!!!!");
				} else {
					System.out.println("Low....!!!!");
				}

			}
			System.out.println("Do you want to continue (y/n)");
			sc.nextLine();
			ch = sc.nextLine();
			if (ch.equalsIgnoreCase("n"))
				break;

		}
	}

	private static int getUserInput() {
		System.out.println("guess the number in range 1-20");
		int n =sc.nextInt();
		return n;
	}

	private static String checkNumber(int aRand, int aNum) {
		if (aRand > aNum)
			return LOW;
		else if (aRand < aNum)
			return HIGH;

		return CORRECT;
	}

	private static int getRandomNumber() {
		Random r = new Random();
		return r.nextInt(20) + 1;
	}
}
