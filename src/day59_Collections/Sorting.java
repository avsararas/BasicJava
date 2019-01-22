package day59_Collections;

import java.util.*;

public class Sorting {
	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<>();
		
		list.add("Kamil");
		list.add("Behcet");
		list.add("Hubeyit");
		list.add("Zubeyir");
		list.add("Suayip");
		list.add("Zakire");
		list.add("Zuhtu");
		
		List<String> subby = list.subList(2, 5);
		
		System.out.println(subby);
		
		// update items
		for (int i = 0; i < subby.size(); i++) {
			subby.set(i, "zort");
		}

		System.out.println(list);


	}
}
