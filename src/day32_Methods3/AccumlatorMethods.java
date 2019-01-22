package day32_Methods3;

import java.util.Scanner;

public class AccumlatorMethods {
	
// get stars accepts int and returns that many stars
	
	public static void main(String[] args) {
		
		System.out.println(stars());		
	}
	
	public static String stars() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a star count:");
		
		int num=scan.nextInt();
		
		String star="*";
				
		for (int i = 1; i < num; i++) {
			
			star = star + "*";
					
		}
		
		return star; // returns the value in string form
				
	}

}
