interface DoesJudo{
	void eat();
	void walk();
	
}
abstract class Bear implements DoesJudo{
	public void eat(){
		System.out.println("Bear eats fruits");
	}
	public void walk(){
		System.out.println("Bears can walk");
	}

}
class RussianBear extends Bear implements DoesJudo{

	public void eat(){
		System.out.println("Russian Bear eats meat");
	}
	public void walk(){
		System.out.println("Russian  Bears can walk fast");
	}
	
}
public class TestInterface {

}
