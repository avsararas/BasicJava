package WarmUps;

import java.util.Scanner;

public class PhoneNumberValidator {

	public static void main(String[] args) {

		Scanner keyb = new Scanner(System.in);
		
		System.out.println("Please enter Phone Number:");

		String phno = keyb.nextLine();
		
		String goodphno = "";
		
		String msg="";

		if (phno.length()!=10 && phno.length()!=12 ) {
			
			msg="invalid length - must be either 12 or 10 characters";
			
		}else if (phno.charAt(0)!='(' && phno.charAt(4)!=')') {
			
			msg="Invalid format -there is no closing parenthesis.";
		}else {
			goodphno=phno.replace("(", "").replace(")", ",");

		}
		
		
		System.out.println(msg);
		
		// Loop to check if each character is between 0-9

		for (int i = 0; i < goodphno.length(); i++) {
			
			if(!(goodphno.charAt(i) >= '0' && phno.charAt(i) <= '9')) { //NOT condition
				
				System.out.println("Enter Numbers Only");
			}
		}
		
		System.out.println("All numbers detected");
	}

}
