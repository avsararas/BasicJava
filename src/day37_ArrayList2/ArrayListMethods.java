package day37_ArrayList2;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods {
	
	public static void main(String[] args) {
		
		// ArrayLists of produce in 5 ways
		
				ArrayList<String> fruits = new ArrayList<>();
				List<String> veggies = new ArrayList<>();
				List<String> trees = new ArrayList<>();
				
				ArrayList<String> herbs = new ArrayList<>(fruits);
				//List<String> plants =
						
//				fruits.add(2,"Grape");
//				fruits.add(1,"Banana");
//				fruits.add(0,"Berry");
//				fruits.add("Orange");
//				fruits.add("Strawberry");
		
		
		List<Integer> nums = new ArrayList<>(); // are integer objects
		
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		
		nums.remove(3); // removes index position which is number 5
		
		nums.remove(new Integer(3)); // removes 3 as an Integer
		
		System.out.println(nums);
		
	
	}

}
