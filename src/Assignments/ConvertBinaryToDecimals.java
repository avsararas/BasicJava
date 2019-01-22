package Assignments;

import java.util.Scanner;

public class ConvertBinaryToDecimals {
	public static void main(String[] args) {
		
// Given an array binary with 8 integers (0s or 1s), write java program 
// to calculate decimal value and print out to console. 
// Feel free to use additional arrays or formulas.
		
// Example:binary -> [0, 0, 1, 0, 0, 0, 1, 1]
//		   print 35
		
		
		Scanner input = new Scanner(System.in);
	    
	    int[] binary = new int[8];
	    for(int i =0; i < binary.length; i++) {
	      binary[i] = input.nextInt();
	    }
	    
	   int sum=0;
	   
	   int factor=128; // this will be divided in two on each root
	   
	   for (int i = 0; i < binary.length; i++) { // set as 8 on top
		
		   sum = sum + binary [i]*factor;
		   
		   factor=factor/2;
	}
	   System.out.println(sum);
	   
	   input.close();
		
	} 		
}


