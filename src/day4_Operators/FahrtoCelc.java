package day4_Operators;

import java.util.Scanner;

public class FahrtoCelc {
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter the Temp in F: ");

		// asking for an integer only to be entered
		int fah= scan.nextInt();
		
		scan.close();

		double cel = (fah-32)/(1.8);
		
		//rounding is here
		
		int result = (int) Math.round(cel);

		System.out.println("Temp in Celcius is: " + result);
	
	}

}
