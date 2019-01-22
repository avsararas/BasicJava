package day33_Methods4;

import java.util.Scanner;

public class StringMethods {
	
	// Reverse method
	
	public static void main(String[] args) {
		
		System.out.println(reverse());
		
		reverse();
	}
	
	public static String reverse() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter text to be reversed:");
		
		String entry=scan.next();
		
		String reversed="";
		
		for (int i = entry.length()-1; i >= 0; i--) {
			
				reversed += entry.charAt(i);
		}
		
		scan.close();
		
		return reversed;
	}
}
