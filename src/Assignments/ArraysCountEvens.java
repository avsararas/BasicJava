package Assignments;

import java.util.Scanner;

public class ArraysCountEvens {
	public static void main(String[] args) {

		// Given an array nums, calculate count of even numbers in
		// nums and print out to console.

		Scanner input = new Scanner(System.in);

		int[] nums = { input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt() };

		int count = 0;

		for (int i = 0; i <= nums.length - 1; i++) { // -1 prevents out of bounday error

			if (nums[i] % 2 == 0) {
				count++;
			}
		}
		System.out.println("Count of even number are: " + count);

		input.close();
	}
}