package mat55;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class CountLettersBHarris {

   public static void main(String[] args) {
    Scanner myInput = new Scanner(System.in);
       File myInputFile;
       String fileName;
       int charCount = 0;
       char temp;
       int[] freqs = new int[26];
       char[] letter = new char[] {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};


       System.out.print("Enter filename: ");
       fileName = myInput.nextLine();

       myInputFile = new File(fileName);

       if(!myInputFile.exists()) {
           System.out.println("File does not exist!");
           System.exit(1);
       }
       HashMap<String,Integer> map= new HashMap<String,Integer>();
       try( BufferedReader in = new BufferedReader(new FileReader(fileName))){
          
          
           Scanner input = new Scanner(myInputFile);
           System.out.println("Letters' Frequencies");
           System.out.println("-----------------------");
           System.out.printf("%5s %5s %5s \n", "Letter", "Freq","Percentage");

           while((fileName = in.readLine()) != null){
               fileName = fileName.toUpperCase();
               for(char ch:fileName.toCharArray()){
                   if(Character.isLetter(ch)){
                	   int c=1;
                       if(map.containsKey(ch+"")){
                    	   c=map.get(ch+"");
                    	   c++;
                       }
                       map.put(ch+"", c);
                   }
                   }
               for( int i = 0; i < fileName.length( ); i++ ){
               temp = fileName.charAt( i );

              if( temp != ' ' )
               charCount++;
               }
               System.out.printf("%5s %5s %5s \n", letter, freqs, percentage);
           }
           System.out.printf("Total letters:%d",charCount);
          
       input.close();
          
       }
      
       catch (IOException e) {
           System.out.println(e.getMessage());
       }
   }
}
