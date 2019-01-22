package Assignments;

import java.util.Scanner;

public class ReverseSentence {

	public static void main(String[] args) {
		// Given a String variable sentence, write code to type 
		// each word in separate lines in a reverse order.

		Scanner input = new Scanner(System.in);
	    String sentence = input.nextLine();
	    
	    String parted[] = sentence.split(" ");
	    
	    for (int i = parted.length-1 ; i >= 0 ; i--) {
			
		    System.out.println(parted[i]);

		} 
	    input.close();
	}
}
