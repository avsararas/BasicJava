package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class DecimalToBinary {
	public static void main(String[] args) {
		
// Given an int variable decimal,  write java program to 
// calculate binary value of the decimal variable and assign it binary array. 
// print out value of binary array matching below format. 
	
		Scanner input = new Scanner(System.in);
	    
	    int decimal = input.nextInt();
	    int[] binary = new int[8];
	    
	    if (decimal<=255) {
	    
	    for (int i = 0; i < binary.length; i++) {
			
	    	binary[binary.length-i-1]=decimal%2;
	    	decimal=decimal/2;
	    	
		    //System.out.print(decimal+" ");

		}
	    System.out.println(Arrays.toString(binary));
	    	
	    } else {
	    	System.out.println("Please enter less than 255");

		}
	    
	    input.close();
	}
}
