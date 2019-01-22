package day28_Arrays5;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		
	// Array must be sorted for BinarySearch to work
		
	String word[] = {"armut","elma", "kabak", "hiyar", "karpuz", "ahlat", "erik", "muz"};
	
	Arrays.sort(word);
	
	System.out.println(Arrays.toString(word));
	
	System.out.println(Arrays.binarySearch(word, "kabak")); // shows the index of kabak
		
	}

}
