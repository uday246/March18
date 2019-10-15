package Mat16th;

public class TestSingletonFactory {
	public static void main(String[] args) {
		SingletonFactory s1 = SingletonFactory.getInstance();
		System.out.println(s1);
		SingletonFactory s2 = SingletonFactory.getInstance();
		System.out.println(s2);

	}
}
