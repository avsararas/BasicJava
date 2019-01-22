package day41_Encapsulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HouseArrayList {
	
	public static void main(String[] args) {
		
		House h4 = new House(); // House is the new data type like int, double and String
		
		h4.address = "2204 Zimbabwe Rd.";
		h4.bedroms = 1;
		h4.type = "Tent";
		h4.year = 1999;
		
		House h5 = new House();
		
		h5.address = "67 Balat Yolu.";
		h5.bedroms = 5;
		h5.type = "Mezbele";
		h5.year = 1945;
		
		// Define an ArrayList for House class objects
		
		ArrayList<House> HouseList = new ArrayList <>();
		
		HouseList.add(h4);
		HouseList.add(h5);
		
		// Adding all to ArrayList
		
		ArrayList<House> HouseList2 = new ArrayList<>(Arrays.asList());
		
		
		
		// Print year of each house if year is between 1900 and 2000
		
		for(House house : HouseList) {
			if (house.year >= 1900 && house.year <=2000) {
				
				System.out.println(house.year+" "+house.address);
			}
		}
		
		for (int i = 0; i < HouseList.size(); i++) {
			
			
			System.out.println(HouseList.get(i).year); // takes years in the ArrayList
			
		}
	}
	
	

}
