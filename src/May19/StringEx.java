package May19;

import java.util.Scanner;

public class StringEx {
	public static void main(String[] args) {
		System.out.println(password("Jua@123"));
		printInput("Hello", 5);
	}

	private static void printInput(String aString, int aI) {
		for (int i = 0; i < aI; i++)
			System.out.println(aString);
	}

	private static boolean password(String aString) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		String str = "";
		while (i < 3) {
			System.out.println("Enter password: (Guess " + (i + 1) + ") ");
			str = sc.nextLine();
			if (str.equals(aString))
				return true;
			i++;
		}
		sc.close();
		return false;
	}
}
