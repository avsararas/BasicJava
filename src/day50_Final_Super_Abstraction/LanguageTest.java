package day50_Final_Super_Abstraction;

public class LanguageTest {
	public static void main(String[] args) {
		
		OOP lan1 = new OOP();
	
		System.out.println(lan1.name); // prints child class name variable
		
		lan1.printName();
		
		Language.speak(); // static method is called
		
	}

}
