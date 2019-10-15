import java.util.Vector;

public class Rec {

	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<Integer> ();
		vector.addElement(10);
		vector.addElement(8);
		vector.addElement(5);
		vector.addElement(20);
		System.out.println(vector);
		System.out.println("Max value : "+Rec.max(vector));
		System.out.println("Min value : "+Rec.min(vector));
		
		
	}
	public static int max(Vector<Integer> vector){
		return findMaxValue(vector, vector.size());
	}
	public static int min(Vector<Integer> vector){
		return findMinValue(vector, vector.size());
	}
	public static int findMinValue(Vector<Integer> v , int n)
	{
	    if (n == 1)
	        return v.get(0);
	    return Math.min(v.get(n-1), findMinValue(v, n-1));
	}
	public static int findMaxValue(Vector<Integer> v , int n)
	{
	    if (n == 1)
	        return  v.get(0);
	    return Math.max(v.get(n-1), findMaxValue(v, n-1));
	}


}
