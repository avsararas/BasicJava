package day21_Loops;

import java.util.Scanner;

public class Neighbours {
	public static void main(String[] args) {

		// Check all characters in a word, same chars next to other say "beeb"

		Scanner keyb = new Scanner(System.in);

		System.out.println("Please enter a word:");

		String word = keyb.next().toLowerCase();

		for (int n = 0; n < word.length() - 1; n++) {

			if (word.charAt(n) == word.charAt(n + 1)) { // look at each letter and compare the next

				System.out.println("Beep on position "+n+" for " + word.charAt(n));
			}
		}
		keyb.close();
	}
}
