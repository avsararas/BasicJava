package day22_NestedLoops;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("How Many Items do you buy?");

		int itemcount=scan.nextInt();
		double price;
		int total=0;
		
		String item="";

		for (int num = 1; num < itemcount; num++) {
			
			
			System.out.println("What is item " +num);
			item=scan.next();
			System.out.println("Hom much is " +item+ "?");
			
			price=scan.nextDouble();

			total+=price;	
		}
		
		System.out.println("Your total is: "+total );

		scan.close();
	}
}
