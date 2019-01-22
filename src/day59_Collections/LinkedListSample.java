package day59_Collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListSample {
	
	public static void main(String[] args) {
		
		// using super type through polymorphism
		Collection<String> liste = new LinkedList<>();

		liste.add("sopa");
		liste.add("takoz");
		liste.add("gurz");
		liste.add("musur");
		
		// Below iterator object is needed to remove objects without index
		Iterator<String> ity = liste.iterator();
		
		while (ity.hasNext()) {
			
			if (ity.next().contains("a")) {
				ity.remove();
			}
		}
		
		System.out.println(liste);

	}
}
