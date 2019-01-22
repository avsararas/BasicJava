package day43_StaticAndConsctuctors;

public class AtDinner {
	
	public static void main(String[] args) {
		
		Dinner dad = new Dinner();
		Dinner mom = new Dinner();		
		Dinner kid = new Dinner();	
		
		System.out.println("Pizza slices "+ mom.pizzaSlice);
		
		dad.takeSlice(3);
		mom.takeSlice(2);
		kid.takeSlice(1);
	
		System.out.println("Pizza slices "+ Dinner.pizzaSlice);
		System.out.println(dad.pizzaSlice);

		

		
	}

}
