package day08_Conditionals2;

import java.util.Scanner;

public class MultiCondition {
	public static void main(String[] args) {
		
		Scanner keyb= new Scanner(System.in);
		System.out.println("Enter Weekday Number: ");
		
		int weekday=keyb.nextInt();

		if(weekday ==1) {
			System.out.println("It is Monday");
		}
		else if(weekday ==2) {
			System.out.println("It is Tuesday");
		}
		else if(weekday ==3) {
			System.out.println("It is Wednesday");
		}
		else if(weekday ==4) {
			System.out.println("It is Thursday");
		}
		else if(weekday ==5) {
			System.out.println("It is Friday");
		}
		else if(weekday ==6) {
			System.out.println("It is Saturday");
		}
		else if(weekday ==7) {
			System.out.println("It is Sunday");
		}
		else {
			System.out.println("Please enter a number between 1-7");
			
		}
	}
}
