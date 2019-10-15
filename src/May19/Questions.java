package May19;

class One{
	public One(){
		System.out.println("A message from the class One");
	}
}
class Two extends One{
	Two(){
		System.out.println("A message from the class Two");
		
	}
}
public class Questions {
	public static void main(String[] args) {
		Two obj2= new Two();
	}
}