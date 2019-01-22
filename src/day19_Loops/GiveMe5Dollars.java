package day19_Loops;

import java.util.Scanner;

public class GiveMe5Dollars {
	public static void main(String[] args) {
		
		Scanner keyb = new Scanner(System.in);
		
		int amount;
		
		int tries=0;
		
		do {
			
			if (tries<3) {
				
				System.out.println("Hey dude gimme $5");
			
			}
			amount=keyb.nextInt();
			
			tries++;
			
			if (tries==4)
				
				System.out.println("You are shot!");

		} while (amount!=5);		
		
		System.out.println("Thank you bro!");
		
		keyb.close();
	}
}
