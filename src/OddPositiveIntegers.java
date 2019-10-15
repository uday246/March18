
public class OddPositiveIntegers {
	public static void main(String[] args) {

		int count = 0;
		for (int i = 1;; i++) {
			if (i % 2 == 1) {
				System.out.println("Square of : " + i + " is : " + Math.pow(i,2));
				count++;
			}
			if (count == 25)
				break;
		}
	}
}
