package day18_Review2;

import java.util.Scanner;

public class Strings2 {
	public static void main(String[] args) {

		Scanner keyb = new Scanner(System.in);
		System.out.println("Please a Word: ");

		// Enter a word and compare first-last letters to be same or not.

		// Then do the same for the second characters by the first and last
		
		// Done with nested ifs

		String word = keyb.nextLine();

		int lange = word.length();

		char first = word.charAt(0);

		char last = word.charAt(lange - 1);

		String say1 = "";

		String say2 = "";

		if (lange >= 4) {

			if (first == last) {
				say1 = "First and Last letters are the same";
			} else {
				say1 = "First and Last letters are not the same";
			}

			if (word.charAt(1) == word.charAt(lange - 2)) {
				say2 = "Also, Second and one before last letters are the same";

			} else {
				say2 = "Also, Second and one before last letters are not the same";
			}
		} else {
			System.out.println("Too Short Word Entered");

		}
		System.out.println(say1 + "\n" + say2);

		keyb.close();
	}
}
