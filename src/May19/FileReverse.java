package May19;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class FileReverse {
	public static void main(String[] args) throws Exception {
		// opening file to read
		BufferedReader br = new BufferedReader(new FileReader("cities.txt"));
		// opening file to write

		String line = br.readLine();
		// looping through the file
		ArrayList<String> list = new ArrayList<String>();
		while (line != null) {
			String arr[] = line.split(" ");
			for (String s : arr)
				list.add(s);
			line = br.readLine();
		}
		PrintWriter pw = new PrintWriter(new File("output.txt"));
		for (int i = list.size() - 1; i >= 0; i--)
			pw.println(list.get(i));
		
		System.out.println("Successfully reversed ");
		pw.flush();
		pw.close();
		br.close();
	}
}
