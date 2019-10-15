public class StringWords {

	public static void main(String[] args) {
		String str = "Mary had a      little     lamp";
		int c = countWords(str);
		System.out.println("Words : "+c);
	}

	private static int countWords(String aStr) {
		// splitting the string by space
		String temp[]=aStr.split(" ");
		int c=0;
		// iterating the array,count if string length >0
		for(String s:temp){
			if(s.length()>0)
				c++;
		}
		return c;
	}
}