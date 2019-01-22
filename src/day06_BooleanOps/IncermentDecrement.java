package day06_BooleanOps;

import java.util.Scanner;

public class IncermentDecrement {
	public static void main(String[] args) {
		Scanner keyb= new Scanner(System.in);

		int windowspc=35;
		
		//Post Increment
		
		windowspc +=10; //Adds 10 mere with shorthand operator
		windowspc ++; // Adds one more to the variable defined above
		
		//Pre Increment
		++windowspc;

		System.out.println("Number: " +windowspc);
		
		int mac=5;
		
		System.out.println("Mac: " +mac);
		
		int macbook=mac++;

		System.out.println("Macbook: " +macbook);
		
		int a=1;
		System.out.println(a);
		System.out.println(a++);
		System.out.println(a);
		System.out.println(++a);
		System.out.println(a);
		
		int d,e;
		d=1;
		e=d++;
		System.out.println("e:"+e);
		System.out.println("d:"+d);

	keyb.close();
	}
}
