package day18_Review2;

public class Strings1 {
	public static void main(String[] args) {
		
		String greeting = "Zordua";
		
		System.out.println(greeting.length()); //lenght of char
		
		int lange = greeting.length();
		
		System.out.println(greeting.charAt(0)); // first char
		
		char hebe = greeting.charAt(3);

		System.out.println(greeting.charAt(lange-1)); // last char
		
		char hodo = greeting.charAt(greeting.length()-1); // calling the method
	
		System.out.println(hodo);
		
		

	}

}
