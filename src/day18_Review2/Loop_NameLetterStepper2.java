package day18_Review2;

import java.util.Scanner;

public class Loop_NameLetterStepper2 {
	public static void main(String[] args) {

		Scanner keyb = new Scanner(System.in);

		System.out.println("What was your name?");

		String entry = keyb.nextLine();

		for (int i = 0; i < (entry.length()); i++) {
			for (int chars = 0; chars < (entry.length()) - Math.abs((entry.length()) - i); chars++) {
				System.out.print(entry + " ");
			}
			System.out.println(entry);
		}
		keyb.close();
	}
}
