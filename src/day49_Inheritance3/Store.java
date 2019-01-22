package day49_Inheritance3;

public class Store {
	private String type; // setter getter done below
	private double rent; // setter getter done below

	public Store(String type) {
		System.out.println("Store constructor with type " + type);
	}
	
	public Store(double rent) {
		this.rent = rent;
		System.out.println("Store constructor with rent " + rent);
	}
	
	public Store(String type, double rent) {
		System.out.println("Store constructor with both " +type+" "+rent);
		this.type = type;
		this.rent = rent;
	}
	
	public double getRent() {
		return rent;
	}

	public void setRent(double rent) {
		this.rent = rent;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
}
