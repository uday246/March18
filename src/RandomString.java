import java.util.Random;

public class RandomString {	
	Random  r = new Random();
	// here I am taking for 3 animals, if you want just change number here and add same no elements to the array
	int max=3;
	public static void main(String[] args) {
		RandomString rs= new RandomString();
		// put the required mappings inside the array and access them based on generated value
		String arr[]={"DOG","CAT","RAT"};
		for(int i=0;i<10;i++){
			System.out.println("I Choose "+arr[rs.def()-1]);
		}
	}
	public int def(){
		// generates random num in given range
		return r.nextInt(max - 1 + 1) + 1;
	}
}
