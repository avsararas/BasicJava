package day10_Conditionals4;

import java.util.Scanner;

public class SwitchStatementIntro {
	public static void main(String[] args) {
		Scanner keyb= new Scanner(System.in);
		System.out.println("Enter Rating: ");
		
		int rating=keyb.nextInt();
		
		switch (rating) { // Allows char, byte, short, enum in and String instead of if's Boolean only
		
		case 1: System.out.println("Fine");
			break;
		
		case 2: System.out.println("All Right");
			break;
		
		case 3: // Those cases will show the same message on the end
		
		case 4: // Those cases will show the same message on the end
		
		case 5: System.out.println("Not Good");
			break;
		
		default: System.out.println("Please enter a value between 1 to 3."); //Has no value assigned
			break;
		}
		
		keyb.close();
	}

}
