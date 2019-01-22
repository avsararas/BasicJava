package day33_Methods4;

import java.util.Scanner;

public class CalculatorReturn {
	
	public static void main(String[] args) {
		
		calc();
	}
	
	public static double calc() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter two numbers: ");
			
		double n1=input.nextDouble();
		double n2=input.nextDouble();
		
		System.out.println("Please choose (1) plus,(2) minus,(3) multiply,(4) divide: ");
		
		int operator = input.nextInt();
		
		double add=n1+n2;
		double subtract=n1-n2;
		double multiply=n1*n2;
		double divide=n1/n2;
		double result=0;
		
		
		
		switch (operator) {
		case 1:  result=add;  break;
		
		case 2: result=subtract;    break;
		
		case 3: result=multiply;    break;
		
		case 4: result=divide;  break;

		default:   System.out.println("Invalid Operator");
		
			}
		
		System.out.println(result);
		
		input.close();
		
		return result;
		
		
	}
	
}


