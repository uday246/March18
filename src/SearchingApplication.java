import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SearchingApplication {
	final static String path = "C:\\PersonalDocs";
	static List<String> normalWords = new ArrayList<String>();

	public static void main(String[] args) {
		buidlNormalWordsList();
		Scanner sc = new Scanner(System.in);
		String question = sc.nextLine();
		question = question.toUpperCase();
		File folder = new File(path);
		SearchingApplication listFiles = new SearchingApplication();
		listFiles.listAllFiles(folder, question);
		sc.close();
	}
	private static void buidlNormalWordsList() {
		normalWords.add("THE");
		normalWords.add("IT");
		normalWords.add("WAS");
		normalWords.add("WERE");
		normalWords.add("THEY");
		normalWords.add("ARE");
		normalWords.add("A");
		normalWords.add("AN");
		normalWords.add("FOR");
		normalWords.add("IS");
		normalWords.add("OF");
		normalWords.add("IN");
		normalWords.add("THAT");

	}

	// Uses listFiles method
	public void listAllFiles(File folder, String aQuestion) {
		File[] fileNames = folder.listFiles();
		for (File file : fileNames) {
			// if directory call the same method again
			if (file.isDirectory()) {
				listAllFiles(file, aQuestion);
			} else {
				try {
					String extension = "";

					int i = file.getName().lastIndexOf('.');
					if (i > 0) {
						extension = file.getName().substring(i + 1);
					}
					if (extension.equalsIgnoreCase("c") || extension.equalsIgnoreCase("cpp")
							|| extension.equalsIgnoreCase("java") || extension.equalsIgnoreCase("txt"))
						readContent(file, aQuestion);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}
	}

	public void readContent(File file, String aQuestion) throws IOException {
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String strLine = "";
			// Read lines from the file, returns null when end of stream
			// is reached
			String text = "";
			boolean comment = false;
			while ((strLine = br.readLine()) != null) {
				if (strLine.trim().startsWith("/*")) {
					comment = true;
				}
				if (comment)
					text = text +strLine;

				if (strLine.trim().endsWith("*/")) {
					comment = false;
					break;
				}
			}
			if (text.trim().length()>0 && checkPattern(text,aQuestion,file) > 50)
				System.out.println(file.getAbsolutePath());
		}
	}

	public static double checkPattern(String inPc, String web, File aFile) {
		inPc = inPc.replace("/*", "");
		inPc = inPc.replace("*/", "");
		String words[] = inPc.toUpperCase().split(" ");
		List<String>wordsList = new ArrayList<String>(Arrays.asList(words));
		String webWords[] = web.toUpperCase().split(" ");
		List<String>webWordsList = new ArrayList<String>(Arrays.asList(webWords));
		wordsList.removeAll(normalWords);
		webWordsList.removeAll(normalWords);
		double totalWords = webWordsList.size();
		double count = 0;
		for (String str : webWordsList) {
			if (str.trim().length() == 0 || str.trim().equals(",") || str.trim().equals(".") || str.trim().equals(";")
					|| str.trim().equals("\n"))
				continue;
			if (str.trim().length() == 0 || str.trim().equals(",") || str.trim().equals(".") || str.trim().equals(";")
					|| str.trim().equals("\n"))
				continue;
			for (String s : wordsList) {
				if (s.equals(str)) {
					System.out.println(str+" ");
					count++;
				}
			}

		}
		double percentage = count / totalWords * 100;
		return percentage;
	}

}
