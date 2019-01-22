package day47_Inheritance1;

//Inheritance in Java.
//
//OOP:
//	- encapsulation
//	- inheritance
//	- abstraction
//	- polymorphism
//
//in a single class we can put:
//	- instance variable
//	- methods
//	- constructor(s)
//	- static block
//	- init block
//	- static methods
//	- static variables
//
//	=> inner classes
//
//	==> import statements
//	==> package statement
//=============================
//
//Inheritance:
//	=> When one class acquires/inherits variables and methods from another class.
//
//	Parent class
//	Child class inherits methods and variables from parent class.
//
//	IS-A relation
//
//	Parent class: Drink 
//	Child class: Coffee 
//
//	Coffee IS-A drink
//	Tea IS-A drink
//	Smoothie IS-A Drink
//
//extends keyword is used to establish inheritance relation between classes
//Parent class: Drink 
//Child class: Coffee 

public class Vehicle {
	
	public String makeModel;
	public int year;
	public int maxSpeed;
	private int doorNo; //private member will not be inherited to sub classes
	
	public void drive() {
		System.out.println("Running");
	}
	public void stop() {
		System.out.println("Stopped");
	}
	
	public static void useHours() { // static method
		
		System.out.println("The vehicle is used for 900 hours");
	}
}
