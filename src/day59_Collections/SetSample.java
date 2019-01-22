package day59_Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetSample {
	public static void main(String[] args) {
		
		Set<Integer> numSet = new HashSet<>();
		
		// dupicates will be removed in a set
		numSet.add(24); numSet.add(24); numSet.add(76); numSet.add(98); numSet.add(90);

		System.out.println(numSet);

		Iterator<Integer> ity = numSet.iterator();
		
		while( ity.hasNext() ) {
			
			System.out.print(ity.next()+" ");
			
		}
		
	}
}
