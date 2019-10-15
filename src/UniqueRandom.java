import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class UniqueRandom {
	public static void main(String[] args) {
		Random r = new Random();
		Set<Integer>set = new HashSet<Integer>();
		int temp=0;
		for(int i=0;i<6;){
			temp = r.nextInt((54 - 1) + 1) + 1;
			if(set.add(temp))
				i++;
		}
			System.out.print(set);
	}
}
