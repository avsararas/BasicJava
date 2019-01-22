package day07_Conditonals;

public class IfElse {
	public static void main(String[] args) {
		
		double coffePrice = 5.50;
		double wallet = 5;
		
		if (coffePrice<wallet) {
			
			System.out.println("buy");
		}else {
			System.out.println("no buy");
		}
		
		int speedlimit, currentspeed;
		
		speedlimit= 55;
		currentspeed= 75;
		
		if (currentspeed>=speedlimit+20) { // >= needs here to include 75
			
			System.out.println("too fast");
		}else {
			System.out.println("too slow");

		}
		
	}

}
