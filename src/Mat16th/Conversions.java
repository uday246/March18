package Mat16th;

import java.util.Scanner;

public class Conversions {
	public static void main(String[] args) {
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		int ch = 0;
		while (flag) {
			System.out.println("Choose an option:");
			System.out.println("1. Decode a hex string.");
			System.out.println("2. Decode a binary string.");
			System.out.println("3. Convert binary to hex.");
			System.out.println("4. Quit.");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				break;
			case 2:
				break;

			case 3:
				break;
			case 4:
				flag = false;
			}
		}

	}
	public static long hexStringDecode(String hex){
		long res=0;
		return res;
	}
	
}
