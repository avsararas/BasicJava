package day20_Loops;

import java.util.Random;
import java.util.Scanner;



public class GuessANumber {
	public static void main(String[] args) {

		Scanner keyb = new Scanner(System.in);

		Random rnum = new Random();

		int secret = rnum.nextInt(100);

		int guess;
		
		do {
			System.out.println("Guess the Number between 1 to 10:");
			guess = keyb.nextInt();

			if (guess == secret) {
				System.out.println("You Won!");
			} else if (guess > secret){
				System.out.println("Too Large.");
			}else {
				System.out.println("Too small");

			}

		} while (secret != guess );
		
		keyb.close();
	}
}
