package Mat16th;

import java.io.*;

public class ReadLines

{

	public static void ReadLines(File f) throws IOException

	{

		PrintStream out = new PrintStream(new FileOutputStream("opt.txt"));

		System.setOut(out);

		FileReader fr = new FileReader(f);

		BufferedReader br = new BufferedReader(fr);

		String line;

		while ((line = br.readLine()) != null)

		{

			System.out.println(line);

		}

		br.close();

		fr.close();

	}

	public static void main(String[] args)

	{

		File f = new File("calories.txt");

		try

		{

			ReadLines(f);

		}

		catch (IOException e)

		{

			e.printStackTrace();

		}

	}

}