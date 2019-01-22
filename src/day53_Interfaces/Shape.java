package day53_Interfaces;

// default behavior for interface is abstract for all

public abstract class Shape implements drawable { // getting interface

	String name;
	
	public Shape(String name) {
		
		this.name=name;
	}
	
	abstract void calcA();

}
