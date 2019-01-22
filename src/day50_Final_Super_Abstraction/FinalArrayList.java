package day50_Final_Super_Abstraction;

import java.util.ArrayList;
import java.util.List;

public class FinalArrayList {
	
	public static void main(String[] args) {
		
		final List<String> PRODUCTS = new ArrayList<>();
		PRODUCTS.add("water");
		PRODUCTS.add("Cookies");
		PRODUCTS.add("Coffee");
		
		System.out.println(PRODUCTS);
		
		PRODUCTS.remove("Cookies");
		System.out.println(PRODUCTS);
		
		//PRODUCTS = new ArrayList<>(); <== cannot re-assign to new object

		
	}

}
