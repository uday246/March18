import java.util.Random;

public class LoopTen {
public static void main(String[] args) {
	Random r = new Random();
	int sum = 0;
	int temp=0;
	// looping 10 times
	for(int i=0;i<10;i++){
		// generating random numbers in range 1-10
		temp = r.nextInt((10 - 1) + 1) + 1;
		// adding to sum
		sum+=temp;
		System.out.print(temp+" ");
	}
	System.out.println();
	// calculating average
	System.out.println("Average : "+(sum/10.0));
}
}
