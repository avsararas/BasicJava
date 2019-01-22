package day13_ObjectStrings2;

import java.util.Scanner;

public class StringEquality {
	public static void main(String[] args) {
		
		
		
		String s1= "armudh";
		String s2= "qeleque";
		String s3= "qeleque";
		
		System.out.println(s2==s2); // Will result be TRUE
		
		String s4= new String("armudh");
		String s5= new String("qeleque");
		
		System.out.println(s1==s3); // FALSE in comparison per memory
		
		System.out.println(s2.equals("qeleque")); // 
	
		System.out.println(s2.equalsIgnoreCase("hello")); // Will result be TRUE
		
		System.out.println(s2.equals("qeleque")); // Will result be TRUE
	
	
	}

}
