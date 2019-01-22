package day37_ArrayList2;

import java.util.*;

public class MethodsAcceptAL {

	public static void main(String[] args) {
		
		ArrayList<Integer> nums = new ArrayList<>(); // nums to be provided in ArrayList format
		nums.add(1000);
		nums.add(4000);
		nums.add(5000);
		
		System.out.println(nums); // show nums given
		
		System.out.println(sum1(nums)); // add nums using sum1 method
		
		ArrayList<Integer> numbers = new ArrayList<>(); // nums to be provided in ArrayList format
		nums.add(8000);
		nums.add(7000);
		nums.add(2340);
		
		ArrSum(nums,numbers); // Adds tow ArrayLists using ArrSum mehtod below
		
		System.out.println(ArrSum(nums, numbers));
		
	}
	// for each loop type
	public static int sum1(ArrayList<Integer> nums) { // returns int, takes an ArrayList
		
		int sum=0;
		
		for (Integer num : nums) {
			
			sum=sum+num; // sum+=num;
		}
		
		return sum;
	}
		//for loop type
		public static int sum2(ArrayList<Integer> nums) {
		
		int sum=0;
		
		for (int i = 0; i < nums.size(); i++) {
			
			sum+=nums.get(i);
		}
		
		return sum;
	}
		
		// Method to add two ArrayLists
		public static int ArrSum(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
		
		int sum=0;
		
		for (Integer num : nums1) {
			sum+=num;
		}
		
		for (Integer num : nums2) {
			sum+=num;
		}
		
		return sum;
	
}
}