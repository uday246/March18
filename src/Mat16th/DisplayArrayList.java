package Mat16th;

import java.util.ArrayList;

public class DisplayArrayList {
public static void main(String[] args) {
	ArrayList list = new ArrayList();
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	for(int i=0;i<list.size();i++)
		System.out.println(list.get(i));
}
}
