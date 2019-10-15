package Mat16th;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LuckySeven {
	public static void main(String[] args) throws Exception {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter Lower Range ");
		int lower = Integer.parseInt(br.readLine());
		System.out.println("Enter Upper Range ");
		int upper = Integer.parseInt(br.readLine());
		int temp=0,count=0;
		// iterating through the lower and upper range
		for(int i=lower;i<upper;i++){
			temp = i;
			// splitting the number one by one and checking whether it is 7 or not
			while(temp>0){
				if(temp%10==7)
					count++;
				// removing the num by digit every time
				temp = temp/10;
			}
		}
		System.out.println("Total No Of sevens in given range : "+ count);
	}
}
