package day45_Blocks;

public class Blocks {
	
	// Running Order: Static Block > Initializer Block> Constructor
	
	static int num = 100; // attached to Blocks class
	static String str;    // attached to Blocks class
	
	//#1
	static { // Static Block runs only one time
		
		num += 1000;
		str = "Kabob";
	}
	//#2
	{ // initializer block
		num += 500; 
		str += " zord";
	} 
	//#3
	public Blocks() { // constructor
		
		num *= 2;
		str += " !?";
	}
	

}
