package day60_Collections;

import java.util.*;

public class DequeSample {
	public static void main(String[] args) {
		
		// used for adding and removing items
			
		Deque<Integer> deq = new ArrayDeque<>();
		
		deq.add(34);
		deq.add(6);
		deq.add(7);
		deq.add(8);
		deq.add(99);
		deq.add(5434);

		System.out.println(deq);
		
		deq.removeLast(); // removes 5434
		deq.removeLast(); // removes 99
		
		//Removes last one first out LIFO
		System.out.println(deq);

}
}