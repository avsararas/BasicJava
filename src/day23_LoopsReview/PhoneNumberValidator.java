package day23_LoopsReview;


import java.util.Scanner;

public class PhoneNumberValidator {
	public static void main(String[] args) {
		int i = 0;
		String num = "", matchess = ".*[a-z,A-Z,() -/, :-@].*";
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a phone number");
		num = scan.nextLine();
		
		if (num.length() != 12 && num.length() != 10) {
			System.out.println("Invalid length,phone number must be either 12 or 10 characters.");
		}
		if (num.startsWith("(") && num.charAt(4) != ')') {
			System.out.println("Invalid format - parenthesis placed incorrect or any of it is missing");
			return;
	        }
		    if(num.charAt(0)=='('&&num.charAt(4)==')') {
		    num= num.substring(1,4)+num.substring(5);
		    if(num.matches(matchess)) {
			System.out.println("Invalid character - must be a number between 0-9");
			return;
		    }
		    }
		    if(num.matches(matchess)) {
				System.out.println("Invalid character - must be a number between 0-9");
				return;
			    }
		    
         System.out.println("Number validated");
         
         scan.close();
	}
}
