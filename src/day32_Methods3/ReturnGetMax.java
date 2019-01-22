package day32_Methods3;

public class ReturnGetMax {
	
	
	public static void main(String[] args) {
		
		System.out.println(getMax(32, 345)); // return the calculation below
		
		
		System.out.println(getMax3(343, 999, 5));
	}

	
	public static int getMax(int num1, int num2) {
		
		int max;
		
		if (num1>num2) {
			max=num1;
		} else {
			max=num2;
		}
		
		return max;
	}
	
	public static int getMax3(int n1, int n2, int n3) { // returns the largest of 3 numbers
		
		if (n1>n2 && n1>n3) {
			return n1;    // using return multi values
		}else if (n2>n3) {
			return n2;
		}else {
			return n3;
		}
		
	}
	
	
}
