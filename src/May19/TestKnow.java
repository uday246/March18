package May19;

import java.util.HashMap;

class Kong{
	private String name;
	private String species;
	public Kong(String aName, String aSpecies) {
		super();
		name = aName;
		species = aSpecies;
	}
	@Override
	public int hashCode() {
		return name.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Kong){
			Kong k = (Kong)obj;
			return this.species.equals(k.species);
		}
		else{
			return false;
		}
			
	}
	
	
}
public class TestKnow {
public static void main(String[] args) {
	HashMap<Kong,Integer>map= new HashMap<Kong,Integer>();
	Kong cranky = new Kong("Cranky",new String("Monkey"));
	Kong dixis = new Kong("Dixis",new String("Monkey"));
	map.put(dixis, 15);
	System.out.println(map.get(cranky));
}
}
