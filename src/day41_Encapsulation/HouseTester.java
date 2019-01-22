package day41_Encapsulation;

public class HouseTester {
	
	public static void main(String[] args) {
		// 1- Set House object and assign data to fields/ instance variables		
		House housey = new House();
		housey.type= "Cave";
		housey.address="100 Niagara Falls Dr. Buffalo NY 10298";
		housey.bedroms=1;
		housey.year=432;
		
		// 2- Pass house objects to printHouseInfo method
		printHouseInfo(housey);
		
		House homey = new House();
		homey.type= "Tent";
		homey.address="Anywhere";
		homey.bedroms=1;
		homey.year=2018;
		
		printHouseInfo(homey);
		
		// Call house address property only
		System.out.println(buildHouse("Bungalo","Forest",3,1976).address);
		
		// Make another object and assign properties through the method
		House newCave = buildHouse("Humid Basement", "Cincinnati", 2, 1954);
		
		System.out.println(newCave.address);
		
		// Print using printer Method below 
		printHouseInfo(newCave);

	}
	
	public static void printHouseInfo(House houseObj) { // new method
		System.out.println("-------------");
		System.out.println("Type: "+houseObj.type);
		System.out.println("Address: "+houseObj.address);
		System.out.println("Bedrooms: "+houseObj.bedroms);
		System.out.println("Year: "+houseObj.year);
		System.out.println("-------------");
		
	}
	
	// Method returns and object called cave
	public static House buildHouse(String type, String address, int rooms, int year) {
		
		House cave = new House();
		cave.type= type; // will be entered in the main method
		cave.address=address;
		cave.bedroms=rooms;
		cave.year=year;
		
		return cave;
		
	}
}
