package Mar27th;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileStats {
public static void main(String[] args) throws Exception {
	BufferedReader br = new BufferedReader(new FileReader(args[0]));
	int wordCount=0,lineCount=0,charCount=0;
	String line = br.readLine();
	while(line!=null){
		lineCount++;
		// splitting the array by white space we will get the words
		String arr[] = line.split("\\s");
		wordCount+=arr.length;
		charCount+=line.length();
		line = br.readLine();
	}
	System.out.println(charCount+" characters");
	System.out.println(wordCount+" words");
	System.out.println(lineCount+" lines");
	br.close();
	
}
}
