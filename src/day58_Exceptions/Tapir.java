package day58_Exceptions;

public class Tapir {
	
	// If super class throws interrupted exception, subclass cannot throw a new or broader
	// exception, or not throw at all

	public void move() throws Exception {

	}
}

class Organism {
	public void move() throws InterruptedException{ // superclass exception
		
		
	}
}
