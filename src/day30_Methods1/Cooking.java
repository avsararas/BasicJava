package day30_Methods1;

public class Cooking {

	public static void main(String[] args) {
	
	cook("Kabobopob");
	youWillNeed("meat, salt, oil");
	cookFor(10, "well done"); // takes one int and one String
	ready();
	}
	

// cook method accepts String food name and prints
// "We are cooking foodName"
		
		public static void cook(String foodName) {
			System.out.println("We are cooking "+foodName);
		}
		
// youWillNeed method accepts a String with ingredients
// "We need the following items"
		
		public static void youWillNeed(String items) {
			System.out.println("We need the following items: "+items);
		}
		
// cookFor method accepts duration and wayOfCooking
// "You need to cook for minutes by wayOfCooking"
		
		public static void cookFor(int minutes, String style) {
			System.out.println("You need to cook for "+minutes+" do "+style);
		}
		
// ready method does not accept any parameters
// prints: "Meal is ready! Enjoy!"
		
		public static void ready() {
			System.out.println("Meal is ready! Enjoy");
		}
	
	
	
	
	

}
