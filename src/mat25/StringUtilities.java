package mat25;

import java.util.ArrayList;
import java.util.List;

public class StringUtilities {
	public static void main(String[] args) {
		capitalizeFirstLetters("hello world welcome");
		System.out.println();
		System.out.println(nameInitials("Bertrand Arthur William Russel"));
		System.out.println(letterCount("I am the very model of a modern major general", "m"));

		List<Integer> lst = new ArrayList<Integer>();
		for (int k = 1; k <= 6; k++)
		   lst.add(new Integer(k));
		for (int k = 0; k < 3; k++)
		{
		    Integer i = lst.remove(k);
		    lst.add(i);
		}
		for (Integer i : lst)
		    System.out.print(i);
	}

	private static void capitalizeFirstLetters(String aString) {
		// splitting the array and iterating in loop to make first letter to uppercase
		for (String s : aString.split(" ")) {
			System.out.print(s.substring(0, 1).toUpperCase() + s.substring(1) + " ");
		}
	}

	public static int letterCount(String str1,String str2){
		char c=str2.charAt(0);
		int count=0;
		// iterating through the string and counting the chars
		for(int i=0;i<str1.length();i++){
			if(str1.charAt(i)==c)
				count++;
		}
		return count;
	}
	// returns the initials of names
	public static String nameInitials(String str) {
		String res = "";
		String temp[] = str.split(" ");
		for (int i = 0; i < temp.length; i++) {
			if (i != temp.length - 1)
				res = res + temp[i].charAt(0) + ".";
			else
				res = res + temp[i].charAt(0);
		}
		return res;
	}

}
