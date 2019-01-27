package day60_Collections;

import java.util.*;

public class MapSample {
	public static void main(String[] args) {
		
		// maps are not itrable; standalone
		// stores key and item pairs with 'put' method
		
		Map<String, Integer> medalmap = new HashMap<>();
		
		medalmap.put("Zimbabwe", 345);
		medalmap.put("Tanzanya", 23);
		medalmap.put("Chad", 789);
		medalmap.put("Kenya", 45);
		medalmap.put("Gana", 2);
		
		System.out.println(medalmap);
		
		// CRUD - Create, Read, Update, Delete
		
		System.out.println(medalmap.get("Gana"));
		
		medalmap.replace("Kenya", 444);
		
		System.out.println(medalmap.get("Kenya"));
		
		Map <Long, String> bebek = new HashMap<>();
		
		bebek.put(11112l, "Zigot");
		bebek.put(11115l, "Cenin");
		bebek.put(11134l, "Embriyo");
		bebek.put(21124l, "Dolut");
		bebek.put(44532l, "Yumurta");
		
		System.out.println(bebek.get(11115l));
	
		
	}
}
