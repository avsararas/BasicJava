package day60_Collections;

import java.util.*;

public class MapRead {
	public static void main(String[] args) {

		Map<Long, String> gebe = new HashMap<>();

		gebe.put(11112l, "Zigot");
		gebe.put(11115l, "Cenin");
		gebe.put(11134l, "Embriyo");
		gebe.put(21124l, "Dolut");
		gebe.put(44532l, "Yumurta");

		System.out.println(gebe.get(11115l));
		
		// Set will provide the best value list
		Set<Long> allKeys =gebe.keySet();
		
		System.out.println(allKeys);
		
		// Super type collection since value types are not known
		Collection<String> vals = gebe.values();
		
		System.out.println(vals);
	}

}
