package Mar27th;

import java.io.File;
import java.util.Scanner;

public class FileProcessing {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(new File("C:\\Users\\test\\Desktop\\input.txt"));
		processFile(sc);
	}
	public static void processFile(Scanner input){
		int count=0;
		int sum=0;
		int evenCount=0;
		
		while (input.hasNextLine()) {
            String line = input.nextLine();
            // spliting the line using delimeter as " "
            String arr[] = line.split(" ");
            // iterating array to find sum and count and even count
            for(String str:arr){
            	// converts string into integer
            	int num = Integer.parseInt(str);
            	count++;
            	sum+=num;
            	if(num%2==0)
            		evenCount++;
            	
            }
            
		}
		double per = ((double)evenCount/(double)count)*100;
		System.out.println(count+" numbers , sum = "+sum);
		System.out.print(evenCount+" evens ");
		// to print only 2 decimal
		System.out.printf("(%.2f)",per);
				
	}

}
