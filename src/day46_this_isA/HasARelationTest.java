package day46_this_isA;

public class HasARelationTest {
	
// Has-a relation is classes containing each other
	
// testing 'has a' for car and engine classes
	
// for example System.out.println() has a PrintStream variable called out, system is a class 
// out is static variable, println() is a method belongs to out variable to print out console
	
	public static void main(String[] args) {
		
		Engine V6 = new Engine(); // engine object
		
		V6.cylinders=6;
		V6.horsepower=300;
		
		Car ford = new Car(); // car object
		
		ford.model="Micro";
		ford.engine=V6;
		
		System.out.println(ford.model);
		System.out.println(ford.engine.cylinders);
		
		Car zastava = new Car();
		zastava.model="Yugo";
		zastava.engine= new Engine();
		zastava.engine.cylinders=2;
		zastava.engine.horsepower=30;
		
	}

}
