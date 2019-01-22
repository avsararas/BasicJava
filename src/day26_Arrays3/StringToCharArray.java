package day26_Arrays3;

public class StringToCharArray {

	public static void main(String[] args) {

		String word= "imporohe";
		
		char[] letter = word.toCharArray(); // make with [] to store a char array
		
		for (char c : letter) {
			System.out.println(c);     // To print each char in one line
		}
		
		String country = "Zimbabwe";
		
		char[] reversed = country.toCharArray();
		
		for (int i = reversed.length-1; i >= 0; i--) { // to read from reverse
			
			System.out.print(reversed[i]);
			
		}
		

	}

}
