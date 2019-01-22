package day39_StringBuffer;

public class AppendAlphabet {
	public static void main(String[] args) {
		
		// Appending all letters to a String Builder object using for loop
		
		char ch= 'A';
		ch++;
		
		System.out.println(ch);
		
		StringBuilder alphabet = new StringBuilder();
		
		for (char chars='A' ; chars <= 'Z'; chars++) {
			
			alphabet.append(chars);
			
		}
		
		System.out.println(alphabet); // print all letters from A to Z
		
	}
}
