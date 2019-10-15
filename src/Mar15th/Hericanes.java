package Mar15th;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
/*
 * 
 * here i am using map for storing the each year month and its value so that while writing i can access it directly from the map by specifying the yearmonth
 * arr i am using to find the sum of months for all the years for avg calulations
 * split() used for spliting the string as we are having Month:number i am spliting to get the number
 * trim() is used for triming the extra spaces
 * 
 * Hashmap looks like
 * 2005May = 0
 * 2005Jun = 2
 * so you can get the value directly
 */
public class Hericanes {

	public static void main(String[] args) {
		
		BufferedReader br = null;
		FileReader fr = null;
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		int arr[] = new int[8];

		try {

			fr = new FileReader("C:\\Users\\123\\workspace\\Chegg\\src\\Mar15th\\hericanes.txt");
			// Give the file path in your system
			br = new BufferedReader(fr);

			String sCurrentLine;
			String year = "";
			while ((sCurrentLine = br.readLine()) != null) {
				sCurrentLine = sCurrentLine.trim();
				if(sCurrentLine.length()==0)
					continue;
				if(sCurrentLine.equals("2005")||sCurrentLine.equals("2006")||sCurrentLine.equals("2007")||sCurrentLine.equals("2008")||sCurrentLine.equals("2009")||sCurrentLine.equals("2010")){
					year = sCurrentLine;
				}
				else{
					map.put(year+sCurrentLine.split(":")[0], Integer.parseInt(sCurrentLine.split(":")[1]));
					if(sCurrentLine.contains("May")){
						arr[0]+=Integer.parseInt(sCurrentLine.split(":")[1]);
					}
					if(sCurrentLine.contains("Jun")){
						arr[1]+=Integer.parseInt(sCurrentLine.split(":")[1]);
					}
					if(sCurrentLine.contains("Jul")){
						arr[2]+=Integer.parseInt(sCurrentLine.split(":")[1]);
					}
					if(sCurrentLine.contains("Aug")){
						arr[3]+=Integer.parseInt(sCurrentLine.split(":")[1]);
					}
					if(sCurrentLine.contains("Sep")){
						arr[4]+=Integer.parseInt(sCurrentLine.split(":")[1]);
					}
					if(sCurrentLine.contains("Oct")){
						arr[5]+=Integer.parseInt(sCurrentLine.split(":")[1]);
					}
					if(sCurrentLine.contains("Nov")){
						arr[6]+=Integer.parseInt(sCurrentLine.split(":")[1]);
					}
					if(sCurrentLine.contains("Dec")){
						arr[7]+=Integer.parseInt(sCurrentLine.split(":")[1]);
					}
				}
			}

			PrintWriter writer1 =null;      
	         writer1 = new PrintWriter(new FileWriter(new File("C:\\Users\\123\\Desktop\\output.csv")));  
	         // Give the required name and path
	         writer1.println("Month,Average,2005,2006,2007,2008,2009,2010");
	         writer1.println("May,"+(arr[0]/6.0)+","+map.get("2005May")+","+map.get("2006May")+","+map.get("2007May")+","+map.get("2008May")+","+map.get("2009May")+","+map.get("2010May"));
	         writer1.println("Jun,"+(arr[1]/6.0)+","+map.get("2005Jun")+","+map.get("2006Jun")+","+map.get("2007Jun")+","+map.get("2008Jun")+","+map.get("2009Jun")+","+map.get("2010Jun"));
	         writer1.println("Jul,"+(arr[2]/6.0)+","+map.get("2005Jul")+","+map.get("2006Jul")+","+map.get("2007Jul")+","+map.get("2008Jul")+","+map.get("2009Jul")+","+map.get("2010Jul"));
	         writer1.println("Aug,"+(arr[3]/6.0)+","+map.get("2005Aug")+","+map.get("2006Aug")+","+map.get("2007Aug")+","+map.get("2008Aug")+","+map.get("2009Aug")+","+map.get("2010Aug"));
	         writer1.println("Sep,"+(arr[4]/6.0)+","+map.get("2005Sep")+","+map.get("2006Sep")+","+map.get("2007Sep")+","+map.get("2008Sep")+","+map.get("2009Sep")+","+map.get("2010Sep"));
	         writer1.println("Oct,"+(arr[5]/6.0)+","+map.get("2005Oct")+","+map.get("2006Oct")+","+map.get("2007Oct")+","+map.get("2008Oct")+","+map.get("2009Oct")+","+map.get("2010Oct"));
	         writer1.println("Nov,"+(arr[6]/6.0)+","+map.get("2005Nov")+","+map.get("2006Nov")+","+map.get("2007Nov")+","+map.get("2008Nov")+","+map.get("2009Nov")+","+map.get("2010Nov"));
	         writer1.println("Dec,"+(arr[7]/6.0)+","+map.get("2005Dec")+","+map.get("2006Dec")+","+map.get("2007Dec")+","+map.get("2008Dec")+","+map.get("2009Dec")+","+map.get("2010Dec"));
	         writer1.flush();
	         writer1.close();
			
		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (br != null)
					br.close();

				if (fr != null)
					fr.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}
	}

}
