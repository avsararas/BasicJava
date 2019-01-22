package day19_Loops;

import java.util.Scanner;

public class WarmUp {
	public static void main(String[] args) {
		
		// First letter capitalization
		
		Scanner keyb = new Scanner(System.in);
		
		System.out.println("Please Enter a Word: ");
		
		String entry = keyb.nextLine();
		
		String first= entry.substring(0, 1).toUpperCase();
				
		String rest= entry.substring(1).toLowerCase();
		
		System.out.println(first+rest);
	
		//----Count from 1 to 10 in the same line
		
		int num = 0;
		
		while (num<10) {
			 
			num++;
			  
			System.out.print(num+" "); // print instead of println
		}
		
		System.out.println(" ");
		
		//----Count from 10 to 1 in the same line
		
		int num2 = 11;
		
		while (num2 > 1) {
			
			num2--;
			  
			System.out.print(+num2+" ");	
		}
		
		keyb.close();
	}
}
