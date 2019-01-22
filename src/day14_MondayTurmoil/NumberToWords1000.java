package day14_MondayTurmoil;

import java.util.Scanner;

public class NumberToWords1000 {
	public static void main(String[] args) {
		Scanner keyb= new Scanner(System.in);
		
		System.out.println("Enter a Number between 0 and 1000: ");
		int no=keyb.nextInt();
		
		String say="";
		
		if (no<0 || no>1000) {
			say="Please enter a valid number";
		}else if (no>) {
			
		}
		
		switch (no) {
		case 1:
			say="One";
			break;
		case 2:
			say="Two";
			break;
		case 3:
			say="Three";
			break;
		case 4:
			say="Four";
			break;
		case 5:
			say="Five";
			break;
		case 6:
			say="Six";
			break;
		case 7:
			say="Seven";
			break;
		case 8:
			say="Eight";
			break;
		case 9:
			say="Nine";
			break;
		case 10:
			say="Ten";
			break;

		default:
			say="Please Enter between 1 to 10";			
			break;
		}
		System.out.println(say);
		keyb.close();
}
}