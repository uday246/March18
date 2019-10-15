package chapter10;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;  
public class FileOutputStreamExample {  
    public static void main(String args[]){    
           try{    
        	   FileInputStream fis = new FileInputStream("C:\\Users\\teegu\\Desktop\\counter.dat");
        	   int n = fis.read();
        	   n++;
        	   writeIntoFile(n);
        	   System.out.println("Done");
            }catch(Exception e){
            	writeIntoFile(1);
            }    
      }
    public static void writeIntoFile(int num){
    	FileOutputStream fout;
		try {
			fout = new FileOutputStream("C:\\Users\\teegu\\Desktop\\counter.dat");
			 fout.write(num);    
                fout.close();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
    }
    private static void viewHex(String filename) throws Exception
    {
    	BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\teegu\\Desktop\\data.dat"));
    	String line = reader.readLine();
    	while(line!=null){
    		
    	}
    }

}