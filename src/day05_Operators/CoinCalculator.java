package day05_Operators;

import java.util.Scanner;

public class CoinCalculator {
	public static void main(String[] args) {
		
		Scanner keyb= new Scanner(System.in);
		System.out.println("Enter Total Cents: ");

		int pennies= keyb.nextInt();
		keyb.close();

		int dollars=pennies/100;
		pennies%=100; //remainder operator
		
		int quarters=pennies/25;
		pennies%=25; // pennies= pennies%60
		
		int dimes=pennies/10;
		pennies%=10;
		
		int nickels=pennies/5;
		pennies%=5;
		
		System.out.println("You have "
		+dollars +" dollars " 
		+quarters+" quarters " 
		+dimes+ " dimes "
		+nickels+ " nickels and "
		+pennies+ " cents ");
		
	}
}
