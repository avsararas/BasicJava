package day54_Polymorphism;

public class AnimalRun {

	public static void main(String[] args) {
		
		Object suluk = new Leech(); // Object class can be used directly
		// suluk. will not show animal properties
	
		
		Animal tapiry = new Tapir(); // Polymorphed reference from Animal to Tapir
		tapiry.makeNoise();
		
		
		Animal leechy = new Leech();
		leechy.makeNoise();
		
		Animal aunty = new Ant();
		aunty.makeNoise();
		
		Animal[] hayvanat = {tapiry,leechy,aunty}; // Object array
				
		for (Animal each : hayvanat) {
			each.makeNoise();
		}
		
	
	}
}
