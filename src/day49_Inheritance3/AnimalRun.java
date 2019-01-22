package day49_Inheritance3;

public class AnimalRun {
	public static void main(String[] args) {
		
		Animal cat = new Cat(); // runs parent class too, goes to parent classes constructor
		
		Animal it = new Dog();
		
		cat.speak();
		
		it.speak(); // overriding Animals speaking 'zort'
		
		
	}

}
