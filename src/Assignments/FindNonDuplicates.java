package Assignments;

import java.util.Scanner;

public class FindNonDuplicates {
	public static void main(String[] args) {
		
// Given an array nums with 7 integers every element is 
// repeated twice - except one. Find that element and print it to console.
		
		Scanner input = new Scanner(System.in);
	    int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
	
	    for (int outer = 0; outer < nums.length; outer++) {
			
			int currentNum = nums[outer];
			
			boolean duplicate  = true;

			for(int inner = 0; inner < nums.length; inner++) {
								
				if (currentNum==nums[inner] && outer !=inner) { // outer/inner checks positions to be same
					
					duplicate  = false;
					break; // breaks from inner loop	
				}
			}
			
			if (duplicate == true) { // it will not print duplicate number and skip
			System.out.print(currentNum); // print each time in the loop
						
			}
		}
	
	
	}

}
