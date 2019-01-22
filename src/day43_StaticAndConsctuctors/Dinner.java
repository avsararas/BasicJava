package day43_StaticAndConsctuctors;

public class Dinner {
	
	// Instance vs Static Variable
	
	// Instance variables belong to objects. Theay are not shared.
	// Static 

	
	public static int pizzaSlice = 8; // int is shared between all objects
	
	public int pizzaPiece = 8; // in is not shared between objects
	
	public void takeSlice() { // non-static method
		
		pizzaSlice--;
		pizzaPiece--;
	}
	
	public void takeSlice(int num) { // non-static method
		pizzaSlice -= num; // subtract pizza from total
		pizzaPiece -= num; // subtract pizza from total
		
	}
}
