package day20_Loops;

import java.util.Random;
import java.util.Scanner;

public class GuessANumber2 {
	public static void main(String[] args) {

		Scanner keyb = new Scanner(System.in);

		Random rnum = new Random();

		int secret = rnum.nextInt(10);

		int guess;
		
		int times=0;

		do {
			System.out.println("Guess the Number between 1 to 10:");
			guess = keyb.nextInt();
			times++;

			if (guess == secret) {
				System.out.println("You won " +guess+" was correct!");
				break;
				
			} else if (guess > secret){
				System.out.println("Too Large, "+ (-(times-3))+" tries left");
			}else {
				System.out.println("Too small, "+ (-(times-3))+" tries left");
			}
			
			if (times == 3) {
				System.out.println("Game Over, the number was " + secret);
				break;
			}

		} while (secret != guess && times<=3);
		
		
		keyb.close();
	}
}
