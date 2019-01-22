package day28_Arrays5;

import java.util.Arrays;

public class CopyOf {

	public static void main(String[] args) {

// Copy an array into another array with specified index positions to stop.
		
		int a[] = {34,657,341,3,54,3423,23};	

		int b[] = Arrays.copyOf(a, 11);	// copies index items  0,1,2 not 3 others are turned 0
		
		System.out.println(Arrays.toString(b));

		
	
	}
}
