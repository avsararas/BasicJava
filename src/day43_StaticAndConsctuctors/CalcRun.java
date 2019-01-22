package day43_StaticAndConsctuctors;

public class CalcRun {
	
	// Static methods cannot use non-static variables
	
	public static void main(String[] args) {
		
	System.out.println(Calc.plus(34, 33)); // static method called
		
	System.out.println(Calc.minus(123, 33)); // second static method called
		
	// Calc.multiply(4,4);  non-static method called, will not work, object needed
		
	Calc test = new Calc(); // object set
		
	System.out.println(test.multiply(4, 5)); // now works under the object
		
	System.out.println(test.plus(3, 5)); // object can also call a static method
	
	// Calc.operation = "add"; will not work, non -static
	
	test.operation = "math calculator"; // works
	}
}
