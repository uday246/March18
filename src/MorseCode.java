import java.util.HashMap;

public class MorseCode {
	static String morseEncode(char x) {

		switch (x) {
		case 'a':
			return ".-";
		case 'b':
			return "-...";
		case 'c':
			return "-.-.";
		case 'd':
			return "-..";
		case 'e':
			return ".";
		case 'f':
			return "..-.";
		case 'g':
			return "--.";
		case 'h':
			return "....";
		case 'i':
			return "..";
		case 'j':
			return ".---";
		case 'k':
			return "-.-";
		case 'l':
			return ".-..";
		case 'm':
			return "--";
		case 'n':
			return "-.";
		case 'o':
			return "---";
		case 'p':
			return ".--.";
		case 'q':
			return "--.-";
		case 'r':
			return ".-.";
		case 's':
			return "...";
		case 't':
			return "-";
		case 'u':
			return "..-";
		case 'v':
			return "...-";
		case 'w':
			return ".--";
		case 'x':
			return "-..-";
		case 'y':
			return "-.--";
		// for space
		case 'z':
			return "--..";
		}
		return "";
	}

	public static String decode(String s) {
		HashMap<String, Character> codes = new HashMap<String, Character>();
		codes.put(".-", 'A');
		codes.put("-...", 'B');
		codes.put("-.-.", 'C');
		codes.put("-..", 'D');
		codes.put(".", 'E');
		codes.put("..-.", 'F');
		codes.put("--.", 'G');
		codes.put("....", 'H');
		codes.put("..", 'I');
		codes.put(".---", 'J');
		codes.put("-.-", 'K');
		codes.put(".-..", 'L');
		codes.put("--", 'M');
		codes.put("-.", 'N');
		codes.put("---", 'O');
		codes.put(".--.", 'P');
		codes.put("--.-", 'Q');
		codes.put(".-.", 'R');
		codes.put("...", 'S');
		codes.put("-", 'T');
		codes.put("..-", 'U');
		codes.put("...-", 'V');
		codes.put(".--", 'W');
		codes.put("-..-", 'X');
		codes.put("-.--", 'Y');
		codes.put("--..", 'Z');
		String arr[] = s.split(" ");
		String res = "";
		for (int i = 0; i < arr.length; i++) {
			Character c = codes.get(arr[i]);
			if (c != null)
				res = res + " " + c;
		}
		return res.trim();

	}

	public static String encode(String s) {
		s = s.toLowerCase();
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			if (Character.isAlphabetic(s.charAt(i)))
				res = res + " " + morseEncode(s.charAt(i));
		}
		return res.trim();
	}

	// Driver code
	public static void main(String[] args) {
		String s = "java";
		String morse = encode(s);
		System.out.println(morse);
		System.out.println(decode(morse));

	}
}