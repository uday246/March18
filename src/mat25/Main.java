package mat25;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String reverse_me = scnr.next();
		String reversed = "";
		int string_iterater = reverse_me.length() - 1;

		// answer here
		// iterating through the string from the end
		for (int i = string_iterater; i >= 0; i--) {
			reversed += reverse_me.charAt(i);
		}
		System.out.println("The string reversed is " + reversed);

	}
}
