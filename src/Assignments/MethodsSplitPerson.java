package Assignments;

import java.util.Scanner;

public class MethodsSplitPerson {
	
	public static void main(String[] args) {
	    
		Scanner inp = new Scanner(System.in);
	    
	    String s = inp.next();
	    
	    person(s) ;
	    
	    inp.close();
	  }
	  
	   public static void person(String info) {
		
		   
		   String part[]=info.split(",");
				   
		   System.out.print("person name: "+part[0]);
		   System.out.print(" last name: "+part[1]);
		   System.out.print(" age: "+part[2]);

		}	
}