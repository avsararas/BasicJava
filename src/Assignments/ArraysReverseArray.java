package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysReverseArray {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
	    int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
	   
	    int temp[] = new int[nums.length];
	    	    
	    for (int i = nums.length-1 ; i >= 0 ; i--) {
			
	    	temp[i]=nums[nums.length-1-i]; // means: i=7 nums.lenght-1 - 7 which is 0
	    }
	    
	    nums=temp; // copy arrays to another like this
	    
	    //Do not change below statement:
	    System.out.println(Arrays.toString(nums));

		input.close();
	}

}
