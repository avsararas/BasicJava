package day31_Methods2;

import java.util.Scanner;

public class StepsMethod {
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter any number:");
		
		steps(input.nextInt());
		
		input.close();
	}
	

// Method for stepping with an int parameter, if negative print "Jump" that many times,
// if 0, Print "Sit", if positive take steps...
	
		public static void steps(int num) {
		
		if (num==0) {
			System.out.println("Sit");
		}else if (num > 0) {
			
			for (int i = 1; i < num; i++) {
				System.out.println("Take "+i+" steps");

			}
			
		}else {
			
			for (int i = num; i < 0; i++) {
				System.out.println("Jump "+i*-1+" steps"); // turn it to positive

			}
			
		}
			
	}

}
