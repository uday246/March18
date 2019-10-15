package Programming;

import java.util.ArrayList;
import java.util.Iterator;
//import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class IteratorString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// creating list
		List<String>list = new ArrayList<String>();
		// uncomment to use linked list
		//LinkedList<String>list = new LinkedList<String>();
		System.out.println("Enter Strings");
		for(int i=0;i<5;i++){
			list.add(sc.nextLine());
		}
		System.out.println("Entered Data : ");
		// getting iterator
		Iterator<String>itr = list.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		sc.close();
	}
}
