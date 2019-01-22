package day4_Operators;

import java.util.Scanner;

public class ageScanner {
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter your birth year below: ");

		// next will make the program wait for user input during runtime
		int yearOfBirth = scan.nextInt();
		
		int year = 2018;
		
		System.out.println("Your age is: " + (year- yearOfBirth));
		
		scan.close();
		
	}

}
