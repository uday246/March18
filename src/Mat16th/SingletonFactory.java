package Mat16th;

public class SingletonFactory {
	// static reference variable
	static SingletonFactory singletonFactory;
//private consutrctor to avoid the creation of objects
	private SingletonFactory() {
	}
	// factory method to return the object
	public static SingletonFactory getInstance() {
		//creating the object only once for the first time
		if (singletonFactory == null)
			singletonFactory = new SingletonFactory();

		return singletonFactory;
	}
}
