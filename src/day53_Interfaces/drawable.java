package day53_Interfaces;

public interface drawable {
	
	// all vars become final CONSTANTS
	
	static final String COLOR="RED";
	
	void draw(); // if there is no method body it will still be public and abstract
	
	public abstract int drawLine(String s);
	
	public default void drawSquare() { // sublcasses are not obliged to override this
		
		System.out.println("Implentation"); // default method with a body
	}
	
	public static void doStatic() { // static method also has a body
		System.out.println("This is a static method in interface");
	}
	
	// The same or more visible access modifier is needed
	// pub > pub
	// pro > pro, pub
	// def > def, pro, pub
	// private > only visible in the same class, no inheritance

}
