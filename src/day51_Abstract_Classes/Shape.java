package day51_Abstract_Classes;

public abstract class Shape {

	String name;
	
	public Shape(String name) {
		
		this.name=name;
	}
	
	abstract void calcA();

}
