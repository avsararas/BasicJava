package day10_Conditionals4;

import java.util.Scanner;

public class TernaryOperator {
	public static void main(String[] args) {
		
		Scanner keyb= new Scanner(System.in);
		System.out.println("Enter Number: ");
		String say = "";
		
		int number=keyb.nextInt();
		
		if (number>=60) { // Made with if statement
			say="Pass";
		}else {
			say="Fail";
		}
		System.out.println(say);

		say = (number>=60) ? "You pass": "You fail";// Made with Ternary Operator
	
		
		System.out.println(say);
		keyb.close();
	}
}
