package Mar26th;

import java.io.BufferedReader;
import java.io.FileReader;

public class FilesManupulation {
	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new FileReader("test.txt"));
		String line = reader.readLine();
		int head = 0;
		int valid = 0; // invalid lines count
		int invalid = 0; // valid lines count
		int lineCount = 1; // line counter for display
		while (line != null) {
			// checking if line empty
			if (line.trim().length() == 0) {
				System.out.println("*** Error (line " + lineCount + "): Line is empty - average can't be taken");
				invalid++;
				line =  reader.readLine();
				lineCount++;

				continue;
			}
			String arr[] = line.split(" ");
				head = Integer.parseInt(arr[0]);
				// checking if header is negative 
			if(head<0) {
				System.out.println("*** Error (line " + lineCount + "): Corrupt line - negative header value");
				invalid++;
				line =  reader.readLine();
				lineCount++;

				continue;
			}
			// checking if header is 0
			if (head == 0) {
				System.out.println("*** Error (line " + lineCount + "): Header value of 0 - average can't be take");
				invalid++;
				line =  reader.readLine();
				lineCount++;

				continue;
			}
			// checking for values count with header
			if (arr.length - 1 < head) {
				System.out.println("*** Error (line " + lineCount + "): Corrupt line - fewer values than header");
				invalid++;
				line =  reader.readLine();
				lineCount++;

				continue;
			}
			// checking for values count with header
			if (arr.length - 1 > head) {
				System.out.println("*** Error (line " + lineCount + "): Corrupt line - extra values than header");
				invalid++;
				line =  reader.readLine();
				lineCount++;
				
				continue;
			}
			// if everything is than calculation the average
			line =  reader.readLine();
			double sum = 0;
			for (int i = 1; i < arr.length; i++) {
				sum += Integer.parseInt(arr[i]);
			}
			System.out.println("The average of the values on line " + lineCount + " is " + (sum / (arr.length - 1)));

			lineCount++;
			valid++;
			
		}
		System.out.println("There were "+valid+" valid lines of data");
		System.out.println("There were "+invalid+" corrupt  lines of data");
		reader.close();

	}
}
