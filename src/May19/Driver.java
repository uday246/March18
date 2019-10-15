package May19;

import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class Driver {

   public static void main(String[] args) throws FileNotFoundException {
      
       File inputFile = new File("input.txt");
       Scanner in = new Scanner(inputFile);
       int sum = 0;
       int max=in.nextInt();
       sum=max;
       int num;
       while(in.hasNextInt())
       {
    	   num=in.nextInt();
           sum = sum + num;
           if(num>max)
        	   max=num;
       }
       System.out.println("The sum of the numbers in the input file is: " + sum);
       System.out.println("The maximum number in the input file is: " + max);
       
   }

}