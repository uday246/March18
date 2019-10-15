public class TraceEx {
	public static void main(String[] args) {
		int x = 4, y = 5, z = 6;
		z -= ++x / 3 + y-- * 4;
		System.out.println(x + ":" + y + ":" + z);
		z += x++ * 3 + --y % 2;
		System.out.println(x + ":" + y + ":" + z);
	}
}

