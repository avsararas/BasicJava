package Assignments;

public class MwS_CleanString {
//This method gets two strings (text and badWord)  and returns a string.

	public static void main(String[] args) {
		
		
		
		System.out.println(clean("boklu bok sulu", "bok"));
	}
	
	
	public static String clean (String text ,String badWord) {

	    text=text.replace(badWord, "");
		
		return text;
	  }

}
