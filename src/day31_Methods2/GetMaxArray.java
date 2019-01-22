package day31_Methods2;

import java.util.Arrays;

public class GetMaxArray {
	
	public static void main(String[] args) {
		
		
		int arr[] = {34,5,6,67,778,990}; // enter array here to be calculated at the bottom
		
		getMax(arr); // Brings the value calculated from the bottom
		
		// Or
		
		getMax(new int[] {343,46,456,4523,23,23}); // Define the array and get calculation
		
	}
	
	// Below is the method for the array
	
	public static void getMax(int nums[]) {
		
		if (nums.length == 0) {
			System.out.println("Array is empty");
			return;
		}
		
		Arrays.sort(nums);
		
		System.out.println(nums[nums.length-1]);
			
	}
}
