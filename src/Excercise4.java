
public class Excercise4 {
	public static void main(String[] args) {
		int arr[] = { 92, 67, 88, 90, 73, 95 };
		int sum = 0;
		//iterating and adding to sum
		for (int i : arr)
			sum += i;
		//printing total
		System.out.println("the sum if the grades is = " + sum);
	}
}
