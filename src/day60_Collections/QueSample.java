package day60_Collections;

import java.util.*;

public class QueSample {
	public static void main(String[] args) {
		
	// used for adding and removing items
		
	Queue<Integer> kuy = new PriorityQueue<>();
	
	kuy.add(34);
	kuy.add(6);
	kuy.add(7);
	kuy.add(2);
	kuy.add(99);
	kuy.add(15434);
	kuy.add(333);
	kuy.add(21);
	kuy.add(9);

	System.out.println(kuy);
	
	kuy.remove(); // removes 2
	kuy.remove(); // removes 6
	
	//Removes first one first out FIFO
	System.out.println(kuy);
	
	}
}
