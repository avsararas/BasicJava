package Assignments;

import java.util.Scanner;

public class ReverseSentence2 {
	
	// Reverse Java is fun

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	    String sentence = input.nextLine();
	    
	    String reversed = "";
	    
	    String parted[] = sentence.split(" ");
	    	    
	    for (int i = parted.length-1; i >= 0; i--) {
			
	    	reversed=reversed+parted[i]+" ";
		}
	    
	   reversed=reversed.substring(0, reversed.length()-1);
	    
	   System.out.println(reversed);
	    
	   input.close();	
	}
}
