package day18_Review2;

import java.util.Scanner;

public class Strings3 {
	public static void main(String[] args) {
		
		Scanner keyb = new Scanner(System.in);
		System.out.println("Enter a County to abbreviate");

		String count = keyb.nextLine();
		
		// using substring and to uppercase - method chaining

		System.out.println(count.substring(0, 2).toUpperCase());
		
		keyb.close();
	}

}
