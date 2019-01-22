package day13_ObjectStrings2;

import java.util.Scanner;

public class CheckWords {
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);

		System.out.println("Please Word 1 of 3:");
		String w1=scan.nextLine();
		
		System.out.println("Please Word 2 of 3:");
		String w2=scan.nextLine();
		
		System.out.println("Please Word 3 of 3:");
		String w3=scan.nextLine();
		
		int w1n = w1.length();
		int w2n = w2.length();
		int w3n = w3.length();
		
		if ((w1n==w2n) && (w2n==w3n)) {
			System.out.println("All Words have the same lenght");

		}else if ((w1n==w2n) || (w2n==w3n)|| (w1n==w3n)){
			System.out.println("Some Words have the same lenght");

		}else {
			System.out.println("No Words have the same lenght");

		}
		scan.close();
	}
}
