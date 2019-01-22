package day10_Conditionals4;

import java.util.Scanner;

public class FizzBuzz {
	public static void main(String[] args) {
		
		Scanner keyb= new Scanner(System.in);
		System.out.println("Enter Number: ");
		String say = "";
		
		int number=keyb.nextInt();
		
		if (number%3==0 && number%3==0 ){
			say="Fizz Buzz!";
		}else if (number%3==0) {
			say="Buzz!";
		}else if (number%5==0) {
			say="Buzz!";
		}else {
			say="Chirp Chirp!";
		}
		System.out.println(say);
		keyb.close();
	}
}
