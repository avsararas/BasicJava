package day05_Operators;

public class ShortHandOps {
	public static void main(String[] args) {
		
		int apples = 5;
		apples += 10;
		System.out.println("Apple count is " +apples); 
		
		int cars = 23;
		cars -=10;
		System.out.println("Number of Cars "+cars); 
		
		double pizza = 12;
		pizza /=5;
		System.out.println("Pizza Slice per Person "+pizza); 
		
		int mins = 100;
		int hours = mins/60;
		System.out.println(("Remaining : "+hours)+(mins)); 

	}

}
