package day61_Collections;

import java.util.*;

public class MapFrequency {
	public static void main(String[] args) {

		String[] arr1 = { "Zubeyir", "Hubeyit", "Hubeyit", 
				"Behcet", "Behcet", "Suayip", "Angutyo", 
				"Zubeyir","Zubeyir" };

		List<String> liste = new ArrayList<>();
		
		//adding items to the list
		for (String eachName : arr1) {
			liste.add(eachName);
		}

		// Creating a map
		Map<String, Integer> freqMap = new HashMap<>();

		// add item to map and icrement by 1 if it is in the list
		// to show duplicates
		for (String namey : liste) {

			if (!freqMap.containsKey(namey)) {

				freqMap.put(namey, 1);

			} else {
				Integer county = freqMap.get(namey);
				freqMap.put(namey, county + 1);
			}
		}

		System.out.println(freqMap);
	}
}
