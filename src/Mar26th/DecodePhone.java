package Mar26th;

import java.util.Scanner;

public class DecodePhone {
	public static void main(String[] args) {
		System.out.println("Enter Phone");
		Scanner sc = new Scanner(System.in);
		String phone = sc.nextLine();
		phone = phone.toUpperCase();
		char array[] = phone.toCharArray();
		for (int i = 0; i < array.length; i++) {
				array[i] = getNumber(array[i]);
		}
		System.out.println(new String(array));
	}
// returning the int value based on the alphabate
	private static char getNumber(char aC) {
		char c = ' ';
		switch (aC) {
		case 'A':
		case 'B':
		case 'C':
			c = '2';
			break;
		case 'D':
		case 'E':
		case 'F':
			c = '3';
			break;
		case 'G':
		case 'H':
		case 'I':
			c = '4';
			break;
		case 'J':
		case 'K':
		case 'L':
			c = '5';
			break;
		case 'M':
		case 'N':
		case 'O':
			c = '6';
			break;
		case 'P':
		case 'Q':
		case 'R':
		case 'S':
			c = '7';
			break;
		case 'T':
		case 'U':
		case 'V':

			c = '8';
			break;
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':

			c = '9';
			break;

		}
		return c;
	}
}
