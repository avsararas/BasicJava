package Assignments;

import java.util.Scanner;

public class MethodsPrintNext3 {
	
	public static void main(String[] args) {
		
		 Scanner inp = new Scanner(System.in);
	     System.out.print("enter number");
	     int num = inp.nextInt();
	
	     nexts(num);	
	}
	
	public static void nexts(int num) {
		
		System.out.println((num+1)+" "+(num+2)+" "+(num+3));
		
	}
}
