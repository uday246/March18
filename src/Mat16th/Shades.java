package Mat16th;

import java.io.BufferedReader;
import java.io.FileReader;

public class Shades {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new  FileReader("numbers.txt"));
		// reading the size
		String line = br.readLine();
		int size =  Integer.parseInt(line);
		// reading the elements
		String n[] = br.readLine().split(" ");
		int arr[] = new int[size];
		// converting string array to int array
		for(int i=0;i<size;i++)
			arr[i] = Integer.parseInt(n[i]);
		// reading the number of queries
		int queries = Integer.parseInt(br.readLine().trim());
		int q[]= new int[queries];
		// reading the queries into arrays
		for(int i=0;i<queries;i++)
			q[i]  =Integer.parseInt(br.readLine().trim());
		int count=0;
		 // looping to find the number of items
		for(int i=0;i<queries;i++){
			count=0;
			for(int j=0;j<size;j++){
				if(q[i]>arr[j])
					count++;
			}
			System.out.println(count);
		}
		br.close();
	}
}
