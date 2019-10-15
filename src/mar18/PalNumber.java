package mar18;

public class PalNumber {
public static void main(String[] args) {
	int num1[]={1,2,3,2,1};
	int num2[]={1,1,2,3,2,1};
	
	System.out.println(isPalindrome(num1));
	System.out.println(isPalindrome(num2));
	
}

private static boolean isPalindrome(int[] num) {
	for(int i=0,j=num.length-1;i<j;i++,j--){
		if(num[i]!=num[j])
			return false;
	}
	return true;
}
}
