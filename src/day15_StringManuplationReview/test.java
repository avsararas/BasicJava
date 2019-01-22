package day15_StringManuplationReview;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {

		Scanner keyb = new Scanner(System.in);

		System.out.println("Please enter Two Words:");
		String fW = keyb.nextLine();
		String sW = keyb.nextLine();

		int w2 = sW.length();

		String firstTwo = fW.substring(0, 2);
		System.out.println("First Two Letters of Word One: " + firstTwo);

		String lastTwo = sW.substring(w2 - 2);
		System.out.println("Last Two Letters of Word Two: " + lastTwo);

		System.out.println(firstTwo.equals(lastTwo));

		keyb.close();
	}
}