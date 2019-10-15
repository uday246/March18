package Mar25th;

public class Validexp {
	public static void main(String arg[]) {
		int n = 827;
	    int sum = 0;
	 
	        while (n > 0 || sum > 9) 
	        {
	            if (n == 0) {
	                n = sum;
	                sum = 0;
	            }
	            sum += n % 10;
	            n /= 10;
	        }
	        System.out.println(sum);
	}
}