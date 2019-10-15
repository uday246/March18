import java.awt.Rectangle;
import java.awt.Shape;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestMap {
public static void main(String[] args) {
	HashMap<String,Integer> map = new HashMap<String,Integer>();
	map.put("one", 1);
	Set<Map.Entry<String, Integer>> en = (Set<Entry<String, Integer>>) map.entrySet();
	for(Map.Entry<String, Integer> e:en){
		System.out.println(e.getKey());
		System.out.println(e.getValue());
		
	}
	Rectangle  r = new Rectangle();
	System.out.println(r);
	Shape s =r;
	System.out.println(s);
	Serializable sr  =r;
	System.out.println(sr);
	
}
}
