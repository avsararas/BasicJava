package day55_Polymorphism;

public class PersonMain {
	
	// Overloading methods
	
	public static void main(String[] args) {
		
		Person meczub = new Person("Zubeyir", 25);
		Object dangalak = new Person("Sumeyye", 39);
		
		printPerson(meczub);
		printPerson(dangalak);
	}
	
	public static void printPerson(Object kabak) {
		
		System.out.println("Obect class method prints: "+kabak);
		System.out.println(kabak);
		
		Person hiyar = (Person) kabak; // cating to reach Person class
		
		System.out.println(hiyar.getAge());
	}
	
	public static void printPerson(Person kelek) {
		
		System.out.println("Person class method prints: "+kelek);
		System.out.println(kelek);
	}
}
