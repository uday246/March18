package Mar15th;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class RandomNumber {
public static void main(String[] args) throws FileNotFoundException {
	
	File file = new File("test.txt");
	PrintWriter pw = new PrintWriter(file);
	int count=1;
	Random random = new Random(152);
	for(int i=0;i<1000;i++){
		int num = random.nextInt((1000 - 1) + 1);
		pw.print(num);
		if(count%5==0){
			pw.println("#");
		}
		else
		{
			pw.print("&");
		}
		count++;
	}
	pw.flush();
	pw.close();
}
}
