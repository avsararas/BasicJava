package day33_Methods4;

public class CalculatorReturn2 {

	public static double add(double n1, double n2) {

		double result = n1 + n2;
		return result;
	}

	public static double subtract(double n1, double n2) {

		double result = n1 - n2;
		return result;
	}

	public static double multiply(double n1, double n2) {

		double result = n1 * n2;
		return result;
	}

	public static double divide(double n1, double n2) {

		if (n2 == 0) {
			System.out.println("Error"); // cannot be divided by 0
			return-1; // need to return something anyways
		} 
			
			double result = n1/n2;
			return result;
	}

}
