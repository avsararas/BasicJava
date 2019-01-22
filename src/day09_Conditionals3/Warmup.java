package day09_Conditionals3;

import java.util.Scanner;

public class Warmup {
	public static void main(String[] args) {
		
		Scanner keyb= new Scanner(System.in);
		System.out.println("Enter 3 Numbers");
		
		int num1, num2, num3, max;
		
		num1 =keyb.nextInt();
		num2 =keyb.nextInt();
		num3 =keyb.nextInt();
		
		//&& operator is needed
		
		if (num1>=num2 && num1>=num3) {
			max = num1;
		}else if (num2>=num1 && num2>=num3) {
			max = num2;
			
		}else {
			max = num3;
		}
		System.out.println("Max Number is: " +max);
		keyb.close();
	}

}
