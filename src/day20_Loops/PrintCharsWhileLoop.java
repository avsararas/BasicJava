package day20_Loops;

import java.util.Scanner;

public class PrintCharsWhileLoop {
	public static void main(String[] args) {

		Scanner keyb = new Scanner(System.in);

		System.out.println("Enter a Word:");

		String word = keyb.next(); //next takes first word only unlike nextln

		int index = 0;

		while (index < word.length()) {

			System.out.println(word.charAt(index));
			index++; // Comes to the next letter
		}
		
		
		
		keyb.close();
	}
}
