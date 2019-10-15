package mat25;

public class ArrayTest {
public static void main(String[] args) {
	int arr[]={11,22,33,44,55};
	arr[3]=88; // changing value 88 at index 3
	
	// printing elements from first
	System.out.println("Print from first");
	for(int i=0;i<arr.length;i++)
		System.out.print(arr[i]+" ");
	System.out.println();
	
	// printing elements from last
	System.out.println("Print from first");
	for(int i=arr.length-1;i>=0;i--)
		System.out.print(arr[i]+" ");
	System.out.println();
}
}
