package day11_Swtich;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		
		Scanner keyb= new Scanner(System.in);
		
		System.out.println("Enter First Number: ");
		double num1=keyb.nextDouble();
		
		System.out.println("Enter Second Number: ");
		double num2=keyb.nextDouble();

		System.out.println("Enter Operator ");
		char op=keyb.next().charAt(0);
		
		double result=0;
		
		switch (op) {
		
		case '+':
			result = num1 + num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		default:
			System.out.println("Invalid Input");
			keyb.close();
			return; //get out of main method and stop running
		}
		System.out.println("Result is "+result);
	}
}
