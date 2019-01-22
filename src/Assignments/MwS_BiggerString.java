package Assignments;

public class MwS_BiggerString {
	public static void main(String[] args) {
//the method gets two strings and return the longest one
	
		System.out.println(reverse("zimbabwe"));
	}
	
	public static String reverse(String input) {
	    
		String rev="";
		
		for (int i = input.length()-1; i >= 0; i--) {
			
			rev+=input.charAt(i);
		}

	    
	    return rev;
	  }
}
