package day59_Collections;

import java.util.*;

public class SubListSample {
	public static void main(String[] args) {
		
		// asList method creates an unmodifiable list
		List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,3,2,4);
		
		// list1.remove(3); // will not work
		
		List<Integer> list2 = new ArrayList<>();
		
		list2.add(324); list2.add(32); list2.add(111); list2.add(56); list2.add(89);
		list2.add(2);list2.add(45);list2.add(890);list2.add(54);list2.add(322);
		
		// sub list takes a view of a defined range
		List<Integer> sub = list2.subList(1, 4);
	
		System.out.println(sub);
		
		sub.set(2, 9999999);
		
		System.out.println(sub);
		
		// changes the original list
		System.out.println(list2);

	}
}
