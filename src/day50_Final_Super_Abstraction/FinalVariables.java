package day50_Final_Super_Abstraction;

public class FinalVariables {
	
	/*Final makes the variable constant and the value gets fixed.
	Local, Instance and Static variables can be set as final
	Local means inside the method.
	Static Final variable = same line or initializer block
	*/
	
	
	private final String ZORT = "Kabob"; // can be set here too
	
	final public static  double MAX_TEMP = 1000; // order is flexible
	
	private final static String NAME; // static block can be used
	
	
	static {
		
		NAME="Kamil";
	}
	
	public static void main(String[] args) {
		
		final int MAX = 121; // final is uppercase as a convention
		
		//MAX=110; Will not compile
		
		System.out.println(MAX);
		
		final int[] NUMS = new int[] {10,200,3000}; // Array object
		
		NUMS[0]=20; // Will work
		
     // int[] NUMS = new int[] {14,244,340}; // cannot reassign it to new object
		
		final String CITY = "Yozgat";
		
		System.out.println(CITY.toUpperCase()); // Will work
		
		
		
		
	}

}
