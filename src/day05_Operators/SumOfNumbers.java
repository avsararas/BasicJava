package day05_Operators;

import java.util.Scanner;

public class SumOfNumbers {
	public static void main(String[] args) {
		
		Scanner n1= new Scanner(System.in);
		System.out.println("Enter Number One ");
		int one= n1.nextInt();
		
		Scanner n2= new Scanner(System.in);
		System.out.println("Enter Number Two ");
		int two= n2.nextInt();


		Scanner n3= new Scanner(System.in);
		System.out.println("Enter Number Three ");
		int three= n3.nextInt();
		
		System.out.println("The Result is: "+(one+two+three));
		
		n1.close();
		n2.close();
		n3.close();

	}

}
