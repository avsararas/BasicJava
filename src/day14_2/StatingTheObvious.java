package day14_2;

import java.util.Scanner;

public class StatingTheObvious {
	public static void main(String[] args) {
		
		Scanner keyb= new Scanner(System.in);
		
		System.out.println("Enter Email");
		
		String entry=keyb.nextLine();
		
		int start=entry.indexOf("@");
		
		int end=entry.indexOf(".");
		
		System.out.println(start); // tells where the @ is
		
		System.out.println(entry.substring(start+1)); // +1 crops the @ and after

		System.out.println(entry.substring(end+1)); // +1 crops the . and after

		System.out.println(entry.substring(start+1,end)); // gives the domain only
	
}
}
