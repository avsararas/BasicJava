package day21_Loops;

import java.util.Scanner;

public class WarmUp {
	public static void main(String[] args) {

		// Accept a string and if it is palindrome, print "Palindrome",
		// if not print "Not Palindrome"

		Scanner keyb = new Scanner(System.in);

		System.out.println("Please enter a word:");

		String word = keyb.next();

		String reverse = "";

		int index = 0;

		for (index = word.length()-1; index >= 0; index--) { // Counting Reverse

			reverse = reverse + word.charAt(index);
		}
		if (word.equalsIgnoreCase(reverse)) {
			System.out.println("Word is a Pallendrome");
		} else {
			System.out.println("Word is not a Pallendrome");
		}

		keyb.close();
	}
}
