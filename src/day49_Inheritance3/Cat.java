package day49_Inheritance3;

public class Cat extends Animal{
	public Cat() { // Constructor runs whenever a new object is created
		
		super("tekir"); // super is invisibly there by the compiler
		
		System.out.println("Cat object is created constructor");
		
	}
	
	@Override // tag
	public void speak() {
		
		System.out.println("Cat says maaaauw");

	}

}
