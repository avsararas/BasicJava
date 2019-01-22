package day56_Exceptions;

public class Pipe {
	
public static void main(String[] args) {
		
		System.out.println("Program Started");
		
		try {
			
			// error causing code goes here
			
			System.out.println("Inside try block");
			
			String a = null;
			
			System.out.println(a.length());
			
		// Pipe "|" catches multiple exceptions in one statement	
			
		} catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
			
			// do this when the exception occur
			System.out.println("Null Exception happens in catch block 1 ");
			System.out.println(e.getCause());
		}
		System.out.println("Program reaches the end");
	}
}