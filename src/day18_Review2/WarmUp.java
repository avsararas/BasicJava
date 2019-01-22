package day18_Review2;

import java.util.Scanner;

public class WarmUp {
	public static void main(String[] args) {

		Scanner keyb = new Scanner(System.in);

		System.out.println("Enter Months");
		int age = keyb.nextInt();

		String say = "";

		if (age <= 1300 && age > 0) { //nested if stack

			if (age <= 12 && age > 0) {
				say = "an infant";
			} else if (age > 12 && age < 36) {
				say = "a toddler";
			} else if (age > 36 && age < 60) {
				say = "a pre-school kid";
			} else if (age > 60 && age < 144) {
				say = "a school-age kid";
			} else if (age > 144 && age < 156) {
				say = "an adolescent";
			} else if (age > 156 && age < 216) {
				say = "a young adult";
			} else if (age > 216 && age < 480) {
				say = "a middle age adult";
			} else {
				say = "an older adult";
			}

			System.out.println("You are " + say+" with " +age/12+ " years and "+age%12+ " months old.");
		
		} else {
			System.out.println("Enter a valid month ");

		}
		keyb.close();
	}
}
