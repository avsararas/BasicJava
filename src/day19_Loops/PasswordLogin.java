package day19_Loops;

import java.util.Scanner;

public class PasswordLogin {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String pass;

		String key = "abc";
		

		do {

			System.out.println("Enter your password: ");
			pass = scan.nextLine();

		} while (!pass.equals(key));
		System.out.println("You are logged in! ");

		scan.close();

	}
}
