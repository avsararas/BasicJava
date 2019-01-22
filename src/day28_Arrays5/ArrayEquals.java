package day28_Arrays5;

import java.util.Arrays;

public class ArrayEquals {
	public static void main(String[] args) {
		
		// Equals compares two array's length and element's similarity
		
		
		int a[]= {10,20,30};
		
		int b[]= {10,20,30};
		
		int c[]= {10,20,30,90};
		
		int d[]= {10,20,30,90};
		
		System.out.println(Arrays.equals(a, b)); // TURE
		
		// Sort the d array compare with c
		
		Arrays.sort(d);
		
		System.out.println(Arrays.equals(d, c)); // TURE
		
		int x[] = a; // x array defined and assigned the same values
		
		System.out.println(x==a);
		
		

		
	}

}
