package day36_ArrayList;

import java.util.ArrayList;

public class RestrictedArrayList {

	public static void main(String[] args) {

// Restricted array list

		ArrayList<String> people;
		people = new ArrayList<>();

		ArrayList<String> names = new ArrayList<String>();

		names.add("Abraham");
		names.add("Hubeyit");
		names.add("Zikrullah");
		names.add("Sumeyye");
		names.add("Fodumoto");
		
		System.out.println(names);
		//or
		System.out.println(names.toString());
		
		System.out.println(names.get(2)); // get a specific name in the index
		
		System.out.println(names.get(names.size()-1)); // gives the last name dynamically
		
// Remove an element from the list
		
		names.remove(0);
		// or
		names.remove("Sumeyye");
		
		System.out.println(names);
	}

}
