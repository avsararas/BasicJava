package Assignments;

public class MwSUniqueChars {

	public static void main(String[] args) {
		
	    System.out.println( uniqueChars("wooden-spoon") ) ;

	}
	
	public static String uniqueChars(String str) {	    
		
		String uniq="";
		
		for (int i=0 ; i < str.length() ; i++) {
						
			String letter = str.substring(i,i+1);
			
			if (!uniq.contains(letter)) {
				
				uniq += letter;
				
			}
		}
		
		return uniq;
	}
}