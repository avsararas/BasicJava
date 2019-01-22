package day55_Polymorphism;

import java.util.*;

public class TV {
	public static void main(String[] args) {
		
		TV teve = new TV();
		System.out.println(teve.toString()); // non meaningful code
		
		List<Integer> liste = new ArrayList<>();
		liste.add(2);
		liste.add(4);
		
		System.out.println(liste.toString()); // calling toString from ArrayList as overriden

	}
	
	@Override
	
	public String toString() {
		
		return "teve is now overriden";
	}

}
