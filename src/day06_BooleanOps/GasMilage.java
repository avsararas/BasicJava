package day06_BooleanOps;

import java.util.Scanner;

public class GasMilage {
	public static void main(String[] args) {
		
		Scanner keyb= new Scanner(System.in);
		
		System.out.println("Current Odometer: ");
		int co=keyb.nextInt();
		
		System.out.println("Prevoious Odometer: ");
		int po=keyb.nextInt();
		
		System.out.println("Gas Added to Tank: ");
		int ga=keyb.nextInt();
		
		System.out.println("Gas Price: ");
		double gp=keyb.nextDouble();
		
		double mpg=((co-po)/ga);

		System.out.println("Your MPG is " +mpg +" gallons" ); 
		
		System.out.println("Your Fuel Cost is $" +(ga*gp) +" " ); 

		keyb.close();
	}
}
