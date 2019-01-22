package day31_Methods2;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		
// Accepts 2 arguments/parameters/inputs in form of double variable		
// 1 adds
// 2 subtracts
// 3 multiplies
// 4 divides
		
	Scanner input = new Scanner(System.in);
	
	System.out.println("Please enter two numbers: ");
		
	double n1=input.nextDouble();
	double n2=input.nextDouble();
	
	System.out.println("Please choose (1) plus,(2) minus,(3) multiply,(4) divide: ");
	
	int operator = input.nextInt();
	
// Below calls the method to do operations, assigning n1 to num1, n2 to num2

	switch (operator) {
	case 1: add(n1,n2);   break; 
	
	case 2: subtract(n1, n2);    break;
	
	case 3: multiply(n1, n2);    break;
	
	case 4: divide(n1, n2);  break;

	default:   System.out.println("Invalid Operator");
	
		}
	input.close(); // Scanner closes here
	
	}
	
	// Same variables can be used in methods
	
	public static void add(double num1, double num2) { // adding method
		double result = num1+num2;
		System.out.println(result);
	}
	
	public static void subtract(double num1, double num2) { // subtract method
		double result = num1-num2;
		System.out.println(result);
	}
	
	public static void multiply(double num1, double num2) {//multiply method
		double result = num1*num2;
		System.out.println(result);
	}
	
	public static void divide(double num1, double num2) { // divide method
		
		if (num2 == 0) {
			System.out.println("Error"); // cannot be divided by 0
		} else {
			
			double result = num1/num2;
			System.out.println(result);
		}	
	}
}
