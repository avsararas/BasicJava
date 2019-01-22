package day08_Conditionals2;

import java.util.Scanner;

public class Warmup {
	public static void main(String[] args) {
		
		Scanner keyb= new Scanner(System.in);

		System.out.println("Enter Your Pin: ");
		
		int pin=keyb.nextInt();
		
		if (pin==123456) {
			
			System.out.println("Access Granted" );
			
		}else {
			System.out.println("Access Denied" );
			}
		
		System.out.println("Enter the number: ");
		int number=keyb.nextInt();
		
		if (number%2==0) { //making sure it is divisible to 2 and 0 remains
			
			System.out.println(number+" is an even Number" );		
		}else {
			System.out.println(number+" is an odd Number" );
			}
		keyb.close();
	}
}
