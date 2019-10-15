package Mar15th;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadRadomNumber {
public static void main(String[] args) {
	Scanner sc = null;
	try {
		sc = new Scanner(new File("test.txt"));
	} catch (FileNotFoundException e) {
	}
	sc.useDelimiter("&,#");
	while(sc.hasNextLine()){
		System.out.print(sc.nextInt()+" ");
	}
	
}
}
