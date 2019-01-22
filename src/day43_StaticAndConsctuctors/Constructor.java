package day43_StaticAndConsctuctors;

public class Constructor {
	
// runs automatically whenever we create object of the class
// gets the same class name
// Can be overloaded
// if no constructor added to a class, compiler will add a default no-args constructor
// It can be used to assign default values or specific values to variables

	private String brand;
	
	public Constructor(String brand) {
		
		this.brand = brand;
	}
	
	public Constructor() {
		
		brand = "kekeque";
	}
	
	Constructor cellPhone = new Constructor();

}



