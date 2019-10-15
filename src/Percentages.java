import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Percentages {

	public static void main(String[] args) {
		ArrayList<Integer>list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		int value = 1;
		while(value>0){
			value = sc.nextInt();
			if(value<0)
				break;
			list.add(value);
		}
		sc.close();
		HashMap<String,Integer>map = new HashMap<String,Integer>();
		double sum = 0;
		for(int num:list){
			   sum = sum+ num;
			if(num>=90){
				if(map.containsKey("A")){
					map.put("A",map.get("A")+1);
				}
				else{
					map.put("A",1);
				}
			}
			
			if(num>=80 && num<=89){
				if(map.containsKey("B")){
					map.put("B",map.get("B")+1);
				}
				else{
					map.put("B",1);
				}
			}
			if(num>=70 && num<=79){
				if(map.containsKey("C")){
					map.put("C",map.get("C")+1);
				}
				else{
					map.put("C",1);
				}
			}
			if(num>=60 && num<=69){
				if(map.containsKey("D")){
					map.put("D",map.get("D")+1);
				}
				else{
					map.put("D",1);
				}
			}
			if(num<=59){
				if(map.containsKey("F")){
					map.put("F",map.get("F")+1);
				}
				else{
					map.put("F",1);
				}
			}
		}
		Iterator it = map.entrySet().iterator();
		
		 
		
		System.out.println("Total Number of Scores"+list.size());
		System.out.println("Total Number of Each letter grade");
		double sum2 = 0;
		while (it.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();
	        System.out.println(pair.getKey() + " = " + pair.getValue());
	        sum2 = sum2 +(int)pair.getValue();
	     
	    }
		it = map.entrySet().iterator();
		System.out.println("Percentages");
		while (it.hasNext()) {
	      Map.Entry pair = (Map.Entry)it.next();
	        double percentage = ((int)pair.getValue()/sum2)*100.0;
	        System.out.println(pair.getKey()+" : "+percentage+" % ");
	    }
		
		
		Collections.sort(list);
		System.out.println("Elements lowest "+list.get(0));
		System.out.println("Elements highest "+list.get(list.size()-1));
		System.out.println("Average score"+(sum/list.size()));
		
		
		}
	}

