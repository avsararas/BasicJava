package day37_ArrayList2;

import java.util.ArrayList;

public class Cities {
	public static void main(String[] args) {
		
		ArrayList<String> cities = new ArrayList<String>();
		
		cities.add("Cincinnati");
		cities.add(1,"Gary"); // order number assigned 1
		cities.add("Dayton");
		cities.add(0,"Atlanta"); // order number assigned 0
		cities.add("Cleveland");
		cities.add("Missouri");
		cities.add("Detroit");
		cities.add("Flint");
		cities.add("Memphis");
		cities.add("Youngstown");
		cities.add("Toledo");
		cities.add("Jackson");
		cities.add("Kalamazoo");
		cities.add("Baltimore");
		cities.add("Camden");
		
		System.out.println(cities.size());
		
		for (int i = 0; i < cities.size(); i++) { // for loop print
			System.out.print(cities.get(i)+" ");
		}
		
		for (String city : cities) { // for each loop print
			System.out.print(city+" | ");	
		}
		
		
		// Add cities to a new Array List
		
		ArrayList<String> longNames = new ArrayList<String>();
		
		for (String city : cities) {
			
			if (city.length() > 6) { // Search cities with 8 char or longer
				longNames.add(city); // Put them in the new array
			}
		}
		
		longNames.clear(); // deletes all items for the loop below
		
		for (int i = 0; i < cities.size(); i++) {
			if (cities.get(i).length() > 6) {
				
				longNames.add(cities.get(i));
			}
		}
		
		
		System.out.println();
		System.out.print(longNames.isEmpty());
		System.out.println();
		System.out.println(longNames); 
		
	}

}
