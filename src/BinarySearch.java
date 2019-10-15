class BinarySearch {
	static int bCount;
	public static int binarySearch(int arr[], int l, int r, int x) {
		if (r >= l) {
			
			int mid = l + (r - l) / 2;
			System.out.println("Mid : "+mid);
			System.out.println("Low: "+l);
			System.out.println("right : "+r);
			bCount++;
			if (arr[mid] == x) {
				System.out.println("Mid : "+mid);
				System.out.println("Low: "+l);
				System.out.println("right : "+r);
				System.out.println("Count : "+bCount);
				return mid;
			}

			if (arr[mid] > x)
				return binarySearch(arr, l, mid - 1, x);

			return binarySearch(arr, mid + 1, r, x);
		}
		System.out.println("Count : "+bCount);
		return -1;
	}

	private static int linearSearch(int arr[], int n, int ele) {
		int i;
		for (i = 0; i < n; i++) {
			if (arr[i] == ele)
				return i;
		}
		return -1;
	}
	static void sort(int arr[])
    {
        int n = arr.length;
        for (int i=1; i<n; ++i)
        {
            int key = arr[i];
            int j = i-1;
 
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j>=0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
    }
	public static void main(String args[]) {
		
		int arr[]={8,15,22,36,41,56,59,77,88,92,95,110};
		System.out.println(binarySearch(arr, 0,arr.length-1, 76));
		/*int arr[] = new int[20];
		Random r = new Random();
		for (int i = 0; i < 20; i++){
			arr[i] = r.nextInt(100);
			
		}
		sort(arr);
		System.out.println("After insertion sort");
		for (int i = 0; i < 20; i++)
			System.out.print(arr[i]+" ");
		System.out.println();
		int elementforSearch =10;
		System.out.println("Using linear search");
		int result = linearSearch(arr, arr.length, elementforSearch);
		if (result == -1)
			System.out.println(elementforSearch + " not found");
		else
			System.out.println("Element found in " + result + " searches at "+result);

		result = binarySearch(arr, 0, arr.length - 1, elementforSearch);
		System.out.println("Using binary search");
		if (result == -1)
			System.out.println(elementforSearch + " not found");
		else
			System.out.println("Element found in " + bCount + " searches at "+result);
*/
	}
}