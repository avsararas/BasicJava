package Assignments;

import java.util.Scanner;

public class ArrayFirstandLast {
	public static void main(String[] args) {

//	Given a String array words, iterate through each word 
//	and print first and last letter of each element in separate lines.

		Scanner input = new Scanner(System.in);

		String[] words = { input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine() };

		int counter = 0;

		for (String items : words) {

			counter++;

			System.out.println(words[counter - 1].charAt(0) + "" + words[counter - 1].charAt(items.length() - 1));

		}
		input.close();
	}
}