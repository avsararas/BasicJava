package day40_CustomClasses;

public class CellPhone { // needs to be created outside a method
	// cell phone properties
	
		String brand;
		String color;
		double price;
		
		// behavior / methods
		
		public void call () {   // not static used to make objects work
		System.out.println("calling..");

		}
		
		public void text () {
			System.out.println("texting..");

		}
	}