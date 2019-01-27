package day61_Collections;

import java.util.*;

public class StoreList {
	public static void main(String[] args) {
		
		String[] arr1 = {"Zubeyir","Hubeyit","Hubeyit","Behcet","Behcet","Suayip"
				,"Angutyo","Zubeyir"};
		
		List<String> liste = new ArrayList<>();
		
		for (String eachName : arr1) {
			liste.add(eachName);
		}
		
		
		Iterator<String> myIter = liste.iterator();
		
		TreeSet<String> names = new TreeSet<>();
		
		while (myIter.hasNext()) {
			
			System.out.println(myIter.next()+" ");
		}
        
       
		SortedSet<String> set = new TreeSet<>(liste);
				
		System.out.println(set.size());
		
		System.out.println(Collections.frequency(liste, "Zubeyir"));
		
		SortedSet<String> kpSet = set.subSet("K", "P");
		
		System.out.println(kpSet);
		
		

	}

}
