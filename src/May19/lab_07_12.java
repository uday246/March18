package May19;

import java.io.FileWriter;
import java.io.PrintWriter;

public class lab_07_12 {
	public static void main(String[] args) throws Exception {
		int[] firstArray = { 10, 20, 30, 40, 50 };
		PrintWriter outputFile = new PrintWriter(new FileWriter("output.txt"));
		for (int x : firstArray)
			outputFile.println(x);
		outputFile.close();

	}
}
