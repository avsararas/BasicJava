package day20_Loops;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		
		Scanner keyb = new Scanner(System.in);
		
		System.out.println("Please enter a word:");
		
		String word= keyb.next();
		
		String reverse="";
		
		for (int index = word.length()-1; index >= 0; index--) { // Counting Reverse

			reverse = reverse + word.charAt(index); // or reverse +=word.charAt(index);
		}
		
		System.out.println(reverse);
		keyb.close();
	}
}
