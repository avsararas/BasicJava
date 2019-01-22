package day33_Methods4;

public class StringMethodCount {
	
	// count how many times a string happens to be in another
	
	public static void main(String[] args) {
		
		System.out.println(countTimes("hahahahhaha", "a"));
		
		System.out.println(countTimes2("keheheheehehe", "e"));
		
		System.out.println(countTimes3("zuhahahahahahaha", "h"));
	}
	
	public static int countTimes(String one, String two) { // takes strings returns an int
		
		int counter=0;
		
		for (int i = 0; i < one.length(); i++) {
			
			if (one.charAt(i) == two.charAt(0)) {
				
				counter++;
			}
		}
		
		return counter;
	}
	
	// another way of matching chars
	
	public static int countTimes2(String one, String two) {
		
		String arr[] = one.split(two); // splits by using the second char
		
		return arr.length-1; // gives the result of that chars length -1
	}
	
	// third way
	
	public static int countTimes3(String one, String two) {
		
		int onelen = one.length();
		
		one=one.replace(two, ""); 
		
		int twolen = one.length();
		
		return onelen-twolen;
		
	}
}
