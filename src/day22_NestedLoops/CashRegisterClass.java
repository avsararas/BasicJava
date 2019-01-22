package day22_NestedLoops;

import java.util.Scanner;

public class CashRegisterClass {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double price = 0;
		double totalPrice = 0;

		String items = "";
		String item = "";

		System.out.println("How many items did you buy?");
		int itemcount = scan.nextInt();

		for (int i = 1; i <= itemcount; i++) {

			System.out.println("What is item " + i + "?");
			item = scan.next();

			System.out.println("How much is " + item + "?");
			price = scan.nextDouble();

			items = items + item + ",";
			totalPrice = totalPrice + price;

			// delete the comma at the end

			if (i == itemcount) {
				items = items + item;
			} else {
				items = items + item + ",";
			}

		}

		System.out.println("Your items are " + items);
		System.out.println("Total Price is $" + totalPrice);

		scan.close();
	}
}
