package day38_WrapperClasses;

public class CreatingWrapperClasses {
	public static void main(String[] args) {
		
		Integer n1 = new Integer (100); // int changed to an object
		Integer n2 = Integer.valueOf(456);
		Integer n3 = Integer.parseInt("45623"); // Covert string to numbers
		
		//Double d1 = new Double (123.45);
		//Double d2 = new Double.valueOf(32.34);
		
		Character ch1 = new Character('A');
		Character ch2 = Character.valueOf('h');
		
		char ch3='4';
		
		System.out.println(Character.isDigit(ch3)); // checks if the char is a number
		
		String str = "ab5c";
		
		System.out.println(Character.isAlphabetic(str.charAt(0))); // checks if a letter
		System.out.println(Character.isUpperCase(str.charAt(0))); // checks letter case
		
		System.out.println(Character.isLetterOrDigit(str.charAt(2))); // checks if a letter
		
		System.out.println(Character.isLetterOrDigit('%')); // checks if a letter

		
	}

}
