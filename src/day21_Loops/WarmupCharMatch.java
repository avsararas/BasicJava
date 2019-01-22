package day21_Loops;

import java.util.Scanner;

public class WarmupCharMatch {
	public static void main(String[] args) {

		Scanner keyb = new Scanner(System.in);

		System.out.println("Please enter a word:");

		String word = keyb.next().toLowerCase(); // Convert it to lower case in chain method
		
		System.out.println("Please enter a character:");
		
		char ch = keyb.next().charAt(0);
		
		int counter = 0;

		for (int index = 0; index < word.length(); index++) {

			if (ch == word.charAt(index)) {
				counter++;
			}
		}

		System.out.println("Character " + ch + " appeared " + counter + " times.");
	
	keyb.close();
	}
}