package day36_ArrayList;

import java.util.ArrayList;

public class ArrayListGeneral {
	
	public static void main(String[] args) {
		
// Any value, type of date can be added in the list
		
		ArrayList list = new ArrayList();
		
		list.add("jawa");
		list.add("mahmut");
		list.add("fadumo");
		list.add(789.5);
		list.add(true);
		
		System.out.println(list); // lists items in an array format
		
		System.out.println(list.size()); // lists number of items
		

		
	}

}
