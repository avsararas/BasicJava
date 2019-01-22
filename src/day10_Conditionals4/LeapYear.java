package day10_Conditionals4;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner keyb= new Scanner(System.in);
		System.out.println("Enter Year: ");
		
		int year=keyb.nextInt();
		String result="";
		
		if ((year%4)==0 && (year%100)!=0 ||(year%400)==0) {
			result="a leap year.";
		}else {
			result="not a leap year.";
		}
		System.out.println("The year entered is " +result);
		keyb.close();
	}
}
