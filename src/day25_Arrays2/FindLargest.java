package day25_Arrays2;

import java.util.Scanner;

public class FindLargest {
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("How many numbers?");
		int count = scan.nextInt();
		
		int nums[]= new int[count]; // create array called nums depending on the scanner input

		for(int i=0; i<count; i++) {
		
			System.out.println("Please enter number "+(i+1));
			
			nums[i]=scan.nextInt();
		}
	
		for (int n : nums) { // print all nums
			System.out.print("You entered "+n+", ");
		}
		System.out.println();// print an empty line
		
		int largest = nums[0];
		
		for (int num : nums) {
			if(num>largest) {
				largest=num;
			}
		}
		
		
		System.out.println("Largest is " +largest);
		
		
		
		scan.close();
	}
}
