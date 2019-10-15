import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// UnComment the lines if horizontal dotted lines required
public class StringFormatEx {
public static void main(String[] args) {
	String str = "";
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	while(true){
		System.out.println("Please enter a word or q to quit");
		try {
			str = reader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(str.equalsIgnoreCase("q")){
			break;
		}
		else{
			displayFormat(str);
		}
	}
	
}
public static void displayFormat(String str){
	int index=1;
	int length = -1*str.length();
	
	String format = "| %"+length+"s ";
	int words = str.length();
	printHorizontalLine(words, str.length());
	System.out.println();
	for(int i=0;i<str.length();i++){
		
		for(int j=0;j<str.length();j++){
			if(index+j<=str.length())
				System.out.printf(format,str.substring(j,j+index));	
			
			
		}
		System.out.println("|");
		words--;
		printHorizontalLine(words, str.length());
		index++;
	System.out.println();
		
	}
	printHorizontalLine(1, str.length());
	System.out.println();
	
}
public static void printHorizontalLine(int words,int length){
	for(int i=0;i<(words*(length+3));i++){
		System.out.print("-");
	}
	
}
}
