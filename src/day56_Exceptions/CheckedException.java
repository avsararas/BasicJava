package day56_Exceptions;

import java.io.FileNotFoundException;

public class CheckedException {
	
	public static void main(String[] args) {
		
		// subclass exceptions can be caught by superclass type exceptions
		
		System.out.println("ABC");
		
		FileNotFoundException e = new FileNotFoundException(); // checked exception
		
		NullPointerException z = new NullPointerException(); // unchecked, runtime
		
		ArithmeticException a = new ArithmeticException(); // unchecked, runtime
		
		try {
			throw e;
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
		
		
		
	}

}
