package CountMatchesTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountMatchesTest {

	public static void main(String[] args) {
		
		CountMatches countMatches = new CountMatches();
		try {
			countMatches.readStrings();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Matched chars count : "+countMatches.getMatchCount());
		System.out.println("Matched chars  : "+countMatches.getMatchedChars());
		
	}

}

class CountMatches{
	String str1;
	String str2;
	String commonChars="";
	
	public void readStrings() throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String 1");
		str1 = reader.readLine();
		System.out.println("Enter String 2");
		str2 = reader.readLine();
		reader.close();
	}
	/*
	 * Iterating the String and checking whether the particular char present in the string2 using the contain method
	 * if it presents increasing the count and adding the char to commonChar because we need to print the common chars
	 * str1 = HelloWorld
	 *str2 = Hello
	 *output is 4 as H e l o is present 
	 *l and o are present twice but i am counting it once only
	 */
	public int getMatchCount(){
		int count=0;
		for(int i=0;i<str1.length();i++){
			if(str2.contains(str1.charAt(i)+"")){
				if(!commonChars.contains(""+str1.charAt(i))){ // remove this if condition if you want count duplicate count also
					count++;
					commonChars = commonChars +str1.charAt(i)+" ";
					
				}
			}
		}
		return count;
	}
	public String getMatchedChars(){
		return commonChars.trim();
	}
}
