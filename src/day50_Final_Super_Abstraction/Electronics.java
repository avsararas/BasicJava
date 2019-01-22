package day50_Final_Super_Abstraction;

public class Electronics extends SuperProduct{
	
	private double price;
	
	public Electronics(String name, double price) {
		super(name); // calls the parent class constructor
		this.price=price;
	}
	
	public Electronics() {
		super("zort"); // or setName("zart");
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		//return "Name: " + getName() + " | Price: " + price;
		return super.toString() + " | Price: " + price; // call toString of parent
		
	}
	
	public void buy() { // method from the parent is called
		super.buy();
		System.out.println("Total is "+price);
		
	}
}
