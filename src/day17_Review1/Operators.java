package day17_Review1;

import java.util.Scanner;

public class Operators {
	public static void main(String[] args) {
		
		
		// Arithmetic + - / * %
		
		// Shorthand += -= /= *= %=
		
		// Increment - Decrement -- ++
		
		// Comparison 
		
		Scanner keyb = new Scanner(System.in);
		System.out.println("Please Enter the Distance in Miles: ");
		double dist = keyb.nextDouble();
		
		System.out.println("Please Enter your M/PH: ");
		double speed = keyb.nextDouble();
		
		double pace= (dist/speed)*60;
		
		System.out.println("It will take "+pace + " minutes to reach.");

	}
}
