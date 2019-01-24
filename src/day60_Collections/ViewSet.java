package day60_Collections;

import java.util.*;

public class ViewSet {
	public static void main(String[] args) {

		SortedSet<String> setlist = new TreeSet<>();

		setlist.add("A");
		setlist.add("A");
		setlist.add("Z");
		setlist.add("F");
		setlist.add("3");
		setlist.add("H");

		System.out.println(setlist);

		System.out.println(setlist.subSet("3", "H"));
		
		System.out.println(setlist.headSet("Z"));
		
		System.out.println(setlist.tailSet("3"));


	}

}
