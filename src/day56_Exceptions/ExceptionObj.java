package day56_Exceptions;

public class ExceptionObj {
	
	// Exceptions are objects
	
	public static void main(String[] args) {
		
		String[] str = new String[3];
		
		str[0]="a";
		str[1]="b";
		str[2]="c";
		
		String[] str2 = {"A","B","C"};
		
		
		System.out.println(str2[4]); // shows error
		
		ArrayIndexOutOfBoundsException zort = new ArrayIndexOutOfBoundsException(); // way 1
		
		throw new ArrayIndexOutOfBoundsException(); //way 2
		
		
	}

}
