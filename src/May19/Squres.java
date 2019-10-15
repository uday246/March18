package May19;

public class Squres {
public static void main(String[] args) {
	String s="BARBARA";
	test(s);
	System.out.println(s);
}

private static String test(String str) {
	if(str.length()>=2){
		int n=str.length()/2;
		str=test(str.substring(n))+test(str.substring(0,n));
	}
	return str;
}
}
