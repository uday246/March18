package Mat16th;

public class MergeSort 
{
    public static void sort(int[] a, int low, int high) 
    {
        int N = high - low;         
        if (N <= 1) 
            return; 
        int mid = low + N/2; 
        // Dividing the array into two sub arrays unitll it reaches into size 1
        sort(a, low, mid); 
        sort(a, mid, high); 
        // after diving now we will compare the arrays from the bottom and merge the arrays in sorted array
        int[] temp = new int[N];
        int i = low, j = mid;
        
        
        for (int k = 0; k < N; k++) 
        {
            if (i == mid)  
                temp[k] = a[j++];
            else if (j == high) 
                temp[k] = a[i++];
            else if (a[j]<a[i]) 
                temp[k] = a[j++];
            else 
                temp[k] = a[i++];
        }    
        // after merging if any part of the array contains values we will directly copy the values
        for (int k = 0; k < N; k++) 
            a[low + k] = temp[k];         
    }
    public static void main(String[] args) 
    {
        int array[]={98,23,45,14,6,67,33,42};       
        sort(array, 0, array.length);
        System.out.println("\nElements after sorting ");        
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i]+" ");   
    }    
}
