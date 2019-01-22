package day40_CustomClasses;

public class Movie {

	// class is a template for objects

	String name;
	int length;
	double price;

	public void watch() { // static is not used

		System.out.println("Watching Movie " + name + " for " + length + " minutes");
	}

	public void buy(double price) { // static is not used

		System.out.println(" costs " + price);
	}
}
