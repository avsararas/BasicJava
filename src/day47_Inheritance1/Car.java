package day47_Inheritance1;

public class Car extends Vehicle { // inherited from Vehicle class
	
	int hp; // exclusive variable to Car class only
	
	public void doDrift() { // exclusive method for Car class
		
		System.out.println("Making ugly noises");
	}

}
