package day4_Operators;

public class ageCalc {
	public static void main(String[] args) {
		// calculate the age per birth year
		
		int currentYear=2018;
		int birthYear=1902;
		int age= currentYear-birthYear;
		
		//Put all in a string then print it out
			
		String sentence="If you are born in " + birthYear + ", you are " + age + " years old.";
	
		System.out.println(sentence);

	}

}
