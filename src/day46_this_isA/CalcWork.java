package day46_this_isA;

public class CalcWork {
public static void main(String[] args) {
	
	Calc c = new Calc(); // create c object
	
	c.plus(10); // add 10
	
	System.out.println(c.getResult()); // see the result
	
	c.plus(5).plus(15).plus(10).plus(3).minus(3); // add chained methods
	
	System.out.println(c.getResult()); // see the result

}
}
