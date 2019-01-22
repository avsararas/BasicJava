package day57_Exceptions;

public class TryCatchFinally {
	
	public static void main(String[] args) {
		
		try {
			
			Thread.sleep(9000); // sleep method of Thread class
			
			System.out.println("abc".charAt(10)); // outOfBounds exception
			
		}catch (InterruptedException e) {
			System.out.println("abc".charAt(10));

		}catch (Exception e) { // genral exception can catch all
			System.out.println("abc".charAt(10));
		}
		
		System.out.println("abc");
	}

}
