package day60_Collections;

import java.util.*;

public class ListConvert {
	public static void main(String[] args) {

ArrayList<String> liste = new ArrayList<>();
		
		liste.add("Hubeyit");
		liste.add("Behcet");
		liste.add("Hubeyit");
		liste.add("Zubeyir");
		liste.add("Suayip");
		liste.add("Angutyo");

		
		// coversion is done at the end within constrcutor of HashSet
		Set<String> liste2 = new HashSet<>(liste);
		
		System.out.println(liste2);
		
		// TreeSet also orders the list under SortedSet interface
		SortedSet<String> sorted = new TreeSet<>(liste);
		
		System.out.println(sorted);

	
	}
}
