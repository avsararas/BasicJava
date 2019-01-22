package Assignments;

import java.util.Scanner;

public class ArrayFirstLast2 {

	public static void main(String[] args) {
//		Given a String array words, iterate through each word 
//		and print first and last letter of each element in the format below.
//      [ho, wy, by, ae, ne] 
		
		
		Scanner input = new Scanner(System.in);
	    String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
	
	    String say="";
	    
	    int counter=0;	
	    
	    System.out.print("["); // O
	    
	    for (int i = 0; i < words.length; i++) {
	
				say=words[i].charAt(0) + "" + words[i].charAt(words[i].length() - 1);
				
				counter++;
	    	
				if (5!=counter) {
					System.out.print(""+say+", ");

					
				}else {
					System.out.print(say+"");
				}
	    	}
	    
	    System.out.print("]");
	    input.close();
	}
}
