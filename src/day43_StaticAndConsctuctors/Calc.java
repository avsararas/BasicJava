package day43_StaticAndConsctuctors;

public class Calc {
	
	public String operation; 
	
	// static non-void methods 
	
	public static double plus(double n1, double n2) {
		return n1+n2;
	}
	public static double minus(double n1, double n2) {
		return n1-n2;
	}
	
	// non-static non-void methods
	
	public double multiply(double n1, double n2) {
		return n1*n2;
	}
	
	public double divide(double n1, double n2) {
		return n1/n2;
	}
	
	public static void multiply2(double n1, double n2) {
		// multiply(n1,n2); will not work, static cannot call non-static
	}

}
