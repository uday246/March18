package May19;
class Calvin{
	/**
	 * @param str
	 * @return
	 */
	public  String rot13(String str) {
		String res = "";
		str = str.toUpperCase();
		String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				int index = str.charAt(i) - 65;
				index = index + 13;
				index = index % 26;
				res = res + s.charAt(index);
			} else {
				res =res+ str.charAt(i);
			}
		}
		return res;
	}
}
public class Main {
	public static void main(String[] args) {
		Calvin c = new Calvin();
		System.out.println(c.rot13("abcxyz"));
		System.out.println(c.rot13("The quick brown fox"));
		System.out.println(c.rot13("Two is 2!"));
		
	}

	
}
