package day09_Conditionals3;

import java.util.Scanner;

public class TollRoad {
public static void main(String[] args) {
	Scanner keyb= new Scanner(System.in);
	System.out.println("Enter Miles: ");

	double miles=keyb.nextDouble();
	double toll=0;
	
	if (miles>0 && miles<=100) {
		toll=5;
	}else if (miles>=101 && miles<=500) {
		toll=8;
	}else if (miles>=501 && miles<=1000) {
		toll=10;
	}else if (miles>=1000) {
		toll=12;
	}else {
		System.out.println("invalid miles");
	}
	
	if (miles>0) { //This is important
		System.out.println("Your fee is $"+toll);

		}			keyb.close();

	}
}

