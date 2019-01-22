package day14_2;

public class StringAndValues {
	
	static String str; // Valueless declaration default 0
	
	
	public static void main(String[] args) {
		
		System.out.println(str); // will print null
		
		String str;
		
		str = "a";
		
		System.out.println(str); // will print a
		
		str = str + "armud";
		
		System.out.println(str); // will print aarmud

		
	}

}
