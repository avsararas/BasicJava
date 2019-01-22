package day49_Inheritance3;

public class Animal {
	
	  public Animal() { // Constructor runs whenever a new object is created
	  
	  }
		public Animal(String race) { // This will limit the object creation due to one arg defined
		
		System.out.println("Animal object is created constructor");
	}
		
		public void speak() {
			
			System.out.println("zooort");

		}

}
