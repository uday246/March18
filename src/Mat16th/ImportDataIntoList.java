package Mat16th;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class ImportDataIntoList {

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\teegu\\Desktop\\names.txt"));
		HashMap<String,Integer>lastNamesCount = new HashMap<String,Integer>();
		List<String> list = new ArrayList<String>();
		String line=reader.readLine();
		while(line!=null){
			String firstName = line.split(",")[0];
			String lastName = line.split(",")[1];
			list.add(lastName+" "+firstName.charAt(0));
			if(lastNamesCount.containsKey(lastName)){
				lastNamesCount.put(lastName, lastNamesCount.get(lastName)+1);
			}
			else{
				lastNamesCount.put(lastName, 1);
			}
			line=reader.readLine();
		}
		Collections.sort(list);
		System.out.println("Sorted Name : "+list);
		System.out.println("Last Name count : "+lastNamesCount);
		reader.close();
		
	}

}

