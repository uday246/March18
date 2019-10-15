package Mar15th;

import java.util.HashMap;
/*
 * Here I am using  2 maps for mapping the letter with  other random letter and similarly another map for decode purpose to store reversely
 *  
 * 
 * 
 */
public class RandomCipher {
	static HashMap<String,String>encodeMap =  new HashMap<String,String>();
	static HashMap<String,String>decodeMap =  new HashMap<String,String>();
	
public static void main(String[] args) {
	
	encodeMap.put("a", "y");
	decodeMap.put("y", "a");
	
	encodeMap.put("b", "g");
	decodeMap.put("g", "b");
	
	encodeMap.put("c", "f");
	decodeMap.put("f", "c");
	
	encodeMap.put("d", "w");
	decodeMap.put("w", "d");
	
	
	
	encodeMap.put("e", "h");
	decodeMap.put("h", "e");
	
	encodeMap.put("f", "x");
	decodeMap.put("x", "f");
	
	encodeMap.put("g", "e");
	decodeMap.put("e", "g");
	
	encodeMap.put("h", "v");
	decodeMap.put("v", "h");
	
	encodeMap.put("i", "c");
	decodeMap.put("c", "i");
	
	encodeMap.put("j", "u");
	decodeMap.put("u", "j");
	
	encodeMap.put("k", "t");
	decodeMap.put("t", "k");
	
	encodeMap.put("l", "d");
	decodeMap.put("d", "l");
	
	encodeMap.put("m", "s");
	decodeMap.put("s", "m");
	
	encodeMap.put("n", "r");
	decodeMap.put("r", "n");
	
	encodeMap.put("o", "b");
	decodeMap.put("b", "o");
	
	encodeMap.put("p", "z");
	decodeMap.put("z", "p");
	
	encodeMap.put("q", "l");
	decodeMap.put("l", "q");
	
	encodeMap.put("r", "m");
	decodeMap.put("m", "r");
	
	encodeMap.put("s", "a");
	decodeMap.put("a", "s");
	
	encodeMap.put("t", "k");
	decodeMap.put("k", "t");
	
	encodeMap.put("u", "o");
	decodeMap.put("o", "u");
	
	encodeMap.put("v", "n");
	decodeMap.put("n", "v");
	
	encodeMap.put("w", "j");
	decodeMap.put("j", "w");
	
	encodeMap.put("x", "p");
	decodeMap.put("p", "x");
	
	encodeMap.put("y", "q");
	decodeMap.put("q", "y");
	
	encodeMap.put("z", "i");
	decodeMap.put("i", "z");
	
String input = "Hello World..";
String encodedString  =  encode(input);
System.out.println("Encoded : "+encodedString);
String decoded  =  decode(encodedString);
System.out.println("Decoded : "+decoded);
	
}

private static String encode(String aInput) {
	aInput = aInput.toLowerCase();
	String res="";
	for(int i=0;i<aInput.length();i++){
		if(Character.isAlphabetic(aInput.charAt(i))){ // If it character than only we should encode so I am checking with help of Character class method isAlphabetic()
			res+=encodeMap.get(aInput.charAt(i)+"");
		}
		else{
			res+=aInput.charAt(i);
		}
	}
	return res;
}
private static String decode(String aInput) {
	aInput = aInput.toLowerCase();
	String res="";
	for(int i=0;i<aInput.length();i++){
		if(Character.isAlphabetic(aInput.charAt(i))){ 
			res+=decodeMap.get(aInput.charAt(i)+"");
		}
		else{
			res+=aInput.charAt(i);
		}
	}
	return res;
}
}
