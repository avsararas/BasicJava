package day21_Loops;

import java.util.Scanner;

public class UniqueChars {
	public static void main(String[] args) {
		
		// Accept string and print only unique chars in it
		// java --> jav only since a is already present
		
		Scanner keyb = new Scanner(System.in);

		System.out.println("Please enter a word:");
		
		String word = keyb.next().toLowerCase();
		
		String uniq="";
		
		for (int index=0 ; index < word.length() ; index++) {
			
			//System.out.println(word.substring(index, index+1));
			
			String letter = word.substring(index,index+1);
			
			if (!uniq.contains(letter)) {
				
				uniq += letter;
				
			}
		}
		
		System.out.println(uniq);
		
		keyb.close();
	}
}
