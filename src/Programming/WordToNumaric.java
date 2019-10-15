package Programming;

public class WordToNumaric {
public static void main(String[] args) {
	String str="How are you";
	for(int i=0;i<str.length();i++){
		if(str.charAt(i)==' ')
			System.out.print(" ");
		else
			System.out.println((int)str.charAt(i));
	}
}
}
