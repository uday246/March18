package mat25;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ListMostFreq {
	public static int go(List<Integer> list) {
		// Sort the array
		Collections.sort(list);
		int n = list.size();
		// find the max frequency using linear
		// traversal
		int max_count = 1, res = list.get(0);
		int curr_count = 1;

		for (int i = 1; i < n; i++) {
			if (list.get(i) == list.get(i - 1))
				curr_count++;
			else {
				// checking if count is greater than previous current
				if (curr_count > max_count) {
					max_count = curr_count;
					res = list.get(i - 1);
				}
				curr_count = 1;
			}
		}
		// If last element is most frequent 
        if (curr_count > max_count) 
        { 
            max_count = curr_count; 
            res = list.get(n - 1); 
        } 
        return res;
	}
}
	public  class MostFreqRunner {
		public static void main(String[] args) {
			ArrayList<Integer>list = new ArrayList<Integer>();
			list.add(10);
			list.add(20);
			list.add(30);
			list.add(40);
			list.add(50);
			list.add(10);
			list.add(10);
			list.add(40);
			list.add(30);
			list.add(20);
			list.add(10);
			System.out.println(ListMostFreq.go(list));
		}
}
