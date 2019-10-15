import java.util.Scanner;

public class FormString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String ");
		//reading line from user
		String line = sc.nextLine();
		//splitting line into words
		String arr[] = line.split(" ");
		String res = "";
		//iterating through words
		for (String s : arr) {
			//fetching 1st char from each word and adding to result
			res += s.charAt(0);
		}
		System.out.println(res);
	}
}