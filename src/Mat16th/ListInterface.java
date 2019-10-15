package Mat16th;

import java.util.ArrayList;
import java.util.List;

public class ListInterface {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Sun");
		list.add("test");
		list.add("morning");
		list.add("java");
		list.add("cpp");
		list.add("fun");
		list.add("CSS");
		list = createShortWordList(list, 3);
		System.out.println(list);
	}
// method creates newlist with short with given sizes
	public static List<String> createShortWordList(List<String> wordList, int size) {
		List<String> newWords = new ArrayList<String>();
		// create new list and add the string with less size than given
		for (String str : wordList) {
			if (str.length() <= size)
				newWords.add(str);
		}
		return newWords;
	}
}
