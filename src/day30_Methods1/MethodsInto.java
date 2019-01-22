package day30_Methods1;

public class MethodsInto {
	public static void main(String[] args) { //without the main method code will not execute
		
		sayHello(); // calls the custom method below
		sayBye();
		sayHi("armut");
	}

	public static void sayHello() {
		System.out.println("zord");
	}
	
	public static void sayBye() {
		System.out.println("zamazingo");
	}
	
	public static void sayHi(String name) { // assigned string to a method
		System.out.println("zord " + name);
	}
	
	// public is an access modifier
	// static is a modifier attached directly to the object
	// void is for method is not returning a value, does not produce anything
	
}
