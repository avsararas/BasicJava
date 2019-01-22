package day42_Encapsulation2;

public class Car { // class is done for car objects on another class with main method

	private String type;
	private String make;
	private String model;
	private int speed;
	
	public Car() { // same name with class
		           // a constructor is a special method runs every time with object
		System.out.println("Car class constructor");
		type= "unknown";
		make="unknown";
		model="unknown";
		
		// it provides default values instead of null
	}
	
	public Car(String type, String make, String model) { // second constructor with args
		System.out.println("3 args constructor");
		this.type=type;
		this.make=make;
		this.model=model;
	}

	public void Accel(int mph) {

		speed += mph;

		System.out.println(make + " " + type + "" + " is accelaring");
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

}
