package Programming;

import java.util.Scanner;

public class TestString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of String  ");
		int length = sc.nextInt();

		String str = "ABC";
		if(length==2)
			str="AB";
		if(length==1)
			str="A";
		permuteString(str, 0, length-1);

	}


	private  static void permuteString(String str, int l, int r)
	{
		if (l == r)
			System.out.println(str);
		else
		{
			for (int i = l; i <= r; i++)
			{
				str = swap(str,l,i);
				permuteString(str, l+1, r);
				str = swap(str,l,i);
			}
		}
	}

	public static String swap(String a, int i, int j)
	{
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i] ;
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}
}
