package Assignments;

import java.util.Scanner;

public class ArraysSplitEmail {

	public static void main(String[] args) {

	//	Given a String variable email, write code using split method 
	//	to print email id and domain in separate lines.

		
		Scanner input = new Scanner(System.in);
	    String email = input.nextLine();
	    
	    String[] split = email.split("@");
	    
	    
	    if (split.length==2) { // check if there is only one @
	    	System.out.println("Email id: "+split[0]);
		    
		    System.out.println("Email domain: "+split[1]);
		}else {
		    System.out.println("invalid email");

		}
	    
	    input.close();
	    
	}

}
