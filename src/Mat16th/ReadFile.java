package Mat16th;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFile {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new  FileReader("numbers.txt"));
		// reading the size
		String line = br.readLine();
		int size =  Integer.parseInt(line);
		// reading the elements
		String n[] = br.readLine().split(",");
		int arr[] = new int[size];
		// converting string array to int array
		int start=-1,end=-1;
		for(int i=0;i<size;i++){
			arr[i] = Integer.parseInt(n[i]);
			if(arr[i]==i){
				if(start==-1)
					start=i;
				end= i;
			}			
		}
		System.out.println("Starting : "+start);
		System.out.println("Ending : "+end);
		br.close();
	}
}
