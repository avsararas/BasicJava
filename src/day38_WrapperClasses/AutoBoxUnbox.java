package day38_WrapperClasses;

import java.util.ArrayList;
import java.util.List;

public class AutoBoxUnbox {
	public static void main(String[] args) {
		
		// Autoboxing: Primitives become a Wrapper Class Object
		// Unboxing: Extracting a wrapper class object to a primitive
		
		// Autoboxing
		
		int n = 100;
		
		Integer n2 = n; // taking a primitive and autoboxing it to a wrapper class object
		
		Integer n3 = 4; // Declaring 4 as an object
		
		double d1= 5.4;
		
		Double d2 = d1; // Double d2 is now a wrapper class object
		
		boolean b=true;
		
		Boolean b2=b; // Boolean b2 is now a wrapper class object
		
		List<Integer> nums = new ArrayList<>(); // ArrayList takes all autoboxed
		
		nums.add(332);
		int z= 333;
		nums.add(z); // added z as autoboxed
		nums.add(new Integer(66));
		
		System.out.println(nums); // Print nums ArrayList contents
		
		
		// Unboxing
		
		int r= nums.get(0); // Took a number object and assigned to an int unboxed
		
		Boolean bool = new Boolean(false);
		boolean boolPrim = bool;
		System.out.println(boolPrim);
		
		Character ChO = '^'; // Autoboxing
		char c=ChO; // Unboxing ^ from Wrapper Object Class 
		
		System.out.println(c);
		
		Integer intob = new Integer(233);
		int num = 233;
		
		if (intob == num) { // Unboxing happens to primitive
			System.out.println("pass");
		}else {
			
			System.out.println("fail");
		}

		
		
	}

}
