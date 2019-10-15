package May19;

import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

public class Frequency {
	public HashMap<String, Integer> buildWordCounts(String paper){
		// map to store word and its count
		HashMap<String, Integer> words = new HashMap<String, Integer>();

		//splitting the string to words
		String arr[]=paper.split(" ");
		//iterating the array
		for (String key:arr) {
			//checking if word already in the map 
			//than just increase the count by 1
			// else just put the word with count 1
			if (words.containsKey(key)) {
				words.put(key, words.get(key) + 1);
			} else {
				words.put(key, 1);
			}
		}
		return words;
	}
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(new File("input.txt"));
		HashMap<String, Integer> words = new HashMap<String, Integer>();
		while (sc.hasNext()) {
			String key = sc.next();
			if (words.containsKey(key)) {
				words.put(key, words.get(key) + 1);
			} else {
				words.put(key, 1);
			}
		}
		for (String k : words.keySet()) {
			int val = words.get(k);
			System.out.println(k + " : " + val);
			HashMap<Character, Integer> chars = new HashMap<Character, Integer>();
			for (int i = 0; i < k.length(); i++) {
				char ch = k.charAt(i);
				if (chars.containsKey(ch)) {
					chars.put(ch, chars.get(ch) + 1);
				} else {
					chars.put(ch, 1);
				}
			}
			for (Character c : chars.keySet())
				System.out.println("\t"+c + " : " + chars.get(c));
		}
	}
}
