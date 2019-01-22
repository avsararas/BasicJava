package day54_Polymorphism;

public class Child extends Parent{
	
	// downcasting or upcating is needed to have super objects to to sub methods
	
	// polymorhipsm only works on instance methods
	
	public void talk() {
		System.out.println("Child Talks");
	}
	
	public void cry() {
		System.out.println("Child cries");
	}

	public static void main(String[] args) {
		
		long a  = (long) 10; //upcasting
		
		int b = (int) a; // downcasting
		
		Parent p1 = new Child(); // is-a reference type		
		
		Parent p2 = (Parent) new Child(); // upcasing
		
		Child c1 = (Child) p1; // downcasting
		
		((Child) p1).cry(); // upcasting for parent to cry
		
		
	}

}
