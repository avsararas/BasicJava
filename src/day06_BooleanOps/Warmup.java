package day06_BooleanOps;

import java.util.Scanner;

public class Warmup {
	public static void main(String[] args) {
		
		Scanner keyb= new Scanner(System.in);
		
		System.out.println("Enter Miles: ");

		double miles=keyb.nextInt();
		
		double km=(miles*1.6);
		
		int result = (int) Math.round(km);
			
		System.out.println("It makes " +result +" kilometers" ); 

		keyb.close();
	}

}
