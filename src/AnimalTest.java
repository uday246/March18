import java.util.ArrayList;

class Animal {
	private String genus;
	private String species;
	private double weight;
	private boolean tail;
	public Animal(String aGenus, String aSpecies) {
		super();
		genus = aGenus;
		species = aSpecies;
	}
	public String getGenus() {
		return genus;
	}
	public void setGenus(String aGenus) {
		genus = aGenus;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String aSpecies) {
		species = aSpecies;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double aWeight) {
		weight = aWeight;
	}
	public boolean isTail() {
		return tail;
	}
	public void setTail(boolean aTail) {
		tail = aTail;
	}
}
class Lion extends Animal{
	private String name;
	public Lion(String name,double weight){
		super("Panthera","Leo");
		super.setWeight(weight);
		super.setTail(true);
		this.name = name;

	}
	public String getName() {
		return name;
	}
	public void setName(String aName) {
		name = aName;
	}
}
class Frog extends Animal{
	private String name;
	public Frog(String name,double weight){
		super("Lithobates","Catesbeianus");
		super.setWeight(weight);
		super.setTail(false);
		this.name = name;

	}
	public String getName() {
		return name;
	}
	public void setName(String aName) {
		name = aName;
	}
	public Frog(String aGenus, String aSpecies) {
		super(aGenus, aSpecies);
	}
}
public class AnimalTest{
	public static void main(String[] args) {
		ArrayList<Animal> list= createList();
		// printing the weights
		for(Animal an : list){
			System.out.println(an.getWeight()+" lbs");
		}
		for(Animal an : list){
			//  checking an is type Lion than only prints the name
			if(an instanceof Lion)
			System.out.println(((Lion) an).getName());
		}
	}

	private static ArrayList<Animal> createList() {
		// creating the list
		ArrayList<Animal>list = new ArrayList<Animal>();
		list.add(new Lion("Leo I",530));
		list.add(new Lion("Leo II",560));
		list.add(new Lion("Leo III",590));
		list.add(new Frog("Freddie",7));
		return list;
		
	}
}