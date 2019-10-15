import java.util.Scanner;

public class Telephone {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter telephone number");
	String str=sc.nextLine().toUpperCase();
	for(int i=0;i<str.length();i++){
		if(str.charAt(i)!='-')
			System.out.print(getNumber(str.charAt(i)));
	}
}

private static int getNumber(char aCharAt) {
	int n=0;
		switch (aCharAt) {
		case 'A':
		case 'B':
		case 'C':
			n = 2;
			break;
		case 'D':
		case 'E':
		case 'F':
			n = 3;
			break;
		case 'G':
		case 'H':
		case 'I':
			n = 4;
			break;
		case 'J':
		case 'K':
		case 'L':
			n = 5;
			break;
		case 'M':
		case 'N':
		case 'O':
			n = 6;
			break;
		case 'P':
		case 'Q':
		case 'R':
		case 'S':
			n = 7;
			break;
		case 'T':
		case 'U':
		case 'V':
			n = 8;
			break;
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
			n = 9;
			break;
		}
	return n;
}
}
