package day11_Swtich;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		
		Scanner keyb= new Scanner(System.in);
		System.out.println("Enter Grade: ");
		
		char grades=keyb.next().charAt(0); // specific way to get char scanner
		
		switch (grades) {
		
		case 'A':
		case 'a': 
			
			System.out.println("Excellent");
			break;
		
		case 'B':
		case 'b':
			
			System.out.println("Good");
			break;
			
		case 'C':
		case 'c':
			
			System.out.println("Acceptable");
			break;
			
		case 'D':
		case 'd':
			
			System.out.println("Poor");
			break;
			
		default: System.out.println("Not a Valid Grade Entered");
		}
		keyb.close();
	}

}
