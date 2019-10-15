package Mat16th;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
class Converter{
	StringBuilder str = new StringBuilder();
	String res = new String();
	public Converter(StringBuilder s){
		str = s;
		doConvert();
	}
	private void doConvert() {
		
	}
}
public class FileConversions {
public static void main(String[] args) throws Exception {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Input filename");
	String line = sc.nextLine();
	
	FileReader fr=new FileReader(line);    
    BufferedReader br=new BufferedReader(fr);	
    line = br.readLine();
    while(line!=null){
    	
    }
}

}
