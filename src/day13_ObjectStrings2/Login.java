package day13_ObjectStrings2;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		String user= new String("admin");
		String pass= new String("abc123");
		String say="";
		
		System.out.println("Enter Username:");
		String un=scan.next();
		
		if (un.equalsIgnoreCase(user)) { // non case sensing username check
			
			//if (!un.equalsIgnoreCase(user)) ! is for not equals when needed
			
			System.out.println("Enter Password:");
			String pw=scan.next();
			if (pw.equals(pass)) {
				say="Successful Login!";
			
			}else {
				say="Bad Password!";
			}
			
		}else {
			System.out.println("Bad Username");
		}
		scan.close();
		System.out.println(say);
	}
}
