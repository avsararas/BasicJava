package day59_Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorSample {

	public static void main(String[] args) {

		List<Integer> liste = new ArrayList<>();

		liste.add(11);
		liste.add(21);
		liste.add(44);
		
		// Iterator object for iterating
		Iterator<Integer> myIter = liste.iterator();
		
		System.out.println(myIter.hasNext());
		
		// while (myIter.hasNext()) { // will take the cursor to the end and other
		// System.out.println(myIter.next()); // while will not work correctly
		// }
		
		while (myIter.hasNext()) {

			int target = myIter.next();
			if (target>16) {
				myIter.remove();
				
			}
		}
		
		System.out.println(liste);
		
	}
}
