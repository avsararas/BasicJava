package day32_Methods3;

import java.util.Scanner;

public class MethodParamReturn {
	public static void main(String[] args) {
		
		buildEmail();
		
	}
	
	public static String buildEmail() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Name?");
		
		String firstname=scan.next().toLowerCase();
		
		System.out.println("Last Name?");
		
		String lasttname=scan.next().toLowerCase();
		
		return firstname;	
	}
}
