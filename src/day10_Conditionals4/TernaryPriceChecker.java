package day10_Conditionals4;

import java.util.Scanner;

public class TernaryPriceChecker {
	public static void main(String[] args) {
		Scanner keyb= new Scanner(System.in);
		System.out.println("Enter Price: ");
		
		int price=keyb.nextInt();
		
		String say;
		
		say= (price>=1 && price<=50) ? "Cheap" : 
				(price>=51 && price<=100) ? //Second ? comes here
						"Expensive":       //Second option
							"Not Buying"; // Third response
		
		System.out.println(say);
		keyb.close();
		
	}

}
