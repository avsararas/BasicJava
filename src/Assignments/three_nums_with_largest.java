package Assignments;

import java.util.Scanner;

public class three_nums_with_largest {

	public static void main(String[] args) {

		Scanner keyb = new Scanner(System.in);
		
		int max=-999999999;
		int min=999999999;
		
		int num;
		int total=0;
		
		for (int i = 1; i <= 3; i++) {
			
			System.out.println("Please enter number "+i+":");
			num=keyb.nextInt();
			
			if (max<num) {
				max=num;
			}
			if (min>num) {
				min=num;
			}
			
			total=total+num;
		}		
	
		System.out.println("The biggest number is "+max+", smallest number is "+min+ ", totals to "+total+".");
		
		keyb.close();
	}
}
