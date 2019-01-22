package day18_Review2;

public class DynamicSubstring {
	public static void main(String[] args) {
		
		String sentence= "We are learning zimbabwean language happily";
		
		int  start = sentence.indexOf("learning"); // will pull data as integer from sting value
		
		int end = sentence.indexOf("language");

		String picked = sentence.substring(start+"learning".length(), end+"language".indexOf(0));	
		
		System.out.println(picked.trim());
	}
}
