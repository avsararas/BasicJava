package day33_Methods4;

import java.util.Scanner;

public class ConverterUtil {

	public static void main(String[] args) {

		ftoc();
	}

// converter for various units

	public static double milekm() {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter miles:");

		double miles = scan.nextInt();

		double km = miles * 1.6;

		System.out.println(km);

		return km;
		
		// return miles*1.6; // is fine too

	}

	public static int ftoc() {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter F degrees:");

		int f = scan.nextInt();

		int c = ((f - 32) * 5) / 9;

		System.out.println(c);

		return c;

	}

}
