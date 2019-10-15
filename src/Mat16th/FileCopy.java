package Mat16th;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;

public class FileCopy {
	public static void main(String[] args) throws Exception {
		// opening file to read
		BufferedReader br = new BufferedReader(new FileReader("input.txt"));
		// opening file to write
		PrintWriter pw = new PrintWriter(new File("output.txt"));

		String line = br.readLine();
		//looping through the file
		while(line!=null){
			//writing line
			pw.println(line);
			//reads next line
			line = br.readLine();
		}
		System.out.println("Successfully copied ");
		pw.flush();
		pw.close();
		br.close();
	}
}
