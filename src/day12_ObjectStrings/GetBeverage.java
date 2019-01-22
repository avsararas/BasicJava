package day12_ObjectStrings;

import java.util.Scanner;

public class GetBeverage {
	public static void main(String[] args) {
		
		Scanner keyb= new Scanner(System.in);
		System.out.println("Enter Your Drink: ");
		
		String drink=keyb.next();
		
		double total = 0;
		
		switch(drink) {
		
		case "tea":
		case "Tea":
			total=3;
			break;
		case "coffee":
		case "Coffee":
			total=4;
			break;
		case "water":
		case "Water":	
			total=5;
			break;
		case "juice":
		case "Juice":
			total=6;
			break;
		default:
			System.out.println("Invalid Input");
		}
		System.out.println("Your Price is $"+total);
		keyb.close();
	}
}