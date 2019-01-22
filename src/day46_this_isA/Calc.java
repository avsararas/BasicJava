package day46_this_isA;

	public class Calc {
		
// this means in general 'this instance (object)'
// this keyword works similar in string builder's .append function
	
	private int result;
	
	public Calc plus(int num) {
		result += num;
		return this; // returns the same object will the data
	}
	
	public Calc minus(int num) {
		result -= num;
		return this;
	}

	public int getResult() { // public getter for result
		
		return result;
	}
}
