package Programming;

import java.util.ArrayList;

public class SpeechReader {

	public static void main(String[] argv) throws Exception {
		ArrayList<Integer>myList=new ArrayList<Integer>();
		int temp=1;
		for(int i=0;i<10;i++){
			myList.add(temp);
			temp=temp^i;
		}
		myList.remove(0);
		myList.remove(2);
		System.out.println(myList);
		/*
		BufferedReader in = new BufferedReader(new FileReader("tjefferson.txt"));

		String line = in.readLine();

		int wordcounter = 0;
		int totalchar = 0;
		int avglength = 0;

		while(line != null){
			wordcounter+=line.split(" ").length;
			totalchar+=line.length();
			line = in.readLine();
		}
		avglength = totalchar/wordcounter;
		System.out.println("Total Words : "+wordcounter);
		System.out.println("Total Chars : "+totalchar);
		System.out.println("Average Length : "+avglength);*/
	}


}

