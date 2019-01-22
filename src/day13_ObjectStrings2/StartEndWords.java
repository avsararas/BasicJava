package day13_ObjectStrings2;

import java.util.Scanner;

public class StartEndWords {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter Word 1 of 2:");
		String w1=scan.next();
		
		System.out.println("Enter Word 2 of 2:");
		String w2=scan.next();
	
		int w1n = w1.length();
		int w2n = w2.length();
		String say="";
		
		if ((w1n!=5) || (w2n!=5)) {
			say="Words Must have 5 Characters Exactly";

		}else if (w1.charAt(0)==w2.charAt(4) ) {
			say="First Letter and Last Letter are the Same!";
		}else if (w1.charAt(4)==w2.charAt(0) ) {
			say="Fizz!";
		}else {
			say="Buzz!";
		}
		scan.close();
		System.out.println(say);
}
}
