package mat25;

import java.util.ArrayList;

public class TestArr {
	public static void main(String[] args) {
		ArrayList<String> sam = new ArrayList<String>();
		
		
		int arr[]={1, 3, 5,4, 3, 6, 5};
		int small=0;
		int x=3;
		for(int i=0;i<arr.length;i++)
			if(arr[i]>x){
				if(small<x || arr[i]<small)
				small=arr[i];
			}
		
		
		System.out.println(small);
		/*sam.add("ben");
		sam.add(0, "wil");
		sam.set(1, "cat");
		sam.add(1, "dog");
		sam.add("pig");
		sam.remove(2);
		System.out.println("Line 1");
		System.out.println(sam.get(0));
		System.out.println("Line 2");
		System.out.println(sam.get(2));
		System.out.println("Line 3");
		System.out.println(sam.set(1, "up"));
		System.out.println("Line 4");
		System.out.println(sam.indexOf("ben"));
		System.out.println("Line 5");
		System.out.println(sam.contains("sam"));
		System.out.println("Line 6");
		System.out.println(sam);
		sam.remove(1);
		System.out.println("Line 7");
		System.out.println(sam);
		sam.add("one");
		System.out.println("Line 8");
		System.out.println(sam);
		sam.add(0, "five");

		System.out.println("Line 9");
		System.out.println(sam);
		sam.remove(1);
		System.out.println("Line 10");
		System.out.println(sam);

		sam.add(0, "chair");
		System.out.println("Line 11");
		System.out.println(sam);
		System.out.println("Line 12");
		for (int i = 0; i < sam.size(); i++)
			System.out.print(sam.get(i) + " ");
		System.out.println();
		sam.remove(sam.size() - 1);
		System.out.println("Line 13");
		System.out.println(sam);
		for (int i = 0; i < 4; i += 2)
			sam.add(i, "fun");
		System.out.println("Line 14");
		System.out.println(sam);
*/
	}
	   public static boolean isOnlyNumbers(String s) {
		   // looping throgh the string
		   	for(int i=0;i<s.length();i++)
		   		// if it is not a digit than return false
		   		if(!Character.isDigit(s.charAt(i)))
		   			return false;
		   		
		   		return true;
	   }
}
