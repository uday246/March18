package mygenerics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MyGenericI{
	public static void main(String[] args) throws Exception{
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\teegu\\Desktop\\numbers.txt"));
		nthDigitTally(reader);
	}
	private static void nthDigitTally(BufferedReader reader) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n Enter number");
		int num = sc.nextInt();
		sc.close();
		// Creating the map with the keys from 0 to 9 with default value as 0
		HashMap<String, Integer> map = new HashMap<String,Integer>();
		map.put("0s", 0);
		map.put("1s", 0);
		map.put("2s", 0);
		map.put("3s", 0);
		map.put("4s", 0);
		map.put("5s", 0);
		map.put("6s", 0);
		map.put("7s", 0);
		map.put("8s", 0);
		map.put("9s", 0);
		// getting the numbers from the file
		Integer [] arr = readMysteriuosNumbers(reader);
		String line="";
		
		for(Integer i:arr){
			line = i.toString();
			// if the specified position exist in the number than checking
			if(line.length()>=num){
				String k = line.charAt(num)+"s";
				if(map.containsKey(k)){
					map.put(k, map.get(k)+1);
				}
				
			}
			
		}
		Map<String, Integer> treeMap = new TreeMap<String, Integer>(map);
		Iterator<Map.Entry<String, Integer>> itr = treeMap.entrySet().iterator();
        
        while(itr.hasNext())
        {
             Map.Entry<String, Integer> entry = itr.next();
             System.out.println(entry.getKey() + " : " + entry.getValue());
        }		
	}
	// using this function to read into array
	public static Integer[] readMysteriuosNumbers(BufferedReader reader) throws Exception{
		ArrayList<Integer> list = new ArrayList<Integer>();
		String line = reader.readLine();
		while(line!=null){
			list.add(Integer.parseInt(line));
			line = reader.readLine();
		}
		Integer temp [] = new Integer[5];
		return list.toArray(temp);
		
	}
	
	
}