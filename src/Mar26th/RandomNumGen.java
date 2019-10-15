package Mar26th;

import java.util.*;
import java.io.*;

public class RandomNumGen {
	static final int SEED = 152;

	public static void fileStore(String file, int number) {
		if (file == null || number <= 0) {
			throw new IllegalArgumentException("Error");
		}

		String line = "%s&%s&%s&%s&%s#\n";
		BufferedWriter buffWriter = null;
		Random rand = new Random(SEED);

		try {
			buffWriter = new BufferedWriter(new FileWriter(file));

			int x = number / 5;
			int j = number - x * 5;
			for (int i = 0; i < x; i++) {
				int number1 = rand.nextInt(1000 - 1 + 1) + 1;
				int number2 = rand.nextInt(1000 - 1 + 1) + 1;
				int number3 = rand.nextInt(1000 - 1 + 1) + 1;
				int number4 = rand.nextInt(1000 - 1 + 1) + 1;
				int number5 = rand.nextInt(1000 - 1 + 1) + 1;
				String str = String.format(line, number1, number2, number3, number4, number5);

				buffWriter.write(str);
				System.out.println(str);

			}

			StringBuilder str = new StringBuilder();
			for (int i = 0; i < j; i++) {
				str.append(rand.nextInt(1000 - 1 + 1) + 1);
				str.append("&");

			}

			if (j > 0) {
				str.deleteCharAt(str.length() - 1);
				str.append("#");
				String lineStr = str.toString();
				buffWriter.write(lineStr);

				System.out.print(lineStr);
			}
			buffWriter.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		fileStore("ouput.txt", 15);
	}
}
