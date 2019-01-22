package day28_Arrays5;

import java.util.Arrays;

public class CompareArrays {
	public static void main(String[] args) {
		
		int arr1[] = {56,23,656,67};
		
		System.out.println(Arrays.toString(arr1));
		
		int arr2[] = arr1;
		
		System.out.println(Arrays.toString(arr2));
		
		System.out.println(arr1==arr2); // prints equals true referring to same memory
		
		System.out.println(Arrays.equals(arr1, arr2));
		
		int arr3[]= {56,23,656,67};
		
		System.out.println(arr1==arr3); // false looking at different memory
		
		System.out.println(Arrays.equals(arr1, arr3)); // true comparing contents actually
		
		
	}

}
