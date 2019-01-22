package day55_Polymorphism;

public class HolidayRun {
	
	public static void main(String[] args) {
		
		Holiday c1 = new Xmas();
				
		Holiday n1 = new NewYear();
		
		c1.sendMessage();
		
		Xmas zarta = (Xmas) c1; // casting 
		
		zarta.exchangeGifts();
		
		((Xmas) c1).exchangeGifts(); // casting
		
		n1.sendMessage();
		
		dayOff off= new Xmas(); // interface can create an object
		
		off.goToVacation();
	
	}

}
