package day15_StringManuplationReview;

import java.util.Scanner;

public class StringWordLetters {
	public static void main(String[] args) {
		
		Scanner keyb = new Scanner(System.in);

		System.out.println("Please Enter Two Words: ");

		String w1 = keyb.nextLine();
		String w2 = keyb.nextLine();
		
		int len1=w1.length();
		
		char last=w1.charAt(len1-1);
		char first=w2.charAt(0);
		
		System.out.println("First word has "+len1+" letters.");
		System.out.println("First word has "+last+" on the last letter.");
		System.out.println("Last word has "+first+" on the first letter.");

		keyb.close();
	}
}
