package Redundant;

import java.util.Scanner;

public class HollowRectangle {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Height of the rectangle? ");
		int h = scan.nextInt();

		System.out.print("Width of the rectangle? ");
		int w = scan.nextInt();

		for (int j = 1; j <= h; j++) {
			
			for (int i = 1; i <= w; i++) {
				
				if (j == 1 || j == h || i == 1 || i == w) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		scan.close();
	}
}