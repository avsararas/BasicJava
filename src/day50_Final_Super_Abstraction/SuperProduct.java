package day50_Final_Super_Abstraction;

public class SuperProduct {

// super() calls the parent constructor
// super. will access super class and methods

	private String name; // nobody can access except this class
	
	public static final boolean DISCOUNT = true;

	public SuperProduct() {

		name = "noname";

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public SuperProduct(String name) {

		this.name = name;

	}

	public String toString() {
		return "Name: " + name;
	}
	
	public void buy(){
		System.out.println(name+" is puchased");
	}
}
