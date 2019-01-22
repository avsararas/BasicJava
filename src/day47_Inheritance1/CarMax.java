package day47_Inheritance1;

import day42_Encapsulation2.carMax;

   public class CarMax { 
// public class CarMax extends Object - is done in the background, 'Object' is the root class
	   
	public static void main(String[] args) {
		
		Vehicle anadol= new Car(); // Polymorphism object example
		
		anadol.makeModel="A1";
		// anadol.doorNo; - this is not visible
		
		// is-a relations below
		
		// new object from Vehicle class
		
		Vehicle truck = new Vehicle(); 
		truck.makeModel="Bedford";
		truck.year=1973;
		truck.maxSpeed=80;
		//truck.hp=90; will not work
		
		truck.drive();
		truck.stop();
		
		// Car class is getting all from the Vehicle class
		
		Car zastava = new Car(); 
		zastava.makeModel="Yugo";
		zastava.maxSpeed=50;
		zastava.year=1969;
		
		zastava.hp=40; // exclusive to Car class
		
		zastava.drive();
		zastava.stop();
		
		// amtrak object derived from Train class inherited from Vehicle class
		
		Train amtrak = new Train();
		
		amtrak.makeModel="A1";
		amtrak.year=1990;
		amtrak.maxSpeed=120;
		amtrak.TicketPrice=30.0;
		
		amtrak.drive();
		amtrak.leaveStation();
		
		// tesla object comes from Car class
		
		elCar tesla = new elCar();
		
		tesla.makeModel="T1";
		tesla.amps=50;
		tesla.hasLipo=true;
		
		tesla.charge();
		elCar.useHours(); // static reach by using the subclass or main class name
		
		
		
	
	}

}
