package day28_Arrays5;

import java.util.Arrays;

public class ToString {
	public static void main(String[] args) {
		// A special method for all objects
		
		int nums[] = {34,657,341,3,54,3423,23};	
		
		System.out.println(Arrays.toString(nums)); // easier to list what's inside without foreach
		
		Arrays.sort(nums);
		
		System.out.println(Arrays.toString(nums)); //sorted output

	}

}
