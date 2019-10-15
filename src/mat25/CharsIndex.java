package mat25;

import java.util.Scanner;

public class CharsIndex {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter String");
	String str=sc.nextLine();
	
	String[] xy = {"X", "Y"};
	String[] yx = xy;
	yx[0] = xy[1];
	yx[1] = xy[0];
	System.out.println(xy[0] + xy[1] + yx[0] + yx[1]);
	
	// iterating thorugh a-z to find the indexes using the indexOf method
	/*for(char c='a';c<='z';c++){
		System.out.println(c+" = "+str.indexOf(c));
	}*/
}
}
