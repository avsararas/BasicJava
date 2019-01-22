package day12_ObjectStrings;

public class StringClass {
public static void main(String[] args) {
	
	String name= "Armud"; //Directly Declaring a variable and Assigning a value
	
	System.out.println(name.toUpperCase()); // using builtin method
	System.out.println(name.toLowerCase());
	
	name= name.toUpperCase();
	System.out.println(name);
	
	
	String lastName= new String("Zord");
	
	System.out.println(lastName);
	
	System.out.println(name.length()); // () shows method like hiyar()
	
	System.out.println("zimbabwe".length());
	
	int count = name.length();
	
	System.out.println(name.charAt(4));
	
	
	
	}
}
