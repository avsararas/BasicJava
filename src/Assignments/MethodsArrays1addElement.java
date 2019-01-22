package Assignments;

import java.util.Arrays;

public class MethodsArrays1addElement {

	public static void main(String[] args) {

		int arr1[] = { 4, 5, 6, 7, 23 }; // initialize arr1 here

		int arr2[] = { 6, 7, 8, 9, 2 }; // initialize arr2 here
		
		int Sum[]= addElements(arr1, arr2); // Store values in a new array

		System.out.println(Arrays.toString(addElements(arr1, arr2))); // Print the result
		
		// or
		
		int Sum2[]=addElements(new int[] {8,4,5,3,2},new int [] {5,6,2,1,6});
		
		System.out.println(Arrays.toString(Sum2)); // Print the result

		
	}
	
	
	// method below

	public static int[] addElements(int[] ints1, int[] ints2) {

		int total[] = new int[ints1.length];

		for (int i = 0; i < ints2.length; i++) {

			total[i] = ints1[i] + ints2[i];

		}

		return total;

	}

}
