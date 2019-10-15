
public class Scores {
	public static void main(String[] args) {
		int t = new Scores().examScore(54, 82, 64);
		System.out.println(t);
		t = new Scores().examScore(74,98,87);
		System.out.println(t);
		t = new Scores().examScore(100,0,0);
		System.out.println(t);
		
	}

	private int examScore(int a1, int a2, int a3) {
		double total = a1 + a2 + a3;
		int avg = (int) ((total / 3.0) + 0.5);
		return avg;
	}

}
