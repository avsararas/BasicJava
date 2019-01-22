package day08_Conditionals2;

import java.util.Scanner;

public class Voter {
	public static void main(String[] args) {
		
		Scanner keyb= new Scanner(System.in);

		System.out.println("Enter Your Age: ");
		
		int age=keyb.nextInt();
		
		if (18<=age) {
			
			System.out.println("You can vote" );
			
		}else {
			System.out.println("You cannot vote" );
			}
		
		keyb.close();
	}
}
