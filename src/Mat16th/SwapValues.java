package Mat16th;

public class SwapValues {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = a;
		System.out.println("Before Swap : ");
		System.out.println("Value of a :" + a);
		System.out.println("Value of b " + b);

		a = b;
		b = c;
		System.out.println("After Swap : ");
		System.out.println("Value of a :" + a);
		System.out.println("Value of b " + b);

	}
}
