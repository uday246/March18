package Mat16th;

public class LargerTest {
	public static char larger(int num) {
		char res = ' ';
		if (num > 0)
			res = '+';
		if (num < 0)
			res = '-';
		if (num == 0)
			res = '0';
		return res;
	}
}
