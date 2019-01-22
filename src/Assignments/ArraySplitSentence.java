package Assignments;

import java.util.Scanner;

public class ArraySplitSentence {

	public static void main(String[] args) {
		
		//Given a String variable sentence, write code to type each word in separate lines.

		  Scanner input = new Scanner(System.in);
		  
		  String sentence = input.nextLine();
		  
		  String split[]= sentence.split(" "); // Make a new array by splitting the sentence input
		  
		  for (String part : split) {
			
			  System.out.println(part); // print each part pulled from the split array
		}
		input.close();
	}
}
