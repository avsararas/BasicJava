package day32_Methods3;

import java.util.Scanner;

public class WeekDayValid {
	
	public static void main(String[] args) {
		
		System.out.println(validDay());
	}
	
	
	public static boolean validDay() {
				
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a Weekday:");
		
		String enter=scan.next();
		
		if (enter.equals("Monday") || enter.equals("Tuesday") || enter.equals("Wednesday")|| 
				enter.equals("Thursday")|| enter.equals("Friday")|| enter.equals("Saturday") || 
				enter.equals("Sunday")) {
			
			return true;
		}else {
			return false;
		}
		
		
	}

}
