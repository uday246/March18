package Mar20th;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EightBitInteger {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str1 = "", str2 = "";
		System.out.println("Enter num1");
		str1 = reader.readLine();
		System.out.println("Enter num2");
		str2 = reader.readLine();
		// Checking whether the number of digits or less than 30 or not
		if (str1.length() > 30 || str2.length() > 30) {
			System.out.println("Numbers must less than 30 digits");
			return;
		}
		// finding the most number of digits from the given 2 strings so that we can create the output array
		int size = (str1.length() > str2.length()) ? str1.length() : str2.length();
		// if str1 less than str2 than padding 0 to the str1
		if (str1.length() < str2.length()) {
			while (str1.length() != str2.length())
				str1 = "0" + str1;
		}
		// if str2 less than str1 than padding 0 to the str1
		if (str2.length() < str1.length()) {
			while (str1.length() != str2.length())
				str2 = "0" + str2;
		}
		int[] output = new int[size];

		int temp = 0;
		boolean flag = true;
		for (int i = str1.length() - 1; i >= 0; i--) {
			int sum = 0;
			// adding the numbers starting at 1's position which means staring from end of the string., by subttracting -48 we can convert char to int
			sum = (str1.charAt(i) -48)+ (str2.charAt(i)-48) + temp;
			// for last digit if we get more than the sum means Integer is overflow because we can't store in output array
			if(sum>=8 && i==0){
				flag = false;
				System.out.println("Integer Overflow");
				break;
			}
			// if sum is 8>=8 than storing 0 in current location carrying the reamining balance to next
			if (sum >= 8) {
				temp = sum - 8;
				temp++;
				sum -= 8;
			} else {
				temp = 0;
			}

			output[i] = sum;
		}
		//if output is valid than only we are showing output
		if(flag){
			for(int i=0;i<output.length;i++)
				System.out.print(output[i]);
			
		}
	}
}
