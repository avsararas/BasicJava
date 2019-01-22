package day07_Conditonals;

import java.util.Scanner;

public class Warmup {
	public static void main(String[] args) {
		Scanner keyb= new Scanner(System.in);

		System.out.println("Enter USD amount: ");
		double usd=keyb.nextDouble();
		
		double rate=250.3;
		
		System.out.println("$"+usd+" makes " +(usd*rate)+" Yemeni Rials" ); 

		keyb.close();

	}
}
