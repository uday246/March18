package mat55;

public class Sorted {
public static void main(String[] args) {
	System.out.println(isDescending(new double[]{1,2,3,4,5}));
	System.out.println(isDescending(new double[]{5,4,3,2,1}));
	
}
public static boolean isDescending(double arr[]){
	// looping through the array
	for(int i=0;i<arr.length-1;i++){
		// checking if it voilates the rule
		if(arr[i]<arr[i+1])
			return false;
	}
	return true;
}
}
