package May19;

import java.util.ArrayList;

public class Sentense {
	private ArrayList<String> words;

	public Sentense(String text) {
		// removing the punctuation mark
		text = text.substring(0, text.length() - 1);
		//splitting into words
		String arr[] = text.split(" ");
		words = new ArrayList<String>();
		//adding to array list
		for (String s : arr)
			words.add(s);
	}
	public String getWord(int i){
		if(words.size()>i)
			return words.get(i);
		return null;
	}
	public int getCount(){
		return words.size();
	}
	public static String check(String sent){
		Sentense aSentense = new Sentense(sent);
		return aSentense.getWord(aSentense.getCount()-1);
	}
}
