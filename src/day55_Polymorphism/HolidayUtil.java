package day55_Polymorphism;

public class HolidayUtil {
	
	static void sendMessage(Holiday h) { // getting object here in the method
		
		System.out.println("Utility message");
		h.sendMessage();
	}
	
	static void sendMessage(dayOff z) { // calling interface
		
		z.goToVacation(); // calling interface method
	}
	
	public static void main(String[] args) {
		
		sendMessage(new Xmas()); // pass objects with below method

		
		Holiday h2 = new Holiday(); // new object
		
		System.out.println();
		
		
	}
}
