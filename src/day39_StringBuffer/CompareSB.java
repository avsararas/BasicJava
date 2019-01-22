package day39_StringBuffer;

public class CompareSB {
	public static void main(String[] args) {
		
// To compare StringBulder objects we need to convert them to strings first
		
		StringBuilder b1 = new StringBuilder("java");
		StringBuilder b2 = new StringBuilder("java");
		
		System.out.println(b1==b2); //False, both are different objectwise
		
		System.out.println(b1.equals(b2)); // False; it does == comparison too
		
		System.out.println(b1.toString().equals(b2.toString())); // True; compares converted strings
	
		StringBuilder b3 = b1;
		
		System.out.println(b3==b1); // True; b3 points b1's location
		
		b3.append(" zortingen");
		
		System.out.println(b3+" "+b1);

	}

}
