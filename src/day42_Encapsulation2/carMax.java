package day42_Encapsulation2;

public class carMax {
	public static void main(String[] args) {
		
		Car car1= new Car(); // Object 1
		
		car1.setMake("Zastava");
		car1.setModel("Yugo");
		car1.setType("nano car");
		car1.setSpeed(30);
		
		Car car2= new Car(); // Object 2
	
		car1.Accel(20); // send 20 to Accel method and print info
		
		System.out.println("Current speed is "+ car1.getSpeed());
		
		System.out.println(car2.getMake()); // unknown taken form Car() constructor
		
		Car car3=new Car("Reno", "zibin","rhr");
		
		System.out.println(car3.getMake()); // getting from the second constructor
		
		
		
	
	}

}
