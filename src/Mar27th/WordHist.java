package Mar27th;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class WordHist {
	public static void main(String[] args) throws Exception {
		// getting file name from command line
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		HashMap<String,Integer> map  = new HashMap<String,Integer>();
		String line = br.readLine();
		while(line!=null){
			String arr[] = line.split("\\s");
			for(String str:arr){
				str = str.replaceAll("[^a-zA-Z]+","").toLowerCase();
				// if map already contains a key, getting old count and increasing and putting the same
				if(map.containsKey(str)){
					int count = map.get(str);
					count++;
					map.put(str, count);
				}
				// if this is the first time than putting the count as 1
				else{
					map.put(str, 1);
				}
			}
			line = br.readLine();
		}
		// sorting the map onn keys by passing it to the TreeMap
		TreeMap<String, Integer> sorted = new TreeMap<>(map); 
		Set<Entry<String, Integer>> mappings = sorted.entrySet();
		// ietrating in map to print all values
		for(Map.Entry<String, Integer> en:mappings){
			System.out.println(en.getKey()+" : "+en.getValue());
		}
		br.close();
	}
}
