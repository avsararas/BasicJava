package day14_MondayTurmoil;

import java.util.Scanner;

public class DiscountCalculator {
	public static void main(String[] args) {
		
		Scanner keyb= new Scanner(System.in);
		
		System.out.println("Enter Unit Price: ");
		
		double price=keyb.nextDouble();
		
		System.out.println("Enter Quantity: ");

		int qty=keyb.nextInt();
		
		double total=0;
		double grand=0;
		
		String discount="";
		
		if (qty<100) {
			grand=total;
			total=price*qty;
		
		}else if (qty>=100 && qty <120) {
			grand=price*qty;
			total=(price*qty)*0.90;
			discount="10%";
			
		}else {
			grand=price*qty;
			total=(price*qty)*0.85;
			discount="15%";
		}
		
		System.out.println("Grand Total: $"+grand);
		System.out.println("Discount: "+discount);
		System.out.println("Discount Applied: $"+(grand-total));
		System.out.println("Total: $"+total);
		keyb.close();
	}
}
