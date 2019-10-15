package May19;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class guessCharacter

{

	String S;
	static String A;
	int check;
	private static Scanner scanner = new Scanner(System.in);

	public void printintro(){
		check = 0;

		System.out.println("This game prompts for a string of words. It then allows to player to");

		System.out.println("guess the characters in the string of words. It keeps track of characters ");

		System.out.println("guessed and tells the player when he wins");

	}

	public void readstring(){

		System.out.println("Please Enter a string of words");

		S = scanner.nextLine();

	}

	public int checkword()

	{
		char x;

		for (int i = 0; i < S.length(); i++)

		{

			x = S.charAt(i);

			if (!(Character.isLetter(x) || Character.isWhitespace(x)))

			{

				System.out.println("You have entered some other charchter other than alphabet and space;");

				return 0;

			}

		}

		return 1;

	}

	public void createString()

	{

		char[] c = new char[S.length()];

		Arrays.fill(c, '?');

		A = new String(c);

	}

	public void printstr()

	{

		System.out.println("Original string : " + S);

		System.out.println("Guessed string : " + A);

	}

	public int sreplace(char c)

	{

		for (int i = 0; i < S.length(); i++)

		{

			if (S.charAt(i) == c)

			{

				StringBuilder stringA = new StringBuilder(A);

				stringA.setCharAt(i, c);

				A = stringA.toString();

				check++;

			}

		}
		;

		if (check == S.length())

			return 1;

		else
			return 0;

	}

	public static void main(String[] args) throws IOException

	{

		char ch;

		int done = 0;

		guessCharacter my = new guessCharacter();

		my.printintro();

		my.readstring();

		int check = my.checkword();

		if (check == 0) {

			System.exit(0);

		}

		my.createString();

		do

		{

			my.printstr();

			InputStreamReader cin = null;

			try {

				cin = new InputStreamReader(System.in);

				System.out.println("Please Guess Character");

				ch = (char) cin.read();

				if (!(Character.isLetter(ch) || Character.isWhitespace(ch)))

				{

					System.out.println("You have entered some other character other than alphabet and space;");

				}

				else {

					done = my.sreplace(ch);

				}

			} catch (Exception E) {
				E.printStackTrace();

			}

		} while (done != 1);

		System.out.println("Guessed string : " + A);

		System.out.println("Characters matched");

	}

}