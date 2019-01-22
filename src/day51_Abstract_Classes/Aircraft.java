package day51_Abstract_Classes;

public abstract class Aircraft { // final and astract words cannot be together

	public abstract void fly(); // abstract method 

	public class Plane extends Aircraft {
		@Override
		public void fly() { // overriden from Aircraft
			System.out.println("flying");
		}
		

	class Jet extends Plane {
		@Override
		public final void fly() { // this cannot be overriden anymore
			System.out.println("flying");
		}

	 }
 }
}