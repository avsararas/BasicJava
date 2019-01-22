package day57_Exceptions;

public class MethodException {
	
	// throw - throws eception to program
	// throws - goes to method header only
	
	public static void main(String[] args) throws Exception { // general Exception
		
		waitFewSecs(5); // needs throws on the method
		
	}
	
	public static void waitFewSecs(int second) throws InterruptedException {
		
		System.out.println("Wait started");
		
		Thread.sleep(second * 200);
		
		System.out.println("Wait ended");

	}

}
