package day15_StringManuplationReview;

import java.util.Scanner;

public class OddEvenWord {
	public static void main(String[] args) {
		Scanner keyb = new Scanner(System.in);

		System.out.println("Please A Word to See Odd or Even: ");

		String word = keyb.nextLine();
		
		boolean oddy= word.length()%2==1 ;
		
		if (oddy=true) {
			System.out.println(word+ " is Even");

		}else {
			System.out.println(word+ " is Odd");
		}
		
		System.out.println(word.substring(0, 3)); // shows the middle chars
		
		keyb.close();
	}
}
