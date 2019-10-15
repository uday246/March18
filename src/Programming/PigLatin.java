package Programming;

import java.util.Scanner;
public class PigLatin
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your word.");
        String word = sc.nextLine();
        while(!word.equals("done")){
            String str=word;
            int i=0;
            for(i=0;i<word.length();i++){
            	if(isVowel(word.charAt(i))){
            		// if it is the vowel than breaking the String from the vowel and appending that part to the end of the string
            		// example paris here we found a at index 1 so we will break the string as a + aris so it will be like arispa
            		// at end we will apend ay
            		str=word.substring(i)+word.substring(0, i);
            		break;
            	}
            }
            str=str+"ay";
            System.out.println("PigLatin word : "+str);
            word = sc.nextLine();
        }
        sc.close();
    }

    // checks given char is vowel or not
	private static boolean isVowel(char aCharAt) {

		return "aeiouAEIOU".contains(aCharAt+"");
	}
}