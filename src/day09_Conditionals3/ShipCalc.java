package day09_Conditionals3;

import java.util.Scanner;

public class ShipCalc {
	public static void main(String[] args) {
		
		Scanner keyb= new Scanner(System.in);
		System.out.println("Enter Speed 1 or 2: ");
		
		int speed=keyb.nextInt();
		
		System.out.println("Enter Price: ");
		double price=keyb.nextDouble();
		double cost=0;
		
		if (speed==1) {
			if (price>=1 && price <=100) {
				cost=17;
			}else if (price>=101 && price<=300) {
				cost=10;
			}else if (price>300) {
				cost=0;
			}
		}
		else if (speed==2) {
			if (price>=1 && price <=100) {
				cost=25;
			}else if (price>=101 && price<=300) {
				cost=21;
			}else if (price>300) {
				cost=5;
			}
		}

		System.out.println("Your Shipment will cost $"+cost);
		keyb.close();
	}
}
