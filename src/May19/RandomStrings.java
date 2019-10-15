package May19;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class RandomStrings {
	public static void main(String[] args) throws Exception {
		// opening file to read
		// opening file to write
		PrintWriter pw = new PrintWriter(new File("randomString100.txt"));

		// looping through the file
		for (int i = 0; i < 100; i++) {
			pw.println(getRandomString());
		}
		pw.flush();
		pw.close();
		ArrayList<String> list = new ArrayList<String>();
		BufferedReader br = new BufferedReader(new FileReader("randomString100.txt"));
		String line = br.readLine();
		while (line != null) {
			list.add(line);
			line = br.readLine();
		}
		Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				int dist1 = Math.abs(s1.length());
				int dist2 = Math.abs(s2.length());
				return dist1 - dist2;
			}
		});
		br.close();
		for (String s : list)
			System.out.println(s);

	}

	private static String getRandomString() {
		Random r = new Random();
		int size = r.nextInt(7) + 3;
		String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		StringBuilder builder = new StringBuilder();
		while (size-- != 0) {
			int character = (int) (Math.random() * ALPHA_NUMERIC_STRING.length());
			builder.append(ALPHA_NUMERIC_STRING.charAt(character));
		}
		return builder.toString();
	}
}
