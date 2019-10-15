package May19;

import java.util.InputMismatchException;
import java.util.Scanner;

import java.io.File;
import java.io.FileNotFoundException;

public class Exception2 {

	public static void main(String[] args) {

		int total = 0;

		int num = 0;

		File myFile = null;

		Scanner inputFile = null;

		myFile = new File("inFile.txt");

		try {
			inputFile = new Scanner(myFile);

			while (inputFile.hasNext()) {
				num = inputFile.nextInt();
				total += num;

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("The total value is " + total);

	}

}