import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
public static void main(String[] args) {
	HashSet<String>set = new HashSet<String>();
	// storing the strings in hashset
	set.add("Hello");
	set.add("Hi");
	set.add("How are you");
	set.add("I like this");
	set.add("Life is good");
	set.add("Class is good");
	// getting the iterator
	Iterator<String> itr = set.iterator();
	// looping
	while(itr.hasNext()){
		String temp = itr.next();
		// checking if string starts with H
		if(temp.startsWith("H"))
			System.out.println(temp);
	}
}
}
