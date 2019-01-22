package day50_Final_Super_Abstraction;

public class SuperTest {
	public static void main(String[] args) {
		
		SuperProduct p1 = new SuperProduct("Nintendo");
	
		System.out.println(p1.toString());
		
		Electronics sanyo = new Electronics("Sanyo",212); // use the 2 param constructor
		
		System.out.println(sanyo.toString());
		
		sanyo.buy(); // calls both parent and child buy methods 
		
		System.out.println(Electronics.DISCOUNT); // final var is inherited

	}

}
