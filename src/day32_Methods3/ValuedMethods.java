package day32_Methods3;

public class ValuedMethods {
	
	public static void main(String[] args) {
		
		int amount=greed(); // gets the value from the method below
		
		System.out.println(amount);
		
		System.out.println(name()); // gets the name String below
		
		String email=name()+lastName()+"@zortmail.cuz";
		
		System.out.println(email);
	}
	
	// opposite of void methods to return a value
	
	public static int greed() { // int variable instead of void, called 'return' type
		
		int num = 4;
		
		return num;
	}
	
	public static String name() {
		
		String name="soumeiyyeah";
		return name;	
	}
		
	public static String lastName() {
		
		String last="Yanchek";
		return last;
	}
	

}
