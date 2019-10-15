package mat27;

import java.util.ArrayList;
import java.util.List;

class ListDown{
	public static boolean go(List<Integer>list){
		for(int i=0;i<list.size()-1;i++){
			if(list.get(i)<list.get(i+1))
				return false;
			System.out.println(i);
		}
			
		return true;
	}
}
public class DownRunner {
public static void main(String[] args) {
	ArrayList<Integer>list= new ArrayList<Integer>();
	System.out.println("A");
	list.add(4);
	list.add(3);
	list.add(2);
	list.add(1);
	list.add(0);
	System.out.println(ListDown.go(list));
}
}
