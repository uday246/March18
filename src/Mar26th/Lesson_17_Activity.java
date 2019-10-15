package Mar26th;

public class Lesson_17_Activity {
	public static void main(String[] args) {
		int a[]={10,20,30,40,50,60};
		
		if(isSorted(a)){
			System.out.println("Array Sorted in Ascending order");
			System.out.println("Element found at : "+binarySearch(a, 30));
		}
		else{
			System.out.println("Array Not sorted so it's not possible to perform binary search");
		}
		
	}
	
// this method will test whether the array is in sorted or not
	public static boolean isSorted(int[] a) {
		boolean flag = true;
		for(int i=0;i<a.length-1;i++){
			if(!(a[i]<=a[i+1]))
			{
				flag = false;
				break;
			}
		}
		return flag;
	}
	public static int binarySearch(int [] a, int b){
		return binarySearch(a, 0,a.length-1,b);
		
	}
	private static int binarySearch(int arr[], int l, int r, int x)
	{
	   if (r >= l)
	   {
	        int mid = l + (r - l)/2;
	     // If the element is present at the middle 
	        if (arr[mid] == x)  
	            return mid;
	        // if mid element is greater than search element than search in the left side
	        if (arr[mid] > x) 
	            return binarySearch(arr, l, mid-1, x);
	        //if mid element is less than search element than search in the right side
	        return binarySearch(arr, mid+1, r, x);
	   }
	 
	   return -1;
	}
}
