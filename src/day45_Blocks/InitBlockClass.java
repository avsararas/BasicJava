package day45_Blocks;

public class InitBlockClass {

// Initializer block has a similar idea to constructor to run before the constructor
// it runs when you create an object

	{ // empty curly brace outside the method
		System.out.println("Initalizer Block runs everytime an object created");
	}

	public InitBlockClass() {

		System.out.println("This is a constructor, runs everytime an object created");

	}
	
	public static void staticMethod() {
		System.out.println("Static Method");
		
	}
	
	static {
		
		System.out.println("Static Block Added");
	}
}
