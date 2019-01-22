package day59_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedCollection {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		list.add(324);
		list.add(89);
		list.add(32);
		list.add(111);
		list.add(56);
		list.add(89);
		list.add(2);
		list.add(0);
		list.add(890);
		list.add(-54);
		list.add(-322);
		
		System.out.println(list);
		
		Collections.sort(list); // sorting objects

		System.out.println(list);
		
		Collections.frequency(list, 89); // shows times of ocurrance

	}
}
