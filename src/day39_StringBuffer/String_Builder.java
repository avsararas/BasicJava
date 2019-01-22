package day39_StringBuffer;

public class String_Builder {
	
	// StringBuilder is a class that allows Strings to be modified for better memory use
	// StringBuilder is mutable
	
	public static void main(String[] args) {
		
		StringBuilder stb1 = new StringBuilder("dingil");
				
		stb1.append (" tava"); // Append method adds a string to stringbuilder
		
		System.out.println(stb1);
		
		stb1.append ('&'); // can add a single char
		
		System.out.println(stb1);
		
		StringBuilder letters = new StringBuilder("KABOBSWABADDONGOT");
		
		letters.delete(0, 3); // deletes like substring using index boundaries
		
		letters.deleteCharAt(5); // deletes a single char
		
		letters.deleteCharAt(letters.length()-1); // deletes last char

		System.out.println(letters);
		
		letters.reverse(); // reverses the string
		
		System.out.println(letters);
		
		letters.insert(1, " ecnebi "); // adds another string to the index set

		System.out.println(letters);
		
		letters.replace(0, 3, " coart "); // Replaces the chars in the range given

		System.out.println(letters);
		
		letters.replace(letters.indexOf("DD"), letters.indexOf("D"), " hoppala "); // works with two letters
		
		System.out.println(letters);
		
	}

}
