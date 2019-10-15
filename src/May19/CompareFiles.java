package May19;

import java.io.BufferedReader;
import java.io.FileReader;

public class CompareFiles {
	public static void main(String[] args) throws Exception {
		// opening file to read
		BufferedReader br1 = new BufferedReader(new FileReader("input.txt"));
		// opening file to read
		BufferedReader br2 = new BufferedReader(new FileReader("input.txt"));

		String line1 = br1.readLine();
		String line2 = br1.readLine();
		boolean flag = true;
		// looping through the file
		while (line1 != null && line2 != null) {
			line1 = br1.readLine();
			line2 = br2.readLine();
			if (!line1.equals(line2)) {
				flag = false;
				break;
			}
			line1=br1.readLine();
			line2=br2.readLine();
		}
		if (flag) {
			System.out.println("Content of the 2 files are same");
		} else {
			System.out.println("Content of the 2 files are not same");
		}
		br1.close();
		br2.close();

	}
}
