package May19;

public interface IAnimal {
	String color="Red";
	void AnimalColor();
}
class Dog implements IAnimal{
	public void AnimalColor(){
		System.out.println(color);
	}
}