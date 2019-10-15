package May19;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Assignment5 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter filename: ");
		String fn = sc.nextLine();
		File myFile = new File(fn);
		if (!myFile.exists()) {
			System.out.println("File not found");
			return;
		}

		Scanner inputFile = new Scanner(myFile);
		PrintWriter outputFile = new PrintWriter("UPPERCASE.txt");

		while (inputFile.hasNext()) {

			outputFile.println(inputFile.nextLine().toUpperCase());
		}
		System.out.println("Successfully Converted....");
		inputFile.close();
		outputFile.close();
	}
}