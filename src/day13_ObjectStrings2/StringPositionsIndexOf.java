package day13_ObjectStrings2;

public class StringPositionsIndexOf {
	public static void main(String[] args) {
		
		//INDEXOF METHOD
		
		String alphabet ="ABCDEFGHIJKLMNOPRSTOUVWXYZ";
		
		System.out.println(alphabet.indexOf("A")); // Gives the letter
		
		String sentence= "Today is Sunday which is very nice";
		
		System.out.println(sentence.indexOf("Sunday")); // Gives the letter
		
		System.out.println(sentence.lastIndexOf("a")); // Gives the letter from right

		System.out.println(sentence.indexOf("y",7)); // Gives the letter starting from 7th
	
		// CONTAINS METHOD
		
		String one="Tomorrow is nice";
		
		boolean b= one.contains("or");
		System.out.println(b); // TRUE
		
		// STARTSWITH METHOD
		
		String sample="Yesterday was sorrow";
		System.out.println(sample.startsWith("Y"));
		
		// ENDSWITH METHOD
		
		String test="We are not smart";
		System.out.println(test.endsWith("t"));
		
		// ISEMPTY METHOD
	
		String what="This is the end of examples";
		System.out.println(what.isEmpty()); // Checks if anything is there
	}
}
