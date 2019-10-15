package May19;

public class SumOfString {
public static void main(String[] args) {
	System.out.println(sumDigits("CSE1310"));
	System.out.println(sumDigits("999999999999"));
	System.out.println(sumDigits("UTA"));
	
}

private static int sumDigits(String str) {
	int sum=0;
	
	//iterating the string  each char
	for(int i=0;i<str.length();i++){
		char c=str.charAt(i);
		//checking if the char is digit
		if(Character.isDigit(c)){
		// subtracting 48 to convert it into number
			sum+=c-48;
		}
	}
	return sum;
}
}
