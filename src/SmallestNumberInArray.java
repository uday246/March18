public class SmallestNumberInArray {
 
	// returns the small in array in given range
    public static int getMin(int start,int array[], int n)
    {
      if(n == start)
        return array[0];
         
        return Math.min(array[n-1], getMin(start,array, n-1));
    }
     
    public static void main(String args[])
    {
        int array[] = {13, 5,12,67,45,3,5,10};
        int mid = array.length/2;
        // dividing array into 2 parts
        int s1 = getMin(0,array, mid);
        int s2 = getMin(mid+1,array,array.length);
        
        System.out.println("Smallest No in 1st part : "+s1);
        System.out.println("Smallest No in 2nd Part part : "+s2);
        System.out.println("Smallest No in Array : "+Math.min(s1, s2));
        
    }
}
