package day32_Methods3;

import java.util.*;

public class GuessTheNumber {
	
	public static void main(String[] args) {
		
		
		playGuessComp();
	}

	
	
	public static void playGuessComp() {
		Random rand = new Random();
		
		int secNum = rand.nextInt(21);
		
		int counter=0;
		
		int limit=10;
		
		do {
			counter++;

			int guessNum=rand.nextInt(21);

			System.out.println("Guessing " + guessNum+" and "+secNum);
			
			if (guessNum==secNum) {
				
				System.out.println("Found");
				break;
			}else {
				System.out.println("Wrong");
			}
			
		} while (limit!=counter);
		
		System.out.println("Tried :"+counter);
	}
}
