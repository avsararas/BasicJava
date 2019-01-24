package day60_Collections;

import java.util.*;

public class UniqueVals {
	
	public static void main(String[] args) {
		
		// print uniquee values
		
		ArrayList<String> liste = new ArrayList<>();
		
		liste.add("Hubeyit");
		liste.add("Behcet");
		liste.add("Hubeyit");
		liste.add("Zubeyir");
		liste.add("Suayip");
		
		// Using loop, no need to compare items for duplicates
		Set<String> set = new HashSet<>();
		
		for (int i = 0; i < liste.size(); i++) {
			set.add(liste.get(i));
		}
		
		System.out.println(set.size());
		
		
		
		// without loop
		TreeSet<String> names = new TreeSet<>();
		
		names.addAll(liste);
		
		System.out.println(names);

		
	}

}
