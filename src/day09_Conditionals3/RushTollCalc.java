package day09_Conditionals3;

import java.util.Scanner;

public class RushTollCalc {
	public static void main(String[] args) {
		
		double toll=0;
		char rush;
		
		
		Scanner keyb= new Scanner(System.in);
		
		System.out.println("Enter Miles: ");
		double miles=keyb.nextDouble();
		
		System.out.println("Rush Time y/n?: ");
		rush = keyb.next().charAt(0);
		
		if (miles>0 && miles<=100) {
			if (rush=='y' || rush=='Y') {
				toll=10;
			}else {
				toll=5;
			}
		}else if (miles>=101 && miles<=500) {
			if (rush=='y' || rush=='Y') {
				toll=16;
			}else {
				toll=8;
			}
		}else if (miles>=501 && miles<=1000) {
			if (rush=='y' || rush=='Y') {
				toll=20;
			}else {
				toll=10;
			}
		}else if (miles>=1000) {
			if (rush=='y' || rush=='Y') {
				toll=24;
			}else {
				toll=12;
			}
		}else {
			System.out.println("invalid miles");
		}
		
		if (miles>0) { //This if is important
			System.out.println("Your fee is $"+toll);

			}			keyb.close();

		}
	}