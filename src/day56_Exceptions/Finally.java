package day56_Exceptions;

public class Finally { // similar to default in switch case
	
public static void main(String[] args) {
		
		System.out.println("Program Started");
		
		try {
						
			System.out.println("Inside try block");
			
			String a = null;
			
			System.out.println(a.length());
			
			// System.exit(0); // shuts down the JVM
			
			
		} catch (NullPointerException e) { // will only catch this type of error
			
			// do this when the exception occur
			System.out.println("Null Exception happens in catch block 1 ");
			System.out.println(e.getCause());
			
		}finally { // runs regardelss of exception cautgh or not

			
			System.out.println("Finally Block");
		}
		
		
		
		System.out.println("Program reaches the end");
	}
}
