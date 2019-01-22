package day45_Blocks;

public class StaticBlock {

// Static block can be inserted in a class and code within that block runs 
// only once whenever a class is first used.
// If  there is static variables, lists initialized one time. Like connection a database
// before any other code runs.
	
	static { // static block 1
		
			System.out.println("Static Block, runs once and first");
	}
	
	
	static { // static block 2, this is not common 
		
		System.out.println("Static Block, runs once and second");
}
	
	public StaticBlock() {
		
		System.out.println("Constructor, I run every time of object creation");
	}
	
	public static void StaticBlock() {
		
		System.out.println("Static Block Method");
	}
}
