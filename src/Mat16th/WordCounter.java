package Mat16th;

import java.util.Scanner;
import java.io.*;

public class WordCounter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int wordCount = 0, lineCount = 0;
		String fileName = args[1];
		String cmd = args[0];
		System.out.println("File : " + fileName);
		File myFile = new File(fileName);
		Scanner fileScanner = new Scanner(myFile);
		String s = new String();
		while (fileScanner.hasNextLine()) {
			lineCount++;
			String[] words = s.split(" ");
			wordCount = wordCount + words.length;
			s = fileScanner.nextLine();
		}
		if (cmd.equalsIgnoreCase("-w"))
			System.out.println("Number of words in the File : " + wordCount);
		if (cmd.equalsIgnoreCase("-l"))
			System.out.println("Number of lines in the File : " + lineCount);

		fileScanner.close();
	}

}