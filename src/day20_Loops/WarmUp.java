package day20_Loops;

import java.util.Scanner;

public class WarmUp {
	public static void main(String[] args) {

		Scanner keyb = new Scanner(System.in);

		System.out.println("Please Enter Two Numbers:");

		int start = keyb.nextInt();

		int end = keyb.nextInt();

		// Counting from start to end and vice versa depending on the numbers
		if (start < end) {
			System.out.println("Count Forward");
			while (start <= end) {
				System.out.println("Step " + start);
				start++;
			}
		} else if (start > end) {
			System.out.println("Count Backwards");
			while (start >= end) {
				System.out.println("Step " + start);
				start--;
			}
		} else {
			System.out.println("Two Numbers are Equal");

		}
		keyb.close();
	}
}
