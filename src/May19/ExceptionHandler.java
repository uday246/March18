package May19;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandler {
	public static void main(String[] args) {
		// Declarations.
		Scanner keyboard = new Scanner(System.in);
		int numerator;
		int denominator;
		int quotient;
		String ch = "y";
		while (ch.equalsIgnoreCase("y")) {
			try {
				// Get input from user and perform integer divsion.
				System.out.print("\nPlease enter a positive value for the numerator: ");
				numerator = keyboard.nextInt();
				if (numerator < 0)
					throw new NegativeValueException(numerator + "numerator can't be negative value");
				System.out.print("\nPlease enter a positive value for the denominator: ");
				denominator = keyboard.nextInt();
				if (denominator < 0)
					throw new NegativeValueException(numerator + "numerator can't be negative value");
				quotient = numerator / denominator;
				System.out.println();
				System.out.print("The result of integer division is: ");
				System.out.println(quotient);
				System.out.println();
				System.out.println("Do you want to continue [Y/N]?");
				keyboard.nextLine();
				ch = keyboard.nextLine();
			} catch (NegativeValueException e) {
				e.printStackTrace();
			} catch (InputMismatchException e) {
				e.printStackTrace();
			} catch (ArithmeticException e) {
				e.printStackTrace();
			}
		}
	}
}

class NegativeValueException extends RuntimeException {

	public NegativeValueException(String aMsg) {
		super(aMsg);
	}
}