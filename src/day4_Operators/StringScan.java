package day4_Operators;

import java.util.Scanner;

public class StringScan {
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("What is you name?");
		
		String name=scan.nextLine();
		
		System.out.println("You are "+ name);
		
		scan.close();

	}

}
