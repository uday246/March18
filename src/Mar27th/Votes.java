package Mar27th;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Votes {

	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\teegu\\Desktop\\votes.txt"));
		HashMap<String,List<Integer>> map = new HashMap<String,List<Integer>>();
		String line = reader.readLine();
		int surveyCount = 0;
		// reading the data from the file and storing it in the map name---> list of survey votes ( it will work for n number surveys)
		while(line!=null){
			surveyCount = 0;
			line = line.trim();
			String arr[] =  line.split(" ");
			List<Integer>list = new ArrayList<Integer>();
			String name = arr[0];
			int sum = 0;
			for(int i=1;i<arr.length;i++){
				list.add(Integer.parseInt(arr[i]));
				sum += Integer.parseInt(arr[i]);
				surveyCount++;
			}
			list.add(sum/list.size());
			map.put(name, list);
			line = reader.readLine();
		}
		System.out.println("________________________________________________________________________________________________________");
		System.out.print("Name\t\t");
		for(int i=1;i<=surveyCount;i++){
			System.out.print("Survey"+i+"\t\t");
		}
		System.out.println("Avg\t\t");
		for(int i=1;i<=surveyCount+2;i++){
			System.out.print("-------\t\t");
		}
		System.out.println();
		// this is code to sort the list based on the average value
		List<Map.Entry<String, List<Integer>>> list =
                new LinkedList<Map.Entry<String, List<Integer>>>(map.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, List<Integer>>>() {
            public int compare(Map.Entry<String, List<Integer>> o1,
                               Map.Entry<String, List<Integer>> o2) {
            	Integer val1 = o1.getValue().get(o1.getValue().size()-1);
            	Integer val2 = o2.getValue().get(o2.getValue().size()-1);
            	
                return -val1.compareTo(val2);
            }
        });
     // this is code to sort the list based on the average value
        Map<String, List<Integer>> sortedMap = new LinkedHashMap<String, List<Integer>>();
        for (Map.Entry<String, List<Integer>> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
		
		
        boolean flag = true;
        String winnersName = "";
		//printing the format
		for (Map.Entry<String,List<Integer>> entry : sortedMap.entrySet()){
			if(flag)
			winnersName = entry.getKey();
			flag = false;
			System.out.print(entry.getKey()+"\t\t");
			for(Integer i:entry.getValue()){
				System.out.print(i+"\t\t");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Winner is : "+winnersName);
		System.out.println("________________________________________________________________________________________________________");
		reader.close();
	}
}

// Sample File
/*
smith 23 38 16
brown 28 20 19
adams 15 10 9
zhou 8 6 9
gandhi 11 18 31
gomez 15 8 16

*/
