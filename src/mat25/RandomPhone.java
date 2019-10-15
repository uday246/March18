package mat25;

import java.util.Random;

public class RandomPhone {
	public static void main(String[] args) {
		String phone = "";
		Random r = new Random();
		String firstThree = "";
		// generating first three numbers until it has other 8 and 9
		while (true) {
			firstThree = "" + (r.nextInt(899) + 100);
			if (!firstThree.contains("8") && !firstThree.contains("9"))
				break;
		}
		phone = firstThree;
		// generating the next 3 numbers less than 655
		phone = phone + "-" + (r.nextInt(555) + 100);
		// generating last 4 digits
		phone = phone +"-"+ (r.nextInt(9999) + 1000);
		System.out.println(phone);
	}
}
