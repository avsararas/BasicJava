package day14_2;

import java.util.Scanner;

public class AddsThings {
	public static void main(String[] args) {
		Scanner keyb= new Scanner(System.in);
	
		// concatenation, adding two string together
		
		String domain = "@kelek.com";
		
		System.out.println("Please enter you username: ");
		String entry=keyb.nextLine();
		
		System.out.println("This is your new email: ");
		System.out.println(entry.concat(domain));
		
	}

}
