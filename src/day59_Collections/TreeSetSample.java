package day59_Collections;

import java.util.*;

public class TreeSetSample {
	public static void main(String[] args) {

		// there is no index in a Set, Iterator needs to be used
		Set<Integer> list = new TreeSet<>();

		list.add(324);
		list.add(89);
		list.add(32);
		list.add(111);
		list.add(111);
		list.add(111);
		list.add(56);
		list.add(89);

		// TreeSet sorts by itself
		System.out.println(list);

		TreeSet<String> names = new TreeSet<>();

		names.add("Kamil");
		names.add("Hubeyit");
		names.add("Hubeyit");
		names.add("Zubeyir");
		names.add("Suayip");
		names.add("Zakire");

		Iterator<String> ity = names.iterator();
		
		for (String each : names) {
			System.out.print(each+" ");

		}
		
		System.out.println("");

		while (ity.hasNext()) {

			System.out.print(ity.next() + " ");

		}
		
		SortedSet<String> taily = names.tailSet("Hubeyit");
		
		System.out.println(taily);
	}
}
