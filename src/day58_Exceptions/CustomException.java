package day58_Exceptions;

public class CustomException {
	
	// Extend either a Runtime, unchecked exception to have any custom exception
	
	// Or a Compile Time, checked exception to have any custom exception
	
	public static void main(String[] args) {

		BrainException e = new BrainException("Zort happened");
		throw e;
	}
}

class BrainException extends RuntimeException {

	public BrainException() {
		System.out.println("No Args");
	}

	public BrainException(String str) {

		super(str);
	}
}
