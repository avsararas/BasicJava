package day56_Exceptions;

public class TryCatch {
	
	public static void main(String[] args) {
		
		System.out.println("Program Started");
		
		try {
			
			// error causing code goes here
			
			System.out.println("Inside try block");
			
			String a = null;
			
			System.out.println(a.length());
			
			
		} catch (NullPointerException e) { // will only catch this type of error
			
			// do this when the exception occur
			System.out.println("Null Exception happens in catch block 1 ");
			System.out.println(e.getCause());
			
		}catch (ArrayIndexOutOfBoundsException e) {

			
			System.out.println("Array Exception Happens in catch block 2");
		}
		
		
		
		System.out.println("Program reaches the end");
	}
}
