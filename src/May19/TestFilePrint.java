package May19;

import java.io.BufferedReader;
import java.io.FileReader;

class FilePrint {
	private String fileName;

	public FilePrint(String aFileName) {
		super();
		fileName = aFileName;
	}

	public void displayHead() throws Exception {
		BufferedReader br = null;
		br = new BufferedReader(new FileReader(fileName));
		int no = 1;
		String line = br.readLine();
		while (line != null && no <= 5) {
			System.out.println(line);
			line = br.readLine();
			no++;
		}
		br.close();
	}

	public void displayContents() throws Exception {
		BufferedReader br = null;
		br = new BufferedReader(new FileReader(fileName));
		String line = br.readLine();
		while (line != null) {
			System.out.println(line);
			line = br.readLine();
		}
		br.close();
	}

	public void displayWithLineNumbers() throws Exception {
		BufferedReader br = null;
		br = new BufferedReader(new FileReader(fileName));
		String line = br.readLine();
		int n = 1;
		while (line != null) {
			System.out.println(n + " " + line);
			line = br.readLine();
			n++;
		}
		br.close();
	}
}

public class TestFilePrint {
	public static void main(String[] args) throws Exception{
		FilePrint fp = new FilePrint("input.txt");
		fp.displayContents();
		System.out.println();
		System.out.println();
		fp.displayWithLineNumbers();
	}
}
