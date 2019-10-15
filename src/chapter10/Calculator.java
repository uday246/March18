package chapter10;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Calculator {
	static PrintWriter pw = null;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		char ch = ' ';
		try {
			pw = new PrintWriter(new FileWriter("sample.txt"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		boolean flag = false;
		while (true) {
			System.out.println("+ Addition");
			System.out.println("- Subtraction");
			System.out.println("* Mutliplication");
			System.out.println("/ Division");
			System.out.println("A Average");
			System.out.println("X Maximum");
			System.out.println("M Minimum");
			System.out.println("S Square");
			System.out.println("Q Quit");

			ch = sc.next().charAt(0);
			switch (ch) {
			case '+':
				addition();
				break;
			case '-':
				subtraction();
				break;
			case '*':
				multiplication();
				break;
			case '/':
				division();
				break;
			case 'A':
				Average();
				break;
			case 'X':
				maximum();
				break;
			case 'M':
				minium();
				break;
			case 'S':
				square();
				break;
			case 'Q':
				flag = true;
				break;

			}
			if (flag)
				break;

			sc.close();
			pw.close();
		}
	}

	// this method will write the data output data into file
	public static void writeIntoFile(String msg) {
		pw.println(msg);
		pw.flush();
	}

	// finds the square of the given number
	private static void square() {
		System.out.println("Enter a number ");
		int num = sc.nextInt();
		String msg = "Operation : Square , Number : " + num + " , Square : " + (num * num);
		writeIntoFile(msg);
	}

	// finds the min of given 2 numbers
	private static void minium() {
		System.out.println("Enter a number1");
		int num1 = sc.nextInt();
		System.out.println("Enter a number2");

		int num2 = sc.nextInt();
		int output = (num1 < num2) ? num1 : num2;
		String msg = "Operation : Minimum, Number1 : " + num1 + " , Number2 : " + num2 + ", Minimum Num : " + output;
		writeIntoFile(msg);

	}

	// finds the max of given 2 numbers
	private static void maximum() {
		System.out.println("Enter a number1");
		int num1 = sc.nextInt();
		System.out.println("Enter a number2");

		int num2 = sc.nextInt();
		int output = (num1 > num2) ? num1 : num2;
		String msg = "Operation : Maximum, Number1 : " + num1 + " , Number2 : " + num2 + ", Maximum Num : " + output;
		writeIntoFile(msg);
	}

	// finds the average given 2 numbers
	private static void Average() {
		System.out.println("Enter a number1");
		int num1 = sc.nextInt();
		System.out.println("Enter a number2");

		int num2 = sc.nextInt();
		double output = (num1 + num2) / 2.0;
		String msg = "Operation : Average, Number1 : " + num1 + " , Number2 : " + num2 + ", Average: " + output;
		writeIntoFile(msg);

	}

	// finds the division of given 2 numbers
	private static void division() {

		System.out.println("Enter a number1");
		int num1 = sc.nextInt();
		System.out.println("Enter a number2");

		int num2 = sc.nextInt();
		double output = (num1 / num2);
		String msg = "Operation : Division, Number1 : " + num1 + " , Number2 : " + num2 + ", output: " + output;
		writeIntoFile(msg);
	}

	// finds the product of given 2 numbers
	private static void multiplication() {
		System.out.println("Enter a number1");
		int num1 = sc.nextInt();
		System.out.println("Enter a number2");

		int num2 = sc.nextInt();
		double output = (num1 * num2);
		String msg = "Operation : Multiplication, Number1 : " + num1 + " , Number2 : " + num2 + ", Product: " + output;
		writeIntoFile(msg);
	}

	// subtracts the given 2 numbers
	private static void subtraction() {
		System.out.println("Enter a number1");
		int num1 = sc.nextInt();
		System.out.println("Enter a number2");

		int num2 = sc.nextInt();
		double output = (num1 - num2);
		String msg = "Operation : Subtraction, Number1 : " + num1 + " , Number2 : " + num2 + ", Result: " + output;
		writeIntoFile(msg);
	}

	// add 2 numbers
	private static void addition() {
		System.out.println("Enter a number1");
		int num1 = sc.nextInt();
		System.out.println("Enter a number2");

		int num2 = sc.nextInt();
		double output = (num1 + num2);
		String msg = "Operation : Addition, Number1 : " + num1 + " , Number2 : " + num2 + ", Sum: " + output;
		writeIntoFile(msg);
	}
}
