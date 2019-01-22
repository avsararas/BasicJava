package day28_Arrays5;

import java.util.Arrays;

public class ArraysSort {

	public static void main(String[] args) {
		
		// SORT method of arrays class
		
		int nums[] = {34,657,341,3,54,3423,23};
		
		StringBuilder sorted = new StringBuilder();

		
		for (int i : nums) {
		
			Arrays.sort(nums); // sorts number before printing

			sorted.append(i+",");
		}
		
		
		System.out.println(sorted);
	}
}
