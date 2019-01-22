package day10_Conditionals4;

import java.util.Scanner;

public class SeasonsWarmUp {
	public static void main(String[] args) {
		Scanner keyb= new Scanner(System.in);
		System.out.println("Enter Number of the Month: ");
		
		int month=keyb.nextInt();
		String monthName="";
		String season="";
		
		if (month==1) {
			monthName="January";
		}else if (month==2) {
			monthName="February";
		}else if (month==3) {
			monthName="March";
		}else if (month==4) {
			monthName="April";
		}else if (month==5) {
			monthName="May";
		}else if (month==6) {
			monthName="June";
		}else if (month==7) {
			monthName="July";
		}else if (month==8) {
			monthName="August";
		}else if (month==9) {
			monthName="September";
		}else if (month==10) {
			monthName="October";
		}else if (month==11) {
			monthName="November";
		}else if (month==12) {
			monthName="December";
		}else {
			monthName=" Invalid Month ";
		}
		
		if (month==12 || month ==1 || month ==2) { // With equal logic
			season="Winter";
		}else if (month>=3 && month<=5) { //With AND logic
			season="Spring";
		}else if (month==6 || month ==7 || month ==8) {
			season="Summer";
		}else if (month==9 || month ==10 || month ==11) {
			season="Fall";
		}
	
		System.out.println("Name of the month is " +monthName+" and it is "+season+".");
		keyb.close();
	}
}
