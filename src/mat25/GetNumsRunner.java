package mat25;

import java.util.ArrayList;
import java.util.List;

class ListGetNums {

	public static List<Integer> go(List<Integer> ray) {
		// looping through the list and checking if is greater than 11 adding to
		// res list
		List<Integer> res = new ArrayList<Integer>();
		for (Integer r : ray) {
			if (res.size() >= 3)
				return res;
			if (r > 11)
				res.add(r);
		}

		return res;
	}
}
public class GetNumsRunner {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(16);
		list.add(17);
		list.add(25);
		list.add(11);
		list.add(8);
		list.add(28);

		System.out.println(ListGetNums.go(list));
	}
}
