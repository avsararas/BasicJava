package Assignments;

public class MwS_LimitString {
	public static void main(String[] args) {
		
		limit("zortingen", 3);
	}
	
	public static String limit(String text, int maxLength)
	  {
	    
		text=text.substring(0, maxLength);
		
		return text;
	  }
	
}
