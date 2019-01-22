package day29_MultiArrays;

import java.util.Arrays;

public class MultiDimArrays {

	public static void main(String[] args) {
		
		int nums [][]= new int [2][3]; // 2 Arrays with 3 nums
		
		nums[0][0]=10;
		nums[0][1]=20;
		nums[0][2]=30;
		
		nums[1][0]=40;
		nums[1][1]=50;
		nums[1][2]=60;
	
		System.out.println(nums[0][2]); // prints first array's second number
		
		System.out.println("Number of arrays "+nums.length); // How many arrays in nums array
		
		System.out.println("Number of items "+nums[0].length); // How many items in first array
		
		int nums2 [][]= {{10,20,30},{40,50,60}}; // another way to declare the same above

		double prices[][] = new double [3] []; // array content can be empty
		
		prices[0]= new double [] {23.34, 56.78, 67.44}; // set the array items here
		prices[1]= new double [] {123.4, 54.3}; // set the array items here with different qty
		prices[2]= new double [5];
		
		System.out.println(Arrays.deepToString(prices)); // shows all arrays with contents
		
	}
}
