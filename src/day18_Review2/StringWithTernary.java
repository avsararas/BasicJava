package day18_Review2;

import java.util.Scanner;

public class StringWithTernary {
	public static void main(String[] args) {
		
		Scanner keyb = new Scanner(System.in);
		System.out.println("Enter a Word");

		String word = keyb.nextLine();
		
		String invalid= "Too Short Entry";
		
		String more= "More than 2 chars entered";
		
		String startu= "Starting with U";
		
		String no= "no";
		
		
		// Nested ternary condition
		
		String result = word.length() < 1 ? word.length() == 2 ? word.charAt(0)== 'U'?  invalid : more : startu : no;
		
		System.out.println(result);
		
	
		
		keyb.close();
	}

}
