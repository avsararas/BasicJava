package day37_ArrayList2;

import java.util.*;

public class RandomArrayList {
	public static void main(String[] args) {
		
		
		System.out.println(buildIntList(20)); // gets qty and generates a list
		
		ArrayList<Integer> newList = buildIntList(50);
		
	}
	
	// Returns an ArrayList of random numbers
	
	public static ArrayList<Integer> buildIntList(int count){
	
	Random random = new Random();
	
	ArrayList<Integer> returnList = new ArrayList<>();
	
	for (int i = 0; i < count; i++) {
		returnList.add(random.nextInt(5)); // Randomize up to 5 only
	}
	
	return returnList;

}
}