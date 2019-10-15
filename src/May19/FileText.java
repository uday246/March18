package May19;

import java.util.ArrayList;
public class FileText
{

    private String fileName;
    private int fileBytes;
    private ArrayList<String> wordList; // the contents of the text file

    // constructors not shown

    // postcondition: calculates the number of bytes in this file and updates
    // the instance variable fileBytes
    public void fileSize()
    {
    	//iterating each and getting the length
    	for(String s:wordList){
    		fileBytes+=s.length();
    	}
    	//adding spaces
    	fileBytes+=wordList.size()-1;
    }

    // precondition: 0 < newWords.length < wordList.size ()
    // postcondition: elements from the newWords array are placed into consecutive
    // even index positions, including 0, of the wordlist ArrayList
    // postcondition: the value of fileBytes is updated
    public void mergeWords(String[] newWords)
    {
    	int i=0;
    	//iterating the array and adding to the list at every even position
    	for(String s:newWords){
    		wordList.add(i,s);
    		i+=2;
    	}
    }

    // other methods not shown

}