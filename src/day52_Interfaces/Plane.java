package day52_Interfaces;

public class Plane implements Flyable, Movable{ // gets two interfaces
	
	int engineSize;
	int maxHeight;
	
	public static void main(String[] args) {
		
		Plane piper = new Plane();
		
		piper.move();
		piper.fly();
		
		
	}
	
	@Override
	public void fly() {
		System.out.println("Flying");
		System.out.println(MAX); // prints CONSTANT defined in the interface
		
		
	}
	
	@Override
	public void move() {
		System.out.println("Moving");
		
	}
}


